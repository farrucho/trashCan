package net.farrucho.trashcans.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.farrucho.trashcans.TrashCans;
import net.farrucho.trashcans.block.custom.TrashCanBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
//import net.minecraft.item.ItemGroups
//import net.minecraft.registry.Registries
//import net.minecraft.registry.Registry;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TrashCansModBlocks {
    public static final Block TRASH_CAN_BLOCK = registerBlock("trash_can", new TrashCanBlock(FabricBlockSettings.of(Material.STONE).nonOpaque().hardness(2f).resistance(6f).sounds(BlockSoundGroup.STONE)), ItemGroup.REDSTONE);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.REGISTRIES.BLOCK, new Identifier(TrashCans.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        //return Registry.register(Registry.REGISTRIES.ITEM, new Identifier(TrashCans.MOD_ID, name), new BlockItem(block, new FabricItemSettings())); // 1.19.3
        return Registry.register(Registry.REGISTRIES.ITEM, new Identifier(TrashCans.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(ItemGroup.REDSTONE))); // 1.19.2
    }


    public static void registerModBlock() {
        TrashCans.LOGGER.debug("Registando blocos para " + TrashCans.MOD_ID);

    }
}
