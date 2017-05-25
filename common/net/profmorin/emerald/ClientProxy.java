package net.profmorin.emerald;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.profmorin.emerald.init.ModItem;

public class ClientProxy extends CommonProxy {
	
	@Override public void PreInit(FMLPreInitializationEvent event){
		
		super.PreInit(event);
	}
	
	@Override public void Init(FMLInitializationEvent event) {
		
		super.Init(event);
		
		ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		
		ModItem.initClient(mesher);
	}
	
	@Override public void PostInit(FMLPostInitializationEvent event){
		
		super.PostInit(event);
	}
}
