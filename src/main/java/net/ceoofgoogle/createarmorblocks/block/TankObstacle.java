package net.ceoofgoogle.createarmorblocks.block;


import net.ceoofgoogle.createarmorblocks.registry.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import static com.simibubi.create.content.kinetics.base.DirectionalKineticBlock.FACING;

public class TankObstacle extends BaseEntityBlock implements EntityBlock {

    public static final VoxelShape NORTH_SHAPE = Block.box(0, 0, 0, 16, 32, 16);

    public TankObstacle(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(FACING, Direction.NORTH));
    }
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext){
        return NORTH_SHAPE;
    }
    @Override
    public RenderShape getRenderShape(BlockState pState){
        return RenderShape.MODEL;
    }


    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return null;
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
   /* @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        // Only respond if the player clicked the top face
        if (hit.getDirection() != Direction.UP)
            return InteractionResult.PASS;

        // Only respond if the click is on the top half (Y >= 1.0)
        double clickY = hit.getLocation().y - pos.getY();
        if (clickY < 1.0)
            return InteractionResult.PASS;

        ItemStack heldItem = player.getItemInHand(hand);

        if (!heldItem.isEmpty() && heldItem.getItem() instanceof BlockItem blockItem) {
            BlockPos placePos = pos.above(2);
            BlockState newBlockState = blockItem.getBlock().defaultBlockState();

            if (level.isEmptyBlock(placePos) || level.getBlockState(placePos).canBeReplaced()) {
                if (!level.isClientSide) {
                    level.setBlock(placePos, newBlockState, Block.UPDATE_ALL);

                    if (!player.getAbilities().instabuild) {
                        heldItem.shrink(1);
                    }
                }

                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }

        return InteractionResult.PASS;
    }

    */
   @Override
   public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
       // When the base block is placed, place the top part too
       level.setBlock(pos.above(), ModBlocks.TANK_OBSTACLE_TOP.get().defaultBlockState(), 3);
   }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        // When base block is broken, remove top part too
        if (level.getBlockState(pos.above()).getBlock() == ModBlocks.TANK_OBSTACLE_TOP.get()) {
            level.destroyBlock(pos.above(), false);
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }

}