package net.farrucho.trashcans.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.farrucho.trashcans.TrashCans;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<TrashCanScreenHandler> TRASH_CAN_SCREEN_HANDLER;


    public static void registerAllScreenHandlers() {
        TRASH_CAN_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(TrashCans.MOD_ID, "trash_can"), TrashCanScreenHandler::new);
    }
}
