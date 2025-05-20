package net.ceoofgoogle.createarmorblocks.block;

import com.simibubi.create.content.schematics.client.tools.ToolType;
import net.ceoofgoogle.createarmorblocks.CreateArmorBlocksMod;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import javax.annotation.Nullable;
import java.util.*;


public class BarbedWire extends HorizontalDirectionalBlock {
    public class BarbedWireHandler {
        public static final Map<UUID, BlockPos> breakingPlayers = new HashMap<>();
    }
    public static final VoxelShape NORTH_SHAPE = Block.box(0, 0, 0, 16, 15, 16);
    @Override
    public void playerDestroy(Level level, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        if (!level.isClientSide) {
          //debug  System.out.println("Destroyed BarbedWire with: " + tool);
            if (tool.getItem() instanceof ShearsItem) {
                //debug      System.out.println("Dropping BarbedWire!");
                popResource(level, pos, new ItemStack(this));
            }
        }
        super.playerDestroy(level, player, pos, state, blockEntity, tool);
    }

    public BarbedWire(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(FACING, Direction.NORTH));
    }

    @Mod.EventBusSubscriber(modid = CreateArmorBlocksMod.MODID)
    public class BarbedWireEvents {
        @SubscribeEvent
        public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
            if (event.phase != TickEvent.Phase.END) return;

            Player player = event.player;
            UUID id = player.getUUID();

            if (!BarbedWireHandler.breakingPlayers.containsKey(id)) return;

            BlockPos targetPos = BarbedWireHandler.breakingPlayers.get(id);
            Level level = player.level();
            BlockState state = level.getBlockState(targetPos);

            // If player stopped mining, cancel
            if (!player.swinging || !player.getMainHandItem().isEmpty() && player.getMainHandItem().is(Items.SHEARS)) {
                BarbedWireHandler.breakingPlayers.remove(id);
                return;
            }

            // Still on barbed wire block?
            if (state.getBlock() instanceof BarbedWire) {
                player.hurt(level.damageSources().cactus(), player.isSprinting() ? 2.0F : 1.0F);
            } else {
                BarbedWireHandler.breakingPlayers.remove(id);
            }
        }
    }
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection()
                        .getOpposite());
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        super.createBlockStateDefinition(builder);
    }
    @Override
    public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return Shapes.empty();
    }

    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        pEntity.makeStuckInBlock(pState, new Vec3(0.25D, (double)0.05F, 0.25D));
        pEntity.hurt(pLevel.damageSources().cactus(), 1.0F);
    }
    //@Override
    /*@Override
    public void attack(BlockState state, Level world, BlockPos pos, Player player) {
        if (!world.isClientSide) {
            ItemStack held = player.getMainHandItem();
            if (!held.is(Items.SHEARS)) {
                BarbedWireHandler.breakingPlayers.put(player.getUUID(), pos.immutable());
            }
        }
        super.attack(state, world, pos, player);
    }
    */
    @Override
    public void attack(BlockState state, Level world, BlockPos pos, Player player) {
        if (!world.isClientSide) {
            ItemStack held = player.getMainHandItem();
            if (held.isEmpty()) {
                BarbedWireHandler.breakingPlayers.put(player.getUUID(), pos.immutable());
            }
        }
        super.attack(state, world, pos, player);
    }


    @Override
    public float getDestroyProgress(BlockState state, Player player, BlockGetter world, BlockPos pos) {
        ItemStack item = player.getMainHandItem();
        if (item.is(Items.SHEARS)) return 0.05F; // ~3 seconds
        return 0.01F; // slow without shears
    }


    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter level, BlockPos pos) {
        return true;
    }
   /* @Override
    public void playerDestroy(Level level, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        if (!level.isClientSide) {
            if (tool.getItem() instanceof ShearsItem) {
                popResource(level, pos, new ItemStack(this));
            }
            // No drop if not using shears
        }
        super.playerDestroy(level, player, pos, state, blockEntity, tool);
    }

    */

}
