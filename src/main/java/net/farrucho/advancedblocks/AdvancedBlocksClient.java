package net.farrucho.advancedblocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.farrucho.advancedblocks.block.AdvancedBlocksModBlocks;
import net.farrucho.advancedblocks.screen.ModScreenHandlers;
import net.farrucho.advancedblocks.screen.TrashCanScreen;
import net.farrucho.advancedblocks.screen.TrashCanScreenHandler;
import net.minecraft.client.render.RenderLayer;

public class AdvancedBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocksModBlocks.TRASH_CAN_BLOCK, RenderLayer.getCutout());
        ScreenRegistry.register(ModScreenHandlers.TRASH_CAN_SCREEN_HANDLER, TrashCanScreen::new);
    }
}
