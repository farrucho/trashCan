package net.farrucho.advancedblocks.block.entity;

import net.farrucho.advancedblocks.AdvancedBlocks;
import net.farrucho.advancedblocks.block.custom.TrashCanBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TrashCanBlockEntity extends BlockEntity {
    public TrashCanBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.TRASH_CAN, pos, state);
    }

    /*If you want to store any data in your BlockEntity, you will need to save and load it, or it will only be held while the BlockEntity is loaded, and the data will reset whenever you come back to it. Luckily, saving and loading is quite simple - you only need to override writeNbt() and readNbt().*/

    // Store the current value of the number
    private int number = 7;

    // Serialize the BlockEntity
    @Override
    public void writeNbt(NbtCompound nbt) {
        // Save the current value of the number to the nbt
        nbt.putInt("number", number);

        super.writeNbt(nbt);
    }

    // Deserialize the BlockEntity
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);

        number = nbt.getInt("number");
    }

    public static void tick(World world, BlockPos pos, BlockState state, TrashCanBlockEntity entity) {
        //AdvancedBlocks.LOGGER.debug("tick123");
    }
}
