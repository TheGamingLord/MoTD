package motd.entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityKingCrab extends EntityMob {

	public EntityKingCrab(World worldIn) {
		super(worldIn);
		this.setSize(8F, 4F);
	}
}
