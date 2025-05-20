package net.ceoofgoogle.createarmorblocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SandBags extends HorizontalDirectionalBlock {

    public static final VoxelShape NORTH_SHAPE = Block.box(0, 0, 8, 16, 16, 16);
    public static final VoxelShape WEST_SHAPE = Block.box(8, 0, 0, 16, 16, 16);
    public static final VoxelShape SOUTH_SHAPE = Block.box(0, 0, 0, 16, 16, 8);
    public static final VoxelShape EAST_SHAPE = Block.box(0, 0, 0, 8, 16, 16);

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        if (pState.getValue(FACING) == Direction.NORTH) {
            return NORTH_SHAPE;
        } else if (pState.getValue(FACING) == Direction.WEST) {
            return WEST_SHAPE;
        } else if (pState.getValue(FACING) == Direction.SOUTH) {
            return SOUTH_SHAPE;
        } else if (pState.getValue(FACING) == Direction.EAST) {
            return EAST_SHAPE;
        }
        return null;
    }


    public SandBags(Properties pProperties) {
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
}