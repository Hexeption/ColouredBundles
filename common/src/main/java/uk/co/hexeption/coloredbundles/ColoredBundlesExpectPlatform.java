package uk.co.hexeption.coloredbundles;

import dev.architectury.injectables.annotations.ExpectPlatform;

import net.minecraft.world.item.crafting.RecipeSerializer;

/**
 * ColoredBundlesExpectPlatform
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 18/10/2021 - 01:27 am
 */
public class ColoredBundlesExpectPlatform {

	@ExpectPlatform
	public static RecipeSerializer<?> createRecipeSerializer(RecipeSerializer<?> recipeSerializer) {
		throw new AssertionError();
	}
}
