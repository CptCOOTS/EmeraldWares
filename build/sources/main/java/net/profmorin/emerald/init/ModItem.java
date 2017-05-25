package net.profmorin.emerald.init;

import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.profmorin.emerald.EmeraldWares;
import net.profmorin.emerald.item.ItemEmerald;
import net.profmorin.emerald.lib.Names;

public class ModItem {

	public static ItemEmerald emeraldItem;
	
	
	public static void init() {
		
		emeraldItem = new ItemEmerald();
		emeraldItem.setRegistryName(new ResourceLocation(EmeraldWares.MOD_ID, Names.E_Item));
		GameRegistry.register(emeraldItem);
	}
	
	@SideOnly(Side.CLIENT) public static void initClient(ItemModelMesher mesher) {
		
		ModelResourceLocation model = new ModelResourceLocation(EmeraldWares.RESOURCE_PREFIX + Names.E_Item,"inventory");
		ModelLoader.registerItemVariants(emeraldItem, model);
		mesher.register(emeraldItem, 0, model);
	}
}
