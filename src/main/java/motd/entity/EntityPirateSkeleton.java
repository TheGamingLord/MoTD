package motd.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityPirateSkeleton extends EntityMob {

	public EntityPirateSkeleton(World worldIn) {
		super(worldIn);
		this.setSize(1.2F, 2.35F);
	}
}
