package motd.blocks;

import motd.References;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMossyQuartzPillar extends BlockRotatedPillar {
	
	public BlockMossyQuartzPillar() {
		super(Material.ROCK, MapColor.QUARTZ);
		this.setUnlocalizedName("quartz_column_mossy");
		this.setRegistryName(References.MODID, "quartz_column_mossy");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
}
