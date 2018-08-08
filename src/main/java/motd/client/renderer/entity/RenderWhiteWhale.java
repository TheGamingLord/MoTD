package motd.client.renderer.entity;

import motd.References;
import motd.client.model.ModelWhiteWhale;
import motd.entity.EntityWhiteWhale;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWhiteWhale extends RenderLiving<EntityWhiteWhale> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID, "textures/entity/white_whale.png");

	public RenderWhiteWhale(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelWhiteWhale(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWhiteWhale entity) {
		return TEXTURE;
	}

}
