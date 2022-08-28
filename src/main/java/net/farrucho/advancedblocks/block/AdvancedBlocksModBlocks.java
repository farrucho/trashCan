package net.farrucho.advancedblocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.farrucho.advancedblocks.AdvancedBlocks;
import net.farrucho.advancedblocks.block.custom.TrashCanBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvancedBlocksModBlocks {
    //public static final Block JUMPY_BLOCK = registerBlock("jumpy_block", new JumpyBlock(FabricBlockSettings.of(Material.WOOL)),ItemGroup.MISC);

    public static final Block TRASH_CAN = registerBlock("trash_can", new TrashCanBlock(FabricBlockSettings.of(Material.STONE).nonOpaque()), ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(AdvancedBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(AdvancedBlocks.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }


    public static void registerModBlock() {
        AdvancedBlocks.LOGGER.debug("Registando blocos para " + AdvancedBlocks.MOD_ID);

    }
}
