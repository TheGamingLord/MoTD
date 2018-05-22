package motd.handlers;

import motd.blocks.BaseBlock;
import motd.blocks.BlockMossyQuartzPillar;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class MOTDBlocks {
	
	public static Block quartz_bricks;
	public static Block quartz_bricks_mossy;
	public static Block quartz_column_mossy;
	
	public static void init() {
		quartz_bricks = new BaseBlock("quartz_bricks", Material.ROCK, MapColor.QUARTZ).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		quartz_bricks_mossy = new BaseBlock("quartz_bricks_mossy", Material.ROCK, MapColor.QUARTZ).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		quartz_column_mossy = new BlockMossyQuartzPillar();
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
			quartz_bricks, quartz_bricks_mossy, quartz_column_mossy
		);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
			new ItemBlock(quartz_bricks).setRegistryName(quartz_bricks.getRegistryName()),
			new ItemBlock(quartz_bricks_mossy).setRegistryName(quartz_bricks_mossy.getRegistryName()),
			new ItemBlock(quartz_column_mossy).setRegistryName(quartz_column_mossy.getRegistryName())
		);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(quartz_bricks));
		registerRender(Item.getItemFromBlock(quartz_bricks_mossy));
		registerRender(Item.getItemFromBlock(quartz_column_mossy));
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
