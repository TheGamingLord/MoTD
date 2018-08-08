package motd.client.renderer.entity;

import motd.References;
import motd.client.model.ModelJellyfish;
import motd.entity.EntityJellyFish;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJellyFish extends RenderLiving<EntityJellyFish> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID, "textures/entity/jellyfish.png");

	public RenderJellyFish(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelJellyfish(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityJellyFish entity) {
		return TEXTURE;
	}

}
