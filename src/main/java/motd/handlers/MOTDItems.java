package motd.handlers;

import motd.items.BaseItem;
import motd.items.ItemEmeraldIdol;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
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
	
	public static void init() {
		emerald_idol = new ItemEmeraldIdol();
		diamond_skull = new BaseItem("diamond_skull", CreativeTabs.MISC);
		gold_tablet = new BaseItem("gold_tablet", CreativeTabs.MISC);
		iron_ring = new BaseItem("iron_ring", CreativeTabs.MISC);
		prismarin_cross = new BaseItem("prismarin_cross", CreativeTabs.MISC);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
			emerald_idol, diamond_skull, gold_tablet,
			iron_ring, prismarin_cross
		);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(emerald_idol);
		registerRender(diamond_skull);
		registerRender(gold_tablet);
		registerRender(iron_ring);
		registerRender(prismarin_cross);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
