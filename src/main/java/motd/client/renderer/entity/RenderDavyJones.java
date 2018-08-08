package motd.client.renderer.entity;

import motd.References;
import motd.client.model.ModelDavyJones;
import motd.entity.EntityDavyJones;
import motd.entity.EntityJellyFish;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDavyJones extends RenderLiving<EntityDavyJones> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID, "textures/entity/davy_jones.png");

	public RenderDavyJones(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelDavyJones(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDavyJones entity) {
		return TEXTURE;
	}

}
