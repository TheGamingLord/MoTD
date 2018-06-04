package motd.client.renderer.entity;

import motd.client.model.ModelDavyJones;
import motd.entity.EntityDavyJones;
import motd.entity.EntityJellyFish;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderDavyJones extends RenderLiving<EntityDavyJones> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("DavyJones");

	public RenderDavyJones(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelDavyJones(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDavyJones entity) {
		return TEXTURE;
	}

}
