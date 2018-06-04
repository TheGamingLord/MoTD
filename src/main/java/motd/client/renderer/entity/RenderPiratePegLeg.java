package motd.client.renderer.entity;

import motd.client.model.ModelMerman;
import motd.client.model.ModelPiratePegleg;
import motd.entity.EntityPiratePegLeg;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderPiratePegLeg extends RenderLiving<EntityPiratePegLeg> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("PiratePegLeg");

	public RenderPiratePegLeg(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelPiratePegleg(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPiratePegLeg entity) {
		return TEXTURE;
	}

}
