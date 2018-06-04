package motd.client.renderer.entity;

import motd.client.model.ModelDavyJones;
import motd.client.model.ModelHadras;
import motd.entity.EntityHadras;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderHadras extends RenderLiving<EntityHadras> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("Hadras");

	public RenderHadras(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelHadras(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHadras entity) {
		return TEXTURE;
	}

}
