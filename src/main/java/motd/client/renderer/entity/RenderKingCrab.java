package motd.client.renderer.entity;

import motd.client.model.ModelKingCrab;
import motd.entity.EntityKingCrab;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderKingCrab extends RenderLiving<EntityKingCrab> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("KingCrab");

	public RenderKingCrab(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelKingCrab(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityKingCrab entity) {
		return TEXTURE;
	}

}
