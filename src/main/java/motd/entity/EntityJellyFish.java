package motd.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.world.World;

public class EntityJellyFish extends EntityCreature {

	public EntityJellyFish(World worldIn) {
		super(worldIn);
		this.setSize(1.2F, 2.35F);
	}
	
	@Override
	protected void initEntityAI() {
		
	}
}
