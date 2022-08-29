package net.farrucho.advancedblocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.farrucho.advancedblocks.block.AdvancedBlocksModBlocks;
import net.minecraft.client.render.RenderLayer;

public class AdvancedBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocksModBlocks.TRASH_CAN_BLOCK, RenderLayer.getCutout());
    }
}
