package motd.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

public class EntityMermaid extends EntityAgeable implements INpc, IMerchant {

	public EntityMermaid(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 1.95F);
	}

	@Override
	public void setCustomer(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public EntityPlayer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MerchantRecipeList getRecipes(EntityPlayer player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRecipes(MerchantRecipeList recipeList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void useRecipe(MerchantRecipe recipe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySellingItem(ItemStack stack) {
		// TODO Auto-generated method stub

	}

	@Override
	public World getWorld() {
		return this.world;
	}

	@Override
	public BlockPos getPos() {
		return new BlockPos(this);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
