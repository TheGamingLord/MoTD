package motd.handlers;

import motd.MOTD;
import motd.client.renderer.entity.RenderDavyJones;
import motd.client.renderer.entity.RenderHadras;
import motd.client.renderer.entity.RenderJellyFish;
import motd.client.renderer.entity.RenderKingCrab;
import motd.client.renderer.entity.RenderMegalodon;
import motd.client.renderer.entity.RenderMermaid;
import motd.client.renderer.entity.RenderMerman;
import motd.client.renderer.entity.RenderMermanKing;
import motd.client.renderer.entity.RenderPirateHook;
import motd.client.renderer.entity.RenderPiratePegLeg;
import motd.client.renderer.entity.RenderPirateSkeleton;
import motd.client.renderer.entity.RenderPrismarineGolem;
import motd.client.renderer.entity.RenderWhiteWhale;
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
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MOTDEntities {
	public static void init() {
		/*new EasyLivingEntity("DavyJones", EntityDavyJones.class).setEggColors(0xff0000, 0xff5500);
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
		new EasyLivingEntity("WhiteWhale", EntityWhiteWhale.class).setEggColors(0xff0000, 0xff5500);*/
		registerEntity(EntityDavyJones.class, "davy_jones", 0xFF0000, 0xFF5500, 201);
		registerEntity(EntityHadras.class, "hadras", 0xFF0000, 0xFF5500, 202);
		registerEntity(EntityJellyFish.class, "jellyfish", 0xFF0000, 0xFF5500, 203);
		registerEntity(EntityKingCrab.class, "king_crab", 0xFF0000, 0xFF5500, 204);
		registerEntity(EntityMegalodon.class, "megalodon", 0xFF0000, 0xFF5500, 205);
		registerEntity(EntityMermaid.class, "mermaid", 0xFF0000, 0xFF5500, 206);
		registerEntity(EntityMerman.class, "merman", 0xFF0000, 0xFF5500, 207);
		registerEntity(EntityMermanKing.class, "merman_king", 0xFF0000, 0xFF5500, 208);
		registerEntity(EntityPirateHook.class, "pirate_hook", 0xFF0000, 0xFF5500, 209);
		registerEntity(EntityPiratePegLeg.class, "pirate_pegleg", 0xFF0000, 0xFF5500, 210);
		registerEntity(EntityPirateSkeleton.class, "pirate_skeleton", 0xFF0000, 0xFF5500, 211);
		registerEntity(EntityPrismarineGolem.class, "prismarine_golem", 0xFF0000, 0xFF5500, 212);
		registerEntity(EntityWhiteWhale.class, "white_whale", 0xFF0000, 0xFF5500, 213);
	}
	
	public static void registerEntity(Class<? extends Entity> entityClass, String name, int primaryEggColor, int secondaryEggColor, int id) {
		EntityRegistry.registerModEntity(new ResourceLocation(name), entityClass, name, id, MOTD.instance, 80, 3, true, primaryEggColor, secondaryEggColor);
		//RenderingRegistry.registerEntityRenderingHandler(entityClass, renderManager -> new RenderDavyJones(renderManager));
	}
	
	public static void renderEntities() {
		RenderingRegistry.registerEntityRenderingHandler(EntityDavyJones.class, new IRenderFactory<EntityDavyJones>() {
			@Override
			public Render<? super EntityDavyJones> createRenderFor(RenderManager manager) {
				return new RenderDavyJones(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityHadras.class, new IRenderFactory<EntityHadras>() {
			@Override
			public Render<? super EntityHadras> createRenderFor(RenderManager manager) {
				return new RenderHadras(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityJellyFish.class, new IRenderFactory<EntityJellyFish>() {
			@Override
			public Render<? super EntityJellyFish> createRenderFor(RenderManager manager) {
				return new RenderJellyFish(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityKingCrab.class, new IRenderFactory<EntityKingCrab>() {
			@Override
			public Render<? super EntityKingCrab> createRenderFor(RenderManager manager) {
				return new RenderKingCrab(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMegalodon.class, new IRenderFactory<EntityMegalodon>() {
			@Override
			public Render<? super EntityMegalodon> createRenderFor(RenderManager manager) {
				return new RenderMegalodon(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMermaid.class, new IRenderFactory<EntityMermaid>() {
			@Override
			public Render<? super EntityMermaid> createRenderFor(RenderManager manager) {
				return new RenderMermaid(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMerman.class, new IRenderFactory<EntityMerman>() {
			@Override
			public Render<? super EntityMerman> createRenderFor(RenderManager manager) {
				return new RenderMerman(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMermanKing.class, new IRenderFactory<EntityMermanKing>() {
			@Override
			public Render<? super EntityMermanKing> createRenderFor(RenderManager manager) {
				return new RenderMermanKing(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPirateHook.class, new IRenderFactory<EntityPirateHook>() {
			@Override
			public Render<? super EntityPirateHook> createRenderFor(RenderManager manager) {
				return new RenderPirateHook(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPiratePegLeg.class, new IRenderFactory<EntityPiratePegLeg>() {
			@Override
			public Render<? super EntityPiratePegLeg> createRenderFor(RenderManager manager) {
				return new RenderPiratePegLeg(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPirateSkeleton.class, new IRenderFactory<EntityPirateSkeleton>() {
			@Override
			public Render<? super EntityPirateSkeleton> createRenderFor(RenderManager manager) {
				return new RenderPirateSkeleton(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPrismarineGolem.class, new IRenderFactory<EntityPrismarineGolem>() {
			@Override
			public Render<? super EntityPrismarineGolem> createRenderFor(RenderManager manager) {
				return new RenderPrismarineGolem(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityWhiteWhale.class, new IRenderFactory<EntityWhiteWhale>() {
			@Override
			public Render<? super EntityWhiteWhale> createRenderFor(RenderManager manager) {
				return new RenderWhiteWhale(manager);
			}
		});
	}
}
