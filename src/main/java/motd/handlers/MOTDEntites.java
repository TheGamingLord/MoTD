package motd.handlers;

import motd.entity.EntityDavyJones;
import motd.entity.EntityHadras;
import motd.entity.EntityJellyFish;
import motd.entity.EntityKingCrab;
import motd.entity.EntityMegalodon;
import motd.entity.EntityMermaid;
import motd.entity.EntityMerman;
import motd.entity.EntityMermanKing;
import motd.entity.EntityPirateHook;
import motd.entity.EntityPiratePegLeg;
import motd.entity.EntityPirateSkeleton;
import motd.entity.EntityPrismarineGolem;
import motd.entity.EntityWhiteWhale;
import zdoctor.lazylibrary.common.entity.EasyLivingEntity;

public class MOTDEntites {
	public static void init() {
		new EasyLivingEntity("DavyJones", EntityDavyJones.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("Hadras", EntityHadras.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("JellyFish", EntityJellyFish.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("KingCrab", EntityKingCrab.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("Megalodon", EntityMegalodon.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("Mermaid", EntityMermaid.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("Merman", EntityMerman.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("MermanKing", EntityMermanKing.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("PirateHook", EntityPirateHook.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("PiratePegLeg", EntityPiratePegLeg.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("PirateSkeleton", EntityPirateSkeleton.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("PrismarineGolem", EntityPrismarineGolem.class).setEggColors(0xff0000, 0xff5500);
		new EasyLivingEntity("WhiteWhale", EntityWhiteWhale.class).setEggColors(0xff0000, 0xff5500);
	}
}
