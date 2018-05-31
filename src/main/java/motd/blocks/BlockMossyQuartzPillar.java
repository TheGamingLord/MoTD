package motd.blocks;

import motd.References;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockMossyQuartzPillar extends BlockRotatedPillar {
	
	public BlockMossyQuartzPillar() {
		super(Material.ROCK, MapColor.QUARTZ);
		this.setUnlocalizedName("quartz_column_mossy");
		this.setRegistryName(References.MODID, "quartz_column_mossy");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
}
