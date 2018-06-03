package motd.client.renderer.entity;

import motd.client.model.ModelWhiteWhale;
import motd.entity.EntityWhiteWhale;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderWhiteWhale extends RenderLiving<EntityWhiteWhale> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("WhiteWhale");

	public RenderWhiteWhale(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelWhiteWhale(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWhiteWhale entity) {
		return TEXTURE;
	}

}
