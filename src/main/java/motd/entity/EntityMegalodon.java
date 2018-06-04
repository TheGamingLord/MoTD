package motd.entity;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.MultiPartEntityPart;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityMegalodon extends EntityCreature implements IEntityMultiPart {
	public MultiPartEntityPart megalodonPartHead = new MultiPartEntityPart(this, "head", 6.0F, 6.0F);
	public MultiPartEntityPart megalodonPartBody = new MultiPartEntityPart(this, "body", 8.0F, 8.0F);
	public MultiPartEntityPart megalodonPartTail1 = new MultiPartEntityPart(this, "tail", 4.0F, 4.0F);
	public MultiPartEntityPart megalodonPartTail2 = new MultiPartEntityPart(this, "tail", 4.0F, 4.0F);
	public MultiPartEntityPart megalodonPartTail3 = new MultiPartEntityPart(this, "tail", 4.0F, 4.0F);
	public MultiPartEntityPart megalodonPartFin = new MultiPartEntityPart(this, "fin", 4.0F, 4.0F);
	public MultiPartEntityPart megalodonPartFin2 = new MultiPartEntityPart(this, "fin", 4.0F, 4.0F);
	public MultiPartEntityPart megalodonPartFin3 = new MultiPartEntityPart(this, "fin", 4.0F, 4.0F);

	public MultiPartEntityPart[] megalodonPartArray;

	public EntityMegalodon(World worldIn) {
		super(worldIn);
		megalodonPartArray = new MultiPartEntityPart[] { megalodonPartHead };
		// , megalodonPartBody, megalodonPartTail1,
		// megalodonPartTail2, megalodonPartTail3, megalodonPartFin, megalodonPartFin2,
		// megalodonPartFin3 };
		this.setSize(10.0F, 8.0F);
	}

	@Override
	public World getWorld() {	
		return this.world;
	}

	@Override
	public boolean attackEntityFromPart(MultiPartEntityPart dragonPart, DamageSource source, float damage) {
		System.out.println(dragonPart);
		return this.attackEntityFrom(source, damage);
	}

	@Override
	public Entity[] getParts() {
		return megalodonPartArray;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		Vec3d[] avec3d = new Vec3d[this.megalodonPartArray.length];

		for (int j = 0; j < this.megalodonPartArray.length; ++j) {
			avec3d[j] = new Vec3d(this.megalodonPartArray[j].posX, this.megalodonPartArray[j].posY,
					this.megalodonPartArray[j].posZ);
		}

		this.megalodonPartHead.onUpdate();
		this.megalodonPartHead.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
		this.megalodonPartHead.onUpdate();
	}

	@Override
	protected void collideWithNearbyEntities() {
		super.collideWithNearbyEntities();
		// boolean collide = false;
		// for (int j = 0; j < this.megalodonPartArray.length; ++j) {
		// if (this.megalodonPartArray[j].getCollisionBoundingBox() == null)
		// return;
		// List<Entity> list = this.world.getEntitiesInAABBexcluding(this,
		// this.megalodonPartArray[j].getCollisionBoundingBox(),
		// EntitySelectors.getTeamCollisionPredicate(this));
		//
		// if (!list.isEmpty()) {
		// collide = true;
		// int i = this.world.getGameRules().getInt("maxEntityCramming");
		//
		// if (i > 0 && list.size() > i - 1 && this.rand.nextInt(4) == 0) {
		// int j1 = 0;
		//
		// for (int k = 0; k < list.size(); ++k) {
		// if (!((Entity) list.get(k)).isRiding()) {
		// ++j1;
		// }
		// }
		//
		// if (j1 > i - 1) {
		// this.attackEntityFrom(DamageSource.CRAMMING, 6.0F);
		// }
		// }
		//
		// for (int l = 0; l < list.size(); ++l) {
		// Entity entity = list.get(l);
		// this.collideWithEntity(entity);
		// }
		// }
		// }
		// if(!collide) {
		// this.motionX = 0;
		// this.motionY = 0;
		// this.motionZ = 0;
		// }
	}
}
