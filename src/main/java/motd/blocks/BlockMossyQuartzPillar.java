package motd.blocks;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import zdoctor.lazylibrary.common.block.EasyBlockRotatedPillar;

public class BlockMossyQuartzPillar extends EasyBlockRotatedPillar {
	
	public BlockMossyQuartzPillar() {
		super("quartz_column_mossy", Material.ROCK, MapColor.QUARTZ);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
}
