package motd.handlers;

import motd.entity.EntityJellyFish;
import motd.entity.EntityKingCrab;
import motd.entity.EntityMegalodon;
import motd.entity.EntityMerman;
import motd.entity.EntityPrismarineGolem;
import motd.entity.EntityWhiteWhale;
import zdoctor.lazylibrary.common.entity.EasyLivingEntity;

public class MOTDEntites {
	public static void init() {
		new EasyLivingEntity("JellyFish", EntityJellyFish.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("KingCrab", EntityKingCrab.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("Megalodon", EntityMegalodon.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("Merman", EntityMerman.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("PrismarineGolem", EntityPrismarineGolem.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("WhiteWhale", EntityWhiteWhale.class).setEggColors(0xff0000, 0xff5500);
	}
}
