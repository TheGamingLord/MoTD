package motd.client.renderer.entity;

import motd.client.model.ModelPrismarineGolem;
import motd.entity.EntityPrismarineGolem;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderPrismarineGolem extends RenderLiving<EntityPrismarineGolem> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("PrismarineGolem");

	public RenderPrismarineGolem(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelPrismarineGolem(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPrismarineGolem entity) {
		return TEXTURE;
	}

}
