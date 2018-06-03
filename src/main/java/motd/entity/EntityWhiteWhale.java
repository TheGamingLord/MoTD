package motd.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityWhiteWhale extends EntityCreature {

	public EntityWhiteWhale(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 1.95F);
	}
}
