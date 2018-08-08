package motd.blocks;

import motd.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaseBlock extends Block {

	public BaseBlock(String name, Material material, MapColor mapColor) {
		super(material, mapColor);
		this.setUnlocalizedName(name);
		this.setRegistryName(References.MODID, name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

}
