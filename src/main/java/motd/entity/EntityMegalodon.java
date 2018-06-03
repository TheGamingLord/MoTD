package motd.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.MultiPartEntityPart;
import net.minecraft.util.DamageSource;
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

	public EntityMegalodon(World worldIn) {
		super(worldIn);
	}

	@Override
	public World getWorld() {
		return this.world;
	}

	@Override
	public boolean attackEntityFromPart(MultiPartEntityPart dragonPart, DamageSource source, float damage) {
		return false;
	}
}
