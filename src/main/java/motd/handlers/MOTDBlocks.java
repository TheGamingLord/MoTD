package motd.handlers;

import motd.References;
import motd.blocks.BaseBlock;
import motd.blocks.BlockMossyQuartzPillar;
import motd.blocks.BlockOceanTotem;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

public class MOTDBlocks {

	@ObjectHolder(References.MODID + ":quartz_bricks")
	public static final Block quartz_bricks = null;
	@ObjectHolder(References.MODID + ":quartz_bricks_mossy")
	public static final Block quartz_bricks_mossy = null;
	@ObjectHolder(References.MODID + ":quartz_column_mossy")
	public static final Block quartz_column_mossy = null;
	@ObjectHolder(References.MODID + ":ocean_totem")
	public static final Block ocean_totem = null;

	public static void init() {
		new BaseBlock("quartz_bricks", Material.ROCK, MapColor.QUARTZ);
		new BaseBlock("quartz_bricks_mossy", Material.ROCK, MapColor.QUARTZ);
		new BlockMossyQuartzPillar();
		new BlockOceanTotem();
	}

}
