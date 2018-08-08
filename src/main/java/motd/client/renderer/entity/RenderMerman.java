package motd.client.renderer.entity;

import motd.References;
import motd.client.model.ModelMerman;
import motd.entity.EntityMerman;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMerman extends RenderLiving<EntityMerman> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID, "textures/entity/merman.png");

	public RenderMerman(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelMerman(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMerman entity) {
		return TEXTURE;
	}

}
