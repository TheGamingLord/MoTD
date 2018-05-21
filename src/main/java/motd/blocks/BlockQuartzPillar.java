package motd.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockQuartzPillar extends BaseBlock {
	
    public static final PropertyEnum<EnumAxis> BLOCK_QUARTZ_PILLAR_AXIS = PropertyEnum.<EnumAxis>create("axis", EnumAxis.class);
	
    public BlockQuartzPillar() {
    	super("quartz_column_mossy", Material.ROCK, MapColor.QUARTZ);
    	this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
    
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getStateFromMeta(meta).withProperty(BLOCK_QUARTZ_PILLAR_AXIS, EnumAxis.fromFacingAxis(facing.getAxis()));
    }

    
	public IBlockState withRotation(IBlockState state, Rotation rot) {
        switch (rot)
        {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:

                switch ((EnumAxis)state.getValue(BLOCK_QUARTZ_PILLAR_AXIS))
                {
                    case X:
                        return state.withProperty(BLOCK_QUARTZ_PILLAR_AXIS, EnumAxis.Z);
                    case Z:
                        return state.withProperty(BLOCK_QUARTZ_PILLAR_AXIS, EnumAxis.X);
                    default:
                        return state;
                }

            default:
                return state;
        }
    }
	
	public static enum EnumAxis implements IStringSerializable {
        X("x"),
        Y("y"),
        Z("z"),
        NONE("none");

        private final String name;

        private EnumAxis(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }

        public static EnumAxis fromFacingAxis(EnumFacing.Axis axis) {
            switch (axis) {
                case X:
                    return X;
                case Y:
                    return Y;
                case Z:
                    return Z;
                default:
                    return NONE;
            }
        }

        public String getName() {
            return this.name;
        }
    }
	
}
