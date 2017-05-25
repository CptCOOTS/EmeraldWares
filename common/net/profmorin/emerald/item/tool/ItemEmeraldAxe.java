package net.profmorin.emerald.item.tool;

import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.profmorin.emerald.EmeraldWares;
import net.profmorin.emerald.init.ModItem;
import net.profmorin.emerald.lib.Names;

public class ItemEmeraldAxe extends ItemAxe {

	public ItemEmeraldAxe() {
		
		super(ModItem.emerald_material,9.0f,-2.7f);
		setCreativeTab(EmeraldWares.tabemeraldwares);
	}
	
	public void addRecipes() {
		
		GameRegistry.addShapedRecipe(new ItemStack(this,1), "ee ","es "," s ",'e',Items.EMERALD,'s',Items.STICK);
	}
	
	@Override public String getUnlocalizedName(ItemStack stack) {
		
		return "item." + EmeraldWares.RESOURCE_PREFIX + Names.E_Axe;
	}
}
