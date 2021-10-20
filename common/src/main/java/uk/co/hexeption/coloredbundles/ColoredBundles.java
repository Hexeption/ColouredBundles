package uk.co.hexeption.coloredbundles;


import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import uk.co.hexeption.coloredbundles.recipe.ColourBundlesColoringRecipe;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BundleItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleRecipeSerializer;

/**
 * ColoredBundles
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 17/10/2021 - 11:48 pm
 */
public class ColoredBundles {

	public static final String MOD_ID = "coloredbundles";

	public static ResourceLocation id(String name) {
		return new ResourceLocation(MOD_ID, name);
	}

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
	public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(MOD_ID, Registry.RECIPE_SERIALIZER_REGISTRY);

	public static final RegistrySupplier<Item> WHITE_BUNDLE = ColoredBundles.ITEMS.register("white_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> ORANGE_BUNDLE = ColoredBundles.ITEMS.register("orange_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> MAGENTA_BUNDLE = ColoredBundles.ITEMS.register("magenta_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_BUNDLE = ColoredBundles.ITEMS.register("light_blue_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> YELLOW_BUNDLE = ColoredBundles.ITEMS.register("yellow_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> LIME_BUNDLE = ColoredBundles.ITEMS.register("lime_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> PINK_BUNDLE = ColoredBundles.ITEMS.register("pink_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> GREY_BUNDLE = ColoredBundles.ITEMS.register("grey_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> LIGHT_GREY_BUNDLE = ColoredBundles.ITEMS.register("light_grey_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> CYAN_BUNDLE = ColoredBundles.ITEMS.register("cyan_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> PURPLE_BUNDLE = ColoredBundles.ITEMS.register("purple_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> BLUE_BUNDLE = ColoredBundles.ITEMS.register("blue_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> BROWN_BUNDLE = ColoredBundles.ITEMS.register("brown_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> GREEN_BUNDLE = ColoredBundles.ITEMS.register("green_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> RED_BUNDLE = ColoredBundles.ITEMS.register("red_bundle", () -> new BundleItem(newSettings()));
	public static final RegistrySupplier<Item> BLACK_BUNDLE = ColoredBundles.ITEMS.register("black_bundle", () -> new BundleItem(newSettings()));

	public static final CreativeModeTab COLORED_BUNDLES_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "coloredbundles_tab"), () -> new ItemStack(WHITE_BUNDLE.get()));
	public static RegistrySupplier<SimpleRecipeSerializer<ColourBundlesColoringRecipe>> colourBundlesColoringRecipe = RECIPE_SERIALIZER.register("test", () -> new SimpleRecipeSerializer<>(ColourBundlesColoringRecipe::new));

	static Item.Properties newSettings() {
		return new Item.Properties().tab(ColoredBundles.COLORED_BUNDLES_TAB).stacksTo(1);
	}

	public static void init() {
		ITEMS.register();
		RECIPE_SERIALIZER.register();
	}


}
