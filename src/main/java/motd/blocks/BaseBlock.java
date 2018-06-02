package motd.blocks;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import zdoctor.lazylibrary.common.base.EasyBlock;

public class BaseBlock extends EasyBlock {

	public BaseBlock(String name, Material material, MapColor mapColor) {
		super(name, material, mapColor);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

}
