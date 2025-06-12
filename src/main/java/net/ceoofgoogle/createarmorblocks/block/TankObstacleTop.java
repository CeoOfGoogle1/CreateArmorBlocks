package net.ceoofgoogle.createarmorblocks.block;

import net.ceoofgoogle.createarmorblocks.registry.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TankObstacleTop extends Block {
    public TankObstacleTop(Properties props) {
        super(props.noOcclusion()); // noOcclusion = no rendering/collision
    }
    public static final VoxelShape LOWER_SHAPE = Block.box(0, -16, 0, 16, 32, 16); // Shorter hitbox
    public static final VoxelShape UPPER_SHAPE = Block.box(0, -32, 0, 16, 16, 16); // Full height
    public static final VoxelShape DEFAULT_SHAPE = Block.box(0, 0, 0, 16, 16, 16); // Fail-safe

    @Override
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
        return true; // don’t render
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        BlockState oneBelow = level.getBlockState(pos.below());
        BlockState twoBelow = level.getBlockState(pos.below(2));

        if (oneBelow.getBlock() == ModBlocks.TANK_OBSTACLE_TOP.get() &&
                twoBelow.getBlock() == ModBlocks.TANK_OBSTACLE.get()) {
            return UPPER_SHAPE;
        }

        if (oneBelow.getBlock() == ModBlocks.TANK_OBSTACLE.get()) {
            return LOWER_SHAPE;
        }

        return DEFAULT_SHAPE;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter world, BlockPos pos) {
        return true;
    }
    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        BlockPos below = pos.below();
        if (level.getBlockState(below).getBlock() != ModBlocks.TANK_OBSTACLE_TOP.get()) {
            BlockPos above = pos.above();
            if (level.getBlockState(above).isAir()) {
                level.setBlock(above, ModBlocks.TANK_OBSTACLE_TOP.get().defaultBlockState(), Block.UPDATE_ALL);
            }
        }
        super.onPlace(state, level, pos, oldState, isMoving);
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!level.isClientSide && state.getBlock() != newState.getBlock()) {
            BlockPos baseBelow = pos.below();
            BlockPos twoBelow = pos.below(2);

            // If this is the upper top block (2nd from base)
            if (level.getBlockState(baseBelow).getBlock() == ModBlocks.TANK_OBSTACLE_TOP.get() &&
                    level.getBlockState(twoBelow).getBlock() == ModBlocks.TANK_OBSTACLE.get()) {
                // Remove full structure
                level.destroyBlock(baseBelow, false);
                level.destroyBlock(twoBelow, false);
            }

            // If this is the lower top block (1st above base)
            else if (level.getBlockState(baseBelow).getBlock() == ModBlocks.TANK_OBSTACLE.get()) {
                BlockPos above = pos.above();
                if (level.getBlockState(above).getBlock() == ModBlocks.TANK_OBSTACLE_TOP.get()) {
                    level.destroyBlock(above, false);
                }
                level.destroyBlock(baseBelow, false);
            }
        }

        super.onRemove(state, level, pos, newState, isMoving);
    }

}

