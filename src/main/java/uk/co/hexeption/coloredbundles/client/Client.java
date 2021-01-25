package uk.co.hexeption.coloredbundles.client;

import uk.co.hexeption.coloredbundles.registry.ModelProvider;

import net.fabricmc.api.ClientModInitializer;

/**
 * Client
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/01/2021 - 09:49 am
 */
public class Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModelProvider.init();
	}
}
