package motd.client.renderer.entity;

import motd.client.model.ModelMegalodon;
import motd.client.model.ModelMerman;
import motd.entity.EntityMegalodon;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazylibrary.client.util.TextureLocation;

public class RenderMegalodon extends RenderLiving<EntityMegalodon> {

	public static final TextureLocation TEXTURE = new TextureLocation.MobTextureLocation("Megalodon");

	public RenderMegalodon(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelMegalodon(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMegalodon entity) {
		return TEXTURE;
	}

	@Override
	public boolean shouldRender(EntityMegalodon livingEntity, ICamera camera, double camX, double camY, double camZ) {
		return super.shouldRender(livingEntity, camera, camX, camY, camZ);
	}
	
}
