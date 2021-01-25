package uk.co.hexeption.coloredbundles;

import org.jetbrains.annotations.Nullable;
import uk.co.hexeption.coloredbundles.recpie.ColourBundlesColoringRecipe;
import uk.co.hexeption.coloredbundles.registry.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

/**
 * ColoredBundles
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/01/2021 - 09:06 am
 */
public class ColoredBundles implements ModInitializer {

	private static String MOD_ID = "coloredbundles";

	public static final ItemGroup GROUP = FabricItemGroupBuilder.build(id("group"), () -> new ItemStack(ModItems.GREEN_BUNDLE));

	public static SpecialRecipeSerializer<ColourBundlesColoringRecipe> colourBundlesColoringRecipe = register("test", new SpecialRecipeSerializer<>(ColourBundlesColoringRecipe::new));

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}


	public static <S extends RecipeSerializer<T>, T extends Recipe<?>> S register(String name, S serializer) {
		return Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MOD_ID, name), serializer);
	}

	@Override
	public void onInitialize() {
		ModItems.init();
	}

	public static Item getBundleByDye(@Nullable DyeColor dyeColor) {
		if (dyeColor == null) {
			return Items.BUNDLE;
		} else {
			switch (dyeColor) {
			case WHITE:
				return ModItems.WHITE_BUNDLE;
			case ORANGE:
				return ModItems.ORANGE_BUNDLE;
			case MAGENTA:
				return ModItems.MAGENTA_BUNDLE;
			case LIGHT_BLUE:
				return ModItems.LIGHT_BLUE_BUNDLE;
			case YELLOW:
				return ModItems.YELLOW_BUNDLE;
			case LIME:
				return ModItems.LIME_BUNDLE;
			case PINK:
				return ModItems.PINK_BUNDLE;
			case GRAY:
				return ModItems.GREY_BUNDLE;
			case LIGHT_GRAY:
				return ModItems.LIGHT_GREY_BUNDLE;
			case CYAN:
				return ModItems.CYAN_BUNDLE;
			case PURPLE:
				return ModItems.PURPLE_BUNDLE;
			case BLUE:
				return ModItems.BLUE_BUNDLE;
			case BROWN:
				return ModItems.BROWN_BUNDLE;
			case GREEN:
				return ModItems.GREEN_BUNDLE;
			case RED:
				return ModItems.RED_BUNDLE;
			case BLACK:
				return ModItems.BLACK_BUNDLE;
			}
			return Items.BUNDLE;
		}
	}
}
