package motd.entity;

import motd.handlers.MOTDItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityKingCrab extends EntityMob {

	public EntityKingCrab(World worldIn) {
		super(worldIn);
		this.setSize(8F, 4F);
	}
	
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(1, new EntityAIAttackMelee(this, 0.25D, false));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.50D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
	}
	
	@Override
	public void onDeath(DamageSource cause) {
		super.onDeath(cause);
		if (this.world.getGameRules().getBoolean("doMobLoot")) {
			this.dropItem(MOTDItems.crab_shell_piece, 10);
		}
	}
}
