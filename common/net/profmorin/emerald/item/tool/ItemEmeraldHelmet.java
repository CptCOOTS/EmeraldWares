package net.profmorin.emerald.item.tool;

import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.profmorin.emerald.EmeraldWares;
import net.profmorin.emerald.init.ModItem;
import net.profmorin.emerald.lib.Names;

public class ItemEmeraldHelmet extends ItemArmor {

	public ItemEmeraldHelmet() {
		super(ModItem.emerald_arm,1,EntityEquipmentSlot.HEAD);
		setCreativeTab(EmeraldWares.tabemeraldwares);
	}
	
	public void addRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(ModItem.emeraldHelmet), "eee", "e e", 'e', Items.EMERALD);
		/*GameRegistry.addShapedRecipe(new ItemStack(ModItem.emeraldChestplate), "e e", "eee", "eee", 'e', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItem.emeraldLeggings), "eee", "e e", "e e", 'e', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItem.emeraldBoots), "e e", "e e", 'e', Items.EMERALD);*/
	}
	
	@Override public String getUnlocalizedName(ItemStack stack) {
		
		return "item." + EmeraldWares.RESOURCE_PREFIX + Names.E_Helmet;
	}
}
