package net.profmorin.emerald;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.profmorin.emerald.init.ModBlocks;
import net.profmorin.emerald.init.ModItem;

public class CommonProxy {

	public void PreInit(FMLPreInitializationEvent event){
		
		ModItem.init();
		ModBlocks.init();
	}
	
	public void Init(FMLInitializationEvent event){
		
		ModBlocks.initRecipes();
	}
	
	public void PostInit(FMLPostInitializationEvent event){
		
	}
}
