package uk.co.hexeption.coloredbundles.recpie;

import uk.co.hexeption.coloredbundles.ColoredBundles;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.BundleItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;

/**
 * ColourBundlesColoringRecipe
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/01/2021 - 10:11 am
 */
public class ColourBundlesColoringRecipe extends CustomRecipe {

	public ColourBundlesColoringRecipe(ResourceLocation id) {
		super(id);
	}

	@Override
	public boolean matches(CraftingContainer inv, Level world) {
		int i = 0;
		int j = 0;

		for (int k = 0; k < inv.getContainerSize(); ++k) {
			ItemStack itemStack = inv.getItem(k);
			if (!itemStack.isEmpty()) {
				if (itemStack.getItem() instanceof BundleItem) {
					++i;
				} else {
					if (!(itemStack.getItem() instanceof DyeItem)) {
						return false;
					}

					++j;
				}

				if (j > 1 || i > 1) {
					return false;
				}
			}
		}

		return i == 1 && j == 1;
	}

	@Override
	public ItemStack assemble(CraftingContainer inv) {
		ItemStack itemStack = ItemStack.EMPTY;
		DyeItem dyeItem = (DyeItem) Items.WHITE_DYE;

		for (int i = 0; i < inv.getContainerSize(); ++i) {
			ItemStack itemStack2 = inv.getItem(i);
			if (!itemStack2.isEmpty()) {
				Item item = itemStack2.getItem();
				if (item instanceof BundleItem) {
					itemStack = itemStack2;
				} else if (item instanceof DyeItem) {
					dyeItem = (DyeItem) item;
				}
			}
		}

		ItemStack itemStack3 = getBundleByDye(dyeItem.getDyeColor()).getDefaultInstance();
		if (itemStack.hasTag()) {
			itemStack3.setTag(itemStack.getTag().copy());
		}

		return itemStack3;
	}

	@Override
	public boolean canCraftInDimensions(int width, int height) {
		return width * height >= 2;
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return ColoredBundles.colourBundlesColoringRecipe.get();
	}

	public static Item getBundleByDye(DyeColor dyeColor) {
		if (dyeColor == null) {
			return Items.BUNDLE;
		} else {
			switch (dyeColor) {
			case WHITE:
				return ColoredBundles.WHITE_BUNDLE.get();
			case ORANGE:
				return ColoredBundles.ORANGE_BUNDLE.get();
			case MAGENTA:
				return ColoredBundles.MAGENTA_BUNDLE.get();
			case LIGHT_BLUE:
				return ColoredBundles.LIGHT_BLUE_BUNDLE.get();
			case YELLOW:
				return ColoredBundles.YELLOW_BUNDLE.get();
			case LIME:
				return ColoredBundles.LIME_BUNDLE.get();
			case PINK:
				return ColoredBundles.PINK_BUNDLE.get();
			case GRAY:
				return ColoredBundles.GREY_BUNDLE.get();
			case LIGHT_GRAY:
				return ColoredBundles.LIGHT_GREY_BUNDLE.get();
			case CYAN:
				return ColoredBundles.CYAN_BUNDLE.get();
			case PURPLE:
				return ColoredBundles.PURPLE_BUNDLE.get();
			case BLUE:
				return ColoredBundles.BLUE_BUNDLE.get();
			case BROWN:
				return ColoredBundles.BROWN_BUNDLE.get();
			case GREEN:
				return ColoredBundles.GREEN_BUNDLE.get();
			case RED:
				return ColoredBundles.RED_BUNDLE.get();
			case BLACK:
				return ColoredBundles.BLACK_BUNDLE.get();
			}
			return Items.BUNDLE;
		}
	}
}
