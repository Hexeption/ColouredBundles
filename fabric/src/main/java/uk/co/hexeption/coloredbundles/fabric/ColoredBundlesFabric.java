package uk.co.hexeption.coloredbundles.fabric;

import uk.co.hexeption.coloredbundles.ColoredBundles;

import net.fabricmc.api.ModInitializer;

/**
 * ColoredBundlesFabric
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 18/10/2021 - 01:47 am
 */
public class ColoredBundlesFabric implements ModInitializer {

	@Override
	public void onInitialize() {
		ColoredBundles.init();
	}
}
