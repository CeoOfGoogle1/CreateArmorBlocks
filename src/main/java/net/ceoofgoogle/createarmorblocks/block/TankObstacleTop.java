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
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Block.box(0, -16, 0, 16, 16, 16); // Full cube hitbox
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
        return true; // don’t render
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter world, BlockPos pos) {
        return true; // allow light through
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!isMoving && state.getBlock() != newState.getBlock()) {
            BlockPos basePos = pos.below();
            if (level.getBlockState(basePos).getBlock() == ModBlocks.TANK_OBSTACLE.get()) {
                level.destroyBlock(basePos, false);
            }
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }
}

