package motd.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelIronGolem - Either Mojang or a mod author Created using Tabula 7.0.0
 */
public class ModelPrismarineGolem extends ModelBase {
	public ModelRenderer leg1;
	public ModelRenderer leg2;
	public ModelRenderer Brazo2;
	public ModelRenderer field_78177_c;
	public ModelRenderer field_78176_b0;
	public ModelRenderer Brazo1;
	public ModelRenderer field_78176_b0_1;
	public ModelRenderer field_78177_c_1;
	public ModelRenderer Torso;
	public ModelRenderer field_78176_b1;
	public ModelRenderer field_78178_a0;

	public ModelPrismarineGolem() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.leg1 = new ModelRenderer(this, 37, 0);
		this.leg1.setRotationPoint(-4.0F, 11.0F, 0.0F);
		this.leg1.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
		this.field_78177_c = new ModelRenderer(this, 60, 21);
		this.field_78177_c.setRotationPoint(16.0F, 14.0F, 5.0F);
		this.field_78177_c.addBox(-13.0F, -2.5F, -3.0F, 4, 13, 6, 0.0F);
		this.field_78176_b1 = new ModelRenderer(this, 0, 68);
		this.field_78176_b1.setRotationPoint(-1.0F, 2.0F, -1.0F);
		this.field_78176_b1.addBox(-4.5F, 10.0F, -3.0F, 11, 5, 8, 0.0F);
		this.leg2 = new ModelRenderer(this, 60, 0);
		this.leg2.mirror = true;
		this.leg2.setRotationPoint(5.0F, 11.0F, 0.0F);
		this.leg2.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
		this.Torso = new ModelRenderer(this, 0, 40);
		this.Torso.setRotationPoint(0.0F, -9.0F, 0.0F);
		this.Torso.addBox(-9.0F, -2.0F, -6.0F, 18, 14, 12, 0.0F);
		this.field_78177_c_1 = new ModelRenderer(this, 60, 21);
		this.field_78177_c_1.setRotationPoint(3.0F, 13.0F, 2.0F);
		this.field_78177_c_1.addBox(0.0F, 0.0F, 0.0F, 4, 13, 6, 0.0F);
		this.field_78178_a0 = new ModelRenderer(this, 88, 0);
		this.field_78178_a0.setRotationPoint(-1.0F, 4.0F, 0.0F);
		this.field_78178_a0.addBox(-4.0F, -12.0F, -5.5F, 10, 6, 10, 0.0F);
		this.field_78176_b0_1 = new ModelRenderer(this, 24, 112);
		this.field_78176_b0_1.setRotationPoint(1.0F, 8.0F, 1.0F);
		this.field_78176_b0_1.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
		this.Brazo2 = new ModelRenderer(this, 0, 83);
		this.Brazo2.setRotationPoint(-16.0F, -12.0F, -5.0F);
		this.Brazo2.addBox(0.0F, 0.0F, 0.0F, 10, 8, 10, 0.0F);
		this.field_78176_b0 = new ModelRenderer(this, 0, 101);
		this.field_78176_b0.setRotationPoint(1.0F, 8.0F, 1.0F);
		this.field_78176_b0.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
		this.Brazo1 = new ModelRenderer(this, 88, 110);
		this.Brazo1.setRotationPoint(6.0F, -12.0F, -5.0F);
		this.Brazo1.addBox(0.0F, 0.0F, 0.0F, 10, 8, 10, 0.0F);
		this.Brazo2.addChild(this.field_78177_c);
		this.Torso.addChild(this.field_78176_b1);
		this.Brazo1.addChild(this.field_78177_c_1);
		this.Torso.addChild(this.field_78178_a0);
		this.Brazo1.addChild(this.field_78176_b0_1);
		this.Brazo2.addChild(this.field_78176_b0);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.leg1.render(f5);
		this.leg2.render(f5);
		this.Torso.render(f5);
		this.Brazo2.render(f5);
		this.Brazo1.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
