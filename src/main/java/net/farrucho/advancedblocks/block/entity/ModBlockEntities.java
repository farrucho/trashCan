package net.farrucho.advancedblocks.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.farrucho.advancedblocks.AdvancedBlocks;
import net.farrucho.advancedblocks.block.AdvancedBlocksModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<TrashCanBlockEntity> TRASH_CAN;

    public static void registerAllBlockEntities(){
        TRASH_CAN = Registry.register(
                Registry.BLOCK_ENTITY_TYPE,
                new Identifier(AdvancedBlocks.MOD_ID, "trash_can"),
                FabricBlockEntityTypeBuilder.create(
                        TrashCanBlockEntity::new, AdvancedBlocksModBlocks.TRASH_CAN_BLOCK).build(null)
        );


    }
}
