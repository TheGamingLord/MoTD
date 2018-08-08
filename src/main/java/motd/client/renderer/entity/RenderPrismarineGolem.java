package motd.client.renderer.entity;

import motd.References;
import motd.client.model.ModelPrismarineGolem;
import motd.entity.EntityPrismarineGolem;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPrismarineGolem extends RenderLiving<EntityPrismarineGolem> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID, "textures/entity/prismarine_golem.png");

	public RenderPrismarineGolem(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelPrismarineGolem(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPrismarineGolem entity) {
		return TEXTURE;
	}

}
