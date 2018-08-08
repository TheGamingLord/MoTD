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
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class MOTDItems {

	public static final Item emerald_idol = new ItemEmeraldIdol();
	public static final Item diamond_skull = new BaseItem("diamond_skull", CreativeTabs.MISC);
	public static final Item gold_tablet = new BaseItem("gold_tablet", CreativeTabs.MISC);
	public static final Item iron_ring = new BaseItem("iron_ring", CreativeTabs.MISC);
	public static final Item prismarine_cross = new BaseItem("prismarine_cross", CreativeTabs.MISC);
	public static final Item crab_shell_piece = new BaseItem("crab_shell_piece", CreativeTabs.MATERIALS);

	public static final ItemArmor crab_helmet = new CrabArmor("crab_helmet", 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor crab_chestplate = new CrabArmor("crab_chestplate", 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor crab_leggings = new CrabArmor("crab_leggings", 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor crab_boots = new CrabArmor("crab_boots", 1, EntityEquipmentSlot.FEET);
	
	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				emerald_idol, diamond_skull, gold_tablet,
				iron_ring, prismarine_cross, crab_shell_piece,
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
		registerRender(prismarine_cross);
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
