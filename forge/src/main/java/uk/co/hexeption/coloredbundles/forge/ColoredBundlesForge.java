package uk.co.hexeption.coloredbundles.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import uk.co.hexeption.coloredbundles.ColoredBundles;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BundleItem;
import net.minecraft.world.item.crafting.RecipeSerializer;

/**
 * ColoredBundlesForge
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 18/10/2021 - 12:04 am
 */
@Mod(ColoredBundles.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ColoredBundlesForge {

	public ColoredBundlesForge() {
		EventBuses.registerModEventBus(ColoredBundles.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
		ColoredBundles.init();
	}

	@SubscribeEvent
	public static void onFMLClientSetup(FMLClientSetupEvent event) {
		ItemProperties.register(ColoredBundles.WHITE_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.ORANGE_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.MAGENTA_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.LIGHT_BLUE_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.YELLOW_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.LIME_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.PINK_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.GREY_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.LIGHT_GREY_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.CYAN_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.PURPLE_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.BLUE_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.BROWN_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.GREEN_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.RED_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
		ItemProperties.register(ColoredBundles.BLACK_BUNDLE.get(), new ResourceLocation("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getFullnessDisplay(itemStack));
	}
}
