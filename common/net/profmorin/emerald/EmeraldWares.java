package net.profmorin.emerald;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.profmorin.emerald.init.ModItem;

@Mod(modid = EmeraldWares.MOD_ID, name = EmeraldWares.MOD_NAME, version = EmeraldWares.VERSION)
public class EmeraldWares {
	
	//constants
	public static final String MOD_ID = "emerald_wares";
	public static final String MOD_NAME = "Emerald Wares";
	public static final String VERSION = "@VERSION@";
	public static final String RESOURCE_PREFIX = MOD_ID +":";
	
	//variables
	public static Random random = new Random();
	
	@Instance(MOD_ID) public static EmeraldWares instance;
	
	@SidedProxy(clientSide = "net.profmorin.emerald.ClientProxy", serverSide = "net.profmorin.emerald.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler public void PreInit(FMLPreInitializationEvent event) {
		
		proxy.PreInit(event);
	}
	
	@EventHandler public void Init(FMLInitializationEvent event) {
		
		proxy.Init(event);
	}
	
	@EventHandler public void PostInit(FMLPostInitializationEvent event){
		
		proxy.PostInit(event);
	}
	
	public static CreativeTabs tabemeraldwares = new CreativeTabs(EmeraldWares.RESOURCE_PREFIX+"tab_emerald") {
		@Override public ItemStack getTabIconItem() { 
			
			return new ItemStack(Items.EMERALD);
		}
	};
}
