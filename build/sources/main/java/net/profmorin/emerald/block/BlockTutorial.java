package net.profmorin.emerald.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.profmorin.emerald.EmeraldWares;
import net.profmorin.emerald.lib.Names;

public class BlockTutorial extends Block {

	public BlockTutorial() {
		super(Material.ROCK);
		// TODO Auto-generated constructor stub
		setHardness(5.0f);
		setResistance(10.0f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe",1);
		setCreativeTab(EmeraldWares.tabemeraldwares);
	}

	public void addRecipes() {
		
		GameRegistry.addShapedRecipe(new ItemStack(this,1), " e ","ece"," e ",'e',Items.EMERALD,'c',new ItemStack(Blocks.CLAY,1,OreDictionary.WILDCARD_VALUE));
	}
	@Override public String getUnlocalizedName() {
		
		return "tile." + EmeraldWares.RESOURCE_PREFIX + Names.TUTORIAL_BLOCK;
	}
}
