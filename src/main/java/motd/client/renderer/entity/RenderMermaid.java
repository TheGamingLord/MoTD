package motd.client.renderer.entity;

import motd.client.model.ModelMermaid;
import motd.client.model.ModelMerman;
import motd.entity.EntityMermaid;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderMermaid extends RenderLiving<EntityMermaid> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("Merman");

	public RenderMermaid(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelMermaid(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMermaid entity) {
		return TEXTURE;
	}

}
