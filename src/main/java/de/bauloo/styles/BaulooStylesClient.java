package de.bauloo.styles;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;

public class BaulooStylesClient implements ClientModInitializer {
	public static final String MOD_ID = "bauloo-styles";

	@Override
	public void onInitializeClient() {
		StylesConfig.load();

		HudElementRegistry.addLast(
			Identifier.of(MOD_ID, "info"),
			(context, tickCounter) -> HudStyler.render(context)
		);

		ScreenEvents.AFTER_INIT.register(MenuStyler::onScreenInit);

		// /bauloo öffnet den Style-Browser im Spiel
		ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) ->
			dispatcher.register(ClientCommandManager.literal("bauloo").executes(context -> {
				MinecraftClient mc = MinecraftClient.getInstance();
				mc.send(() -> mc.setScreen(new StyleBrowserScreen(null)));
				return 1;
			}))
		);
	}
}
