package com.autocheat;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.text.LiteralText;

public class AutoCheat implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTED.register(server ->
            server.getPlayerManager().setCheatsAllowed(true));

        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) ->
            handler.player.sendMessage(new LiteralText("Cheat aktif (Auto Cheat)"), true));
    }
}
