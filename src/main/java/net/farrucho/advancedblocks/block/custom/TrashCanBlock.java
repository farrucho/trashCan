package net.farrucho.advancedblocks.block.custom;

import net.farrucho.advancedblocks.AdvancedBlocks;
import net.farrucho.advancedblocks.block.entity.ModBlockEntities;
import net.farrucho.advancedblocks.block.entity.TrashCanBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import java.util.stream.Stream;

public class TrashCanBlock extends BlockWithEntity implements BlockEntityProvider {
    public TrashCanBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(5, 13, 5, 11, 14, 11),
            Block.createCuboidShape(1, 12, 1, 15, 13, 15),
            Block.createCuboidShape(3, 0, 3, 13, 12, 13)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;//é possivel consoante o blockstate retornar a voxel shape que queremos é oque ele faz no tutorial
    }

    //entity-------------------------------------

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TrashCanBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        //return checkType(type, ModBlockEntities.TRASH_CAN, TrashCanBlockEntity::tick);
        return checkType(type, ModBlockEntities.TRASH_CAN, TrashCanBlockEntity::tick);
    }



}
