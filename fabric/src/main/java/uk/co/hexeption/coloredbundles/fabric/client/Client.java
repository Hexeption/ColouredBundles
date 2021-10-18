package uk.co.hexeption.coloredbundles.fabric.client;

import uk.co.hexeption.coloredbundles.ColoredBundles;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BundleItem;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;

/**
 * Client
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/01/2021 - 09:49 am
 */
public class Client implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		FabricModelPredicateProviderRegistry.register(ColoredBundles.WHITE_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.ORANGE_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.MAGENTA_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.LIGHT_BLUE_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.YELLOW_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.LIME_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.PINK_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.GREY_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.LIGHT_GREY_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.CYAN_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.PURPLE_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.BLUE_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.BROWN_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.GREEN_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.RED_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		FabricModelPredicateProviderRegistry.register(ColoredBundles.BLACK_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));

	}
}
