package motd.client.renderer.entity;

import motd.References;
import motd.client.model.ModelKingCrab;
import motd.entity.EntityKingCrab;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKingCrab extends RenderLiving<EntityKingCrab> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID, "textures/entity/king_crab.png");

	public RenderKingCrab(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelKingCrab(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityKingCrab entity) {
		return TEXTURE;
	}

}
