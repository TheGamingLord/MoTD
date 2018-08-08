package motd.handlers;

import motd.blocks.BaseBlock;
import motd.blocks.BlockMossyQuartzPillar;
import motd.blocks.BlockOceanTotem;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class MOTDBlocks {

	public static final Block quartz_bricks = new BaseBlock("quartz_bricks", Material.ROCK, MapColor.QUARTZ);
	public static final Block quartz_bricks_mossy = new BaseBlock("quartz_bricks_mossy", Material.ROCK, MapColor.QUARTZ);
	public static final Block quartz_column_mossy = new BlockMossyQuartzPillar();
	public static final Block ocean_totem = new BlockOceanTotem();
	
	@SubscribeEvent
	public static void registerBlock(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				quartz_bricks, quartz_bricks_mossy,
				quartz_column_mossy, ocean_totem
		);
	}
	
	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				new ItemBlock(quartz_bricks).setRegistryName(quartz_bricks.getRegistryName()),
				new ItemBlock(quartz_bricks_mossy).setRegistryName(quartz_bricks_mossy.getRegistryName()),
				new ItemBlock(quartz_column_mossy).setRegistryName(quartz_column_mossy.getRegistryName()),
				new ItemBlock(ocean_totem).setRegistryName(ocean_totem.getRegistryName())
		);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(quartz_bricks);
		registerRender(quartz_bricks_mossy);
		registerRender(quartz_column_mossy);
		registerRender(ocean_totem);
	}
	
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
}
