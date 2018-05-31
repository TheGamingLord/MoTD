package motd.handlers;

import motd.armor.CrabArmor;
import motd.items.BaseItem;
import motd.items.ItemEmeraldIdol;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class MOTDItems {
	
	public static Item emerald_idol;
	public static Item diamond_skull;
	public static Item gold_tablet;
	public static Item iron_ring;
	public static Item prismarin_cross;
	
	public static Item crab_shell_piece;
	
	public static ItemArmor crab_helmet;
	public static ItemArmor crab_chestplate;
	public static ItemArmor crab_leggings;
	public static ItemArmor crab_boots;
	
	public static void init() {
		emerald_idol = new ItemEmeraldIdol();
		diamond_skull = new BaseItem("diamond_skull", CreativeTabs.MISC);
		gold_tablet = new BaseItem("gold_tablet", CreativeTabs.MISC);
		iron_ring = new BaseItem("iron_ring", CreativeTabs.MISC);
		prismarin_cross = new BaseItem("prismarin_cross", CreativeTabs.MISC);
		
		crab_shell_piece = new BaseItem("crab_shell_piece", CreativeTabs.MATERIALS);
		
		crab_helmet = new CrabArmor("crab_helmet", 1, EntityEquipmentSlot.HEAD);
		crab_chestplate = new CrabArmor("crab_chestplate", 1, EntityEquipmentSlot.CHEST);
		crab_leggings = new CrabArmor("crab_leggings", 2, EntityEquipmentSlot.LEGS);
		crab_boots = new CrabArmor("crab_boots", 1, EntityEquipmentSlot.FEET);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
			emerald_idol, diamond_skull, gold_tablet,
			iron_ring, prismarin_cross, crab_shell_piece,
			crab_helmet, crab_chestplate, crab_leggings,
			crab_boots
		);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(emerald_idol);
		registerRender(diamond_skull);
		registerRender(gold_tablet);
		registerRender(iron_ring);
		registerRender(prismarin_cross);
		
		registerRender(crab_shell_piece);
		
		registerRender(crab_helmet);
		registerRender(crab_chestplate);
		registerRender(crab_leggings);
		registerRender(crab_boots);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
