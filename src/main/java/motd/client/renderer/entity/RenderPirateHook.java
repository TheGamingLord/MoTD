package motd.client.renderer.entity;

import motd.References;
import motd.client.model.ModelMerman;
import motd.client.model.ModelPirateHook;
import motd.entity.EntityPirateHook;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPirateHook extends RenderLiving<EntityPirateHook> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID, "textures/entity/pirate_hook.png");

	public RenderPirateHook(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelPirateHook(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPirateHook entity) {
		return TEXTURE;
	}

}
