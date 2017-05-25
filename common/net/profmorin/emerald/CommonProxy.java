package net.profmorin.emerald;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.profmorin.emerald.init.ModItem;

public class CommonProxy {

	public void PreInit(FMLPreInitializationEvent event){
		
		ModItem.init();
	}
	
	public void Init(FMLInitializationEvent event){
		
		ModItem.initRecipes();
	}
	
	public void PostInit(FMLPostInitializationEvent event){
		
	}
}
