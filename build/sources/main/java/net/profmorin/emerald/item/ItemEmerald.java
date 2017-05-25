package net.profmorin.emerald.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.profmorin.emerald.EmeraldWares;
import net.profmorin.emerald.lib.Names;

public class ItemEmerald extends Item {
	
	public ItemEmerald() {
		
		setMaxStackSize(100);
		setCreativeTab(EmeraldWares.tabemeraldwares);
	}
	
	@Override  public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		
		if(!worldIn.isRemote)
			playerIn.sendMessage(new TextComponentString("Item used!"));
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
	@Override public String getUnlocalizedName(ItemStack stack) {
		
		return "item." + EmeraldWares.RESOURCE_PREFIX + Names.E_Item;
	}

}
