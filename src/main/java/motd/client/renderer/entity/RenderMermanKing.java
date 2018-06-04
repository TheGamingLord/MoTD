package motd.client.renderer.entity;

import motd.client.model.ModelMerman;
import motd.client.model.ModelMermanking;
import motd.entity.EntityMermanKing;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderMermanKing extends RenderLiving<EntityMermanKing> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("Merman");

	public RenderMermanKing(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelMermanking(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMermanKing entity) {
		return TEXTURE;
	}

}
