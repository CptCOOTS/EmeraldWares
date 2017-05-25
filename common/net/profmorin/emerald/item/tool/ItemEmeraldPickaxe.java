package net.profmorin.emerald.item.tool;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.profmorin.emerald.EmeraldWares;
import net.profmorin.emerald.init.ModItem;
import net.profmorin.emerald.lib.Names;

public class ItemEmeraldPickaxe extends ItemPickaxe {
	
	public ItemEmeraldPickaxe() {
		
		super(ModItem.emerald_material);
		setCreativeTab(EmeraldWares.tabemeraldwares);
	}
	
	public void addRecipes() {
		
		GameRegistry.addShapedRecipe(new ItemStack(this,1), "eee"," s "," s ",'e',Items.EMERALD,'s',Items.STICK);
	}
	
	@Override public String getUnlocalizedName(ItemStack stack) {
		
		return "item." + EmeraldWares.RESOURCE_PREFIX + Names.E_Pickaxe;
	}
}
