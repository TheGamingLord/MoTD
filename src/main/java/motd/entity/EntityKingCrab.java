package motd.entity;

import motd.handlers.MOTDItems;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityKingCrab extends EntityMob {

	public EntityKingCrab(World worldIn) {
		super(worldIn);
		this.setSize(8F, 4F);
	}
	
	@Override
	public Item getDropItem() {
		return MOTDItems.crab_shell_piece;
	}
}
