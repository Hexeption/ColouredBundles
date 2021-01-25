package uk.co.hexeption.coloredbundles.registry;

import net.minecraft.item.BundleItem;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;

/**
 * ModelProvider
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/01/2021 - 09:47 am
 */
public class ModelProvider {

	public static void init() {
		FabricModelPredicateProviderRegistry.register(ModItems.WHITE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.ORANGE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.MAGENTA_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.LIGHT_BLUE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.YELLOW_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.LIME_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.PINK_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.GREY_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.LIGHT_GREY_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.CYAN_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.PURPLE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.BLUE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.BROWN_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.GREEN_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.RED_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(ModItems.BLACK_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
	}
}
