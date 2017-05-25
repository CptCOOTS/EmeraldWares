package net.profmorin.emerald.init;

import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.profmorin.emerald.EmeraldWares;
import net.profmorin.emerald.item.tool.ItemEmeraldAxe;
import net.profmorin.emerald.item.tool.ItemEmeraldHoe;
import net.profmorin.emerald.item.tool.ItemEmeraldPickaxe;
import net.profmorin.emerald.item.tool.ItemEmeraldShovel;
import net.profmorin.emerald.item.tool.ItemEmeraldSword;
import net.profmorin.emerald.lib.Names;

public class ModItem {

	public static ToolMaterial emerald_material= EnumHelper.addToolMaterial(EmeraldWares.RESOURCE_PREFIX + "material", 2, 600, 8.0f, 2.5f, 20);//Emerald Material for tools. May adjust later.
	public static final ArmorMaterial emerald_arm = EnumHelper.addArmorMaterial(EmeraldWares.RESOURCE_PREFIX + "armmat", "", 25, new int[]{2,6,7,2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f); 
	
	public static ItemEmeraldPickaxe emeraldPickaxe;
	public static ItemEmeraldShovel emeraldShovel;
	public static ItemEmeraldHoe emeraldHoe;
	public static ItemEmeraldAxe emeraldAxe;
	public static ItemEmeraldSword emeraldSword;
	
	public static void init() {
		
		emeraldPickaxe = register(new ItemEmeraldPickaxe(), Names.E_Pickaxe);
		emeraldShovel = register(new ItemEmeraldShovel(), Names.E_Shovel);
		emeraldHoe = register(new ItemEmeraldHoe(),Names.E_Hoe);
		emeraldAxe = register(new ItemEmeraldAxe(),Names.E_Axe);
		emeraldSword = register(new ItemEmeraldSword(),Names.E_Sword);
	}
	
	public static void initRecipes() {
		
		emeraldPickaxe.addRecipes();
		emeraldShovel.addRecipes();
		emeraldHoe.addRecipes();
		emeraldAxe.addRecipes();
		emeraldSword.addRecipes();
	}
	
	protected static <T extends Item> T register(T item, String name) {
		
		item.setRegistryName(new ResourceLocation(EmeraldWares.MOD_ID, name));
		GameRegistry.register(item);
		item.setCreativeTab(EmeraldWares.tabemeraldwares);
		item.setUnlocalizedName(EmeraldWares.RESOURCE_PREFIX + name);
		return item;
	}
	
	@SideOnly(Side.CLIENT) public static void initClient(ItemModelMesher mesher) {
		
		registerModel(mesher, emeraldPickaxe, Names.E_Pickaxe);
		registerModel(mesher, emeraldShovel, Names.E_Shovel);
		registerModel(mesher, emeraldHoe, Names.E_Hoe);
		registerModel(mesher, emeraldAxe, Names.E_Axe);
		registerModel(mesher, emeraldSword, Names.E_Sword);
	}
	
	@SideOnly(Side.CLIENT) protected static void registerModel(ItemModelMesher mesher, Item item, String name) {
		
		ModelResourceLocation model = new ModelResourceLocation(EmeraldWares.RESOURCE_PREFIX + name, "inventory");
		ModelLoader.registerItemVariants(item,  model);
	 	mesher.register(item, 0,model);
	}
}
