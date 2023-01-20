package net.farrucho.trashcans;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
//import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.farrucho.trashcans.block.TrashCansModBlocks;
import net.farrucho.trashcans.screen.ModScreenHandlers;
import net.farrucho.trashcans.screen.TrashCanScreen;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroup;
//import net.minecraft.item.ItemGroups;

public class TrashCansClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(TrashCansModBlocks.TRASH_CAN_BLOCK, RenderLayer.getCutout());
        ScreenRegistry.register(ModScreenHandlers.TRASH_CAN_SCREEN_HANDLER, TrashCanScreen::new);

        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(content -> {
            content.add(TrashCansModBlocks.TRASH_CAN_BLOCK.asItem());
        });*/ // 1.19.3


    }
}
