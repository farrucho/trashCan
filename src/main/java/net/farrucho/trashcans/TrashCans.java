package net.farrucho.trashcans;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.farrucho.trashcans.block.TrashCansModBlocks;
import net.farrucho.trashcans.block.entity.ModBlockEntities;
import net.farrucho.trashcans.screen.ModScreenHandlers;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrashCans implements ModInitializer {
	public static final String MOD_ID = "trashcans";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		TrashCansModBlocks.registerModBlock();
		ModBlockEntities.registerAllBlockEntities();
		ModScreenHandlers.registerAllScreenHandlers();
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(content -> {
			content.add(TrashCansModBlocks.TRASH_CAN_BLOCK.asItem());
		});
	}
}
