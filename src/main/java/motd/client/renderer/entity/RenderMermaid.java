package motd.client.renderer.entity;

import motd.References;
import motd.client.model.ModelMermaid;
import motd.client.model.ModelMerman;
import motd.entity.EntityMermaid;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMermaid extends RenderLiving<EntityMermaid> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID, "textures/entity/merman.png");

	public RenderMermaid(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelMermaid(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMermaid entity) {
		return TEXTURE;
	}

}
