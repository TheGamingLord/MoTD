package motd.client.renderer.entity;

import motd.client.model.ModelMerman;
import motd.entity.EntityMerman;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderMerman extends RenderLiving<EntityMerman> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("Merman");

	public RenderMerman(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelMerman(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMerman entity) {
		return TEXTURE;
	}

}
