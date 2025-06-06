package net.ceoofgoogle.createarmorblocks.block;

import net.ceoofgoogle.createarmorblocks.CreateArmorBlocksMod;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class BarbedWire extends HorizontalDirectionalBlock {

    public BarbedWire(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(FACING, Direction.NORTH));
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
    public class BarbedWireHandler {
        public static final Map<UUID, BlockPos> breakingPlayers = new HashMap<>();
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
    public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return Shapes.empty();
    }

    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        pEntity.makeStuckInBlock(pState, new Vec3(0.25D, (double)0.05F, 0.25D));
        pEntity.hurt(pLevel.damageSources().cactus(), 1.0F);
    }
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
}
