package uk.co.hexeption.coloredbundles.registry;

import uk.co.hexeption.coloredbundles.ColoredBundles;

import net.minecraft.item.BundleItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

/**
 * ModItems
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/01/2021 - 09:10 am
 */
public class ModItems {

	public static final Item WHITE_BUNDLE = register("white_bundle", new BundleItem(newSettings()));
	public static final Item ORANGE_BUNDLE = register("orange_bundle", new BundleItem(newSettings()));
	public static final Item MAGENTA_BUNDLE = register("magenta_bundle", new BundleItem(newSettings()));
	public static final Item LIGHT_BLUE_BUNDLE = register("light_blue_bundle", new BundleItem(newSettings()));
	public static final Item YELLOW_BUNDLE = register("yellow_bundle", new BundleItem(newSettings()));
	public static final Item LIME_BUNDLE = register("lime_bundle", new BundleItem(newSettings()));
	public static final Item PINK_BUNDLE = register("pink_bundle", new BundleItem(newSettings()));
	public static final Item GREY_BUNDLE = register("grey_bundle", new BundleItem(newSettings()));
	public static final Item LIGHT_GREY_BUNDLE = register("light_grey_bundle", new BundleItem(newSettings()));
	public static final Item CYAN_BUNDLE = register("cyan_bundle", new BundleItem(newSettings()));
	public static final Item PURPLE_BUNDLE = register("purple_bundle", new BundleItem(newSettings()));
	public static final Item BLUE_BUNDLE = register("blue_bundle", new BundleItem(newSettings()));
	public static final Item BROWN_BUNDLE = register("brown_bundle", new BundleItem(newSettings()));
	public static final Item GREEN_BUNDLE = register("green_bundle", new BundleItem(newSettings()));
	public static final Item RED_BUNDLE = register("red_bundle", new BundleItem(newSettings()));
	public static final Item BLACK_BUNDLE = register("black_bundle", new BundleItem(newSettings()));

	static Item.Settings newSettings() {
		return new Item.Settings().group(ColoredBundles.GROUP).maxCount(1);
	}

	public static void init() {

	}

	protected static <T extends Item> T register(String name, T item) {
		return Registry.register(Registry.ITEM, ColoredBundles.id(name), item);
	}
}
