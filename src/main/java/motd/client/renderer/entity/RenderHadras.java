package motd.client.renderer.entity;

import motd.References;
import motd.client.model.ModelHadras;
import motd.entity.EntityHadras;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHadras extends RenderLiving<EntityHadras> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID, "textures/entity/hadras.png");

	public RenderHadras(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelHadras(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHadras entity) {
		return TEXTURE;
	}

}
