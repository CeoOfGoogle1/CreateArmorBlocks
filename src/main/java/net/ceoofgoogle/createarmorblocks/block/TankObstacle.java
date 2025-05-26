package net.ceoofgoogle.createarmorblocks.block;


import net.ceoofgoogle.createarmorblocks.registry.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
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
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import static com.simibubi.create.content.kinetics.base.DirectionalKineticBlock.FACING;

public class TankObstacle extends BaseEntityBlock implements EntityBlock {

    public static final VoxelShape NORTH_SHAPE = Block.box(0, 0, 0, 16, 48, 16);

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
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();

        BlockPos above1 = pos.above();
        BlockPos above2 = pos.above(2);

        if (!level.getBlockState(above1).canBeReplaced(context)) return null;
        if (!level.getBlockState(above2).canBeReplaced(context)) return null;

        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        super.createBlockStateDefinition(builder);
    }

   @Override
   public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
       // When the base block is placed, place the top part too
       level.setBlock(pos.above(), ModBlocks.TANK_OBSTACLE_TOP.get().defaultBlockState(), 3);
   }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!level.isClientSide && state.getBlock() != newState.getBlock()) {
            // Break two blocks above (if they are top parts)
            for (int i = 1; i <= 2; i++) {
                BlockPos above = pos.above(i);
                if (level.getBlockState(above).getBlock() == ModBlocks.TANK_OBSTACLE_TOP.get()) {
                    level.destroyBlock(above, false);
                } else {
                    break;
                }
            }
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }


}