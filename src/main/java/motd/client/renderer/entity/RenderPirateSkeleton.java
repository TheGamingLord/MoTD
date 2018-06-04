package motd.client.renderer.entity;

import motd.client.model.ModelMerman;
import motd.client.model.ModelPirateSkeleton;
import motd.entity.EntityPirateSkeleton;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderPirateSkeleton extends RenderLiving<EntityPirateSkeleton> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("SkeletonPirate");

	public RenderPirateSkeleton(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelPirateSkeleton(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPirateSkeleton entity) {
		return TEXTURE;
	}

}
