package motd.client.renderer.entity;

import motd.client.model.ModelJellyfish;
import motd.entity.EntityJellyFish;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderJellyFish extends RenderLiving<EntityJellyFish> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("JellyFish");

	public RenderJellyFish(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelJellyfish(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityJellyFish entity) {
		return TEXTURE;
	}

}
