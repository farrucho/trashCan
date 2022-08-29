package net.farrucho.advancedblocks;

import net.fabricmc.api.ModInitializer;
import net.farrucho.advancedblocks.block.AdvancedBlocksModBlocks;
import net.farrucho.advancedblocks.block.entity.ModBlockEntities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedBlocks implements ModInitializer {
	public static final String MOD_ID = "advancedblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AdvancedBlocksModBlocks.registerModBlock();
		ModBlockEntities.registerAllBlockEntities();
	}
}
