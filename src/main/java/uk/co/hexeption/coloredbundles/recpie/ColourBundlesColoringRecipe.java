package uk.co.hexeption.coloredbundles.recpie;

import uk.co.hexeption.coloredbundles.ColoredBundles;

import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.BundleItem;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

/**
 * ColourBundlesColoringRecipe
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/01/2021 - 10:11 am
 */
public class ColourBundlesColoringRecipe extends SpecialCraftingRecipe {
	public ColourBundlesColoringRecipe(Identifier id) {
		super(id);
	}

	@Override
	public boolean matches(CraftingInventory inv, World world) {
		int i = 0;
		int j = 0;

		for (int k = 0; k < inv.size(); ++k) {
			ItemStack itemStack = inv.getStack(k);
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
	public ItemStack craft(CraftingInventory inv) {
		ItemStack itemStack = ItemStack.EMPTY;
		DyeItem dyeItem = (DyeItem) Items.WHITE_DYE;

		for (int i = 0; i < inv.size(); ++i) {
			ItemStack itemStack2 = inv.getStack(i);
			if (!itemStack2.isEmpty()) {
				Item item = itemStack2.getItem();
				if (item instanceof BundleItem) {
					itemStack = itemStack2;
				} else if (item instanceof DyeItem) {
					dyeItem = (DyeItem) item;
				}
			}
		}

		ItemStack itemStack3 = ColoredBundles.getBundleByDye(dyeItem.getColor()).getDefaultStack();
		if (itemStack.hasTag()) {
			itemStack3.setTag(itemStack.getTag().copy());
		}

		return itemStack3;
	}

	@Override
	public boolean fits(int width, int height) {
		return width * height >= 2;
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return ColoredBundles.colourBundlesColoringRecipe;
	}
}
