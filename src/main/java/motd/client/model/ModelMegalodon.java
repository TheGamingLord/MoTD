package motd.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Megalodon - AguilaDaddy
 * Created using Tabula 7.0.0
 */
public class ModelMegalodon extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape1_1;
    public ModelRenderer shape1_2;
    public ModelRenderer shape1_3;
    public ModelRenderer shape1_4;
    public ModelRenderer shape6;
    public ModelRenderer shape6_1;
    public ModelRenderer shape6_2;
    public ModelRenderer shape6_3;
    public ModelRenderer shape6_4;
    public ModelRenderer shape6_5;
    public ModelRenderer shape6_6;
    public ModelRenderer shape6_7;
    public ModelRenderer shape14;
    public ModelRenderer shape14_1;
    public ModelRenderer shape14_2;
    public ModelRenderer shape1_5;
    public ModelRenderer shape1_6;

    public ModelMegalodon() {
        this.textureWidth = 150;
        this.textureHeight = 200;
        this.shape6_5 = new ModelRenderer(this, 0, 106);
        this.shape6_5.setRotationPoint(0.0F, 3.0F, 32.0F);
        this.shape6_5.addBox(0.0F, 0.0F, 0.0F, 0, 2, 5, 0.0F);
        this.shape1_1 = new ModelRenderer(this, 100, 100);
        this.shape1_1.setRotationPoint(-5.0F, 4.0F, 11.0F);
        this.shape1_1.addBox(0.0F, 0.0F, 0.0F, 10, 11, 12, 0.0F);
        this.shape1_5 = new ModelRenderer(this, 0, 127);
        this.shape1_5.setRotationPoint(-4.0F, 4.5F, 23.0F);
        this.shape1_5.addBox(0.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
        this.shape14_2 = new ModelRenderer(this, 0, 8);
        this.shape14_2.setRotationPoint(-3.0F, 12.0F, -27.0F);
        this.shape14_2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 0, 0.0F);
        this.setRotateAngle(shape14_2, 0.10471975511965977F, 0.0F, 0.0F);
        this.shape1 = new ModelRenderer(this, 75, 0);
        this.shape1.setRotationPoint(-6.0F, 4.0F, -11.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 12, 12, 22, 0.0F);
        this.shape1_3 = new ModelRenderer(this, 104, 34);
        this.shape1_3.setRotationPoint(-4.0F, 5.5F, -29.0F);
        this.shape1_3.addBox(0.0F, 0.0F, 0.0F, 8, 7, 12, 0.0F);
        this.setRotateAngle(shape1_3, 0.06981317007977318F, 0.0F, 0.0F);
        this.shape1_6 = new ModelRenderer(this, 0, 160);
        this.shape1_6.setRotationPoint(-5.0F, 4.5F, -17.0F);
        this.shape1_6.addBox(0.0F, 0.0F, 0.0F, 10, 11, 6, 0.0F);
        this.setRotateAngle(shape1_6, 0.045553093477052F, 0.0F, 0.0F);
        this.shape1_2 = new ModelRenderer(this, 100, 124);
        this.shape1_2.setRotationPoint(-3.0F, 5.0F, 31.0F);
        this.shape1_2.addBox(0.0F, 0.0F, 0.0F, 6, 7, 8, 0.0F);
        this.shape6_3 = new ModelRenderer(this, 100, 150);
        this.shape6_3.setRotationPoint(-0.5F, 5.0F, 36.0F);
        this.shape6_3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 12, 0.0F);
        this.setRotateAngle(shape6_3, 0.4553564018453205F, 0.0F, 0.0F);
        this.shape6_1 = new ModelRenderer(this, 6, 114);
        this.shape6_1.setRotationPoint(0.8F, 15.0F, 16.0F);
        this.shape6_1.addBox(0.0F, 0.0F, 0.0F, 0, 2, 6, 0.0F);
        this.shape6 = new ModelRenderer(this, 0, 33);
        this.shape6.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 1, 6, 8, 0.0F);
        this.setRotateAngle(shape6, 1.2292353921796064F, 0.0F, 0.0F);
        this.shape6_2 = new ModelRenderer(this, 0, 100);
        this.shape6_2.setRotationPoint(0.0F, 12.0F, 32.0F);
        this.shape6_2.addBox(0.0F, 0.0F, 0.0F, 0, 2, 5, 0.0F);
        this.shape6_6 = new ModelRenderer(this, 0, 55);
        this.shape6_6.setRotationPoint(-2.0F, 9.0F, 1.0F);
        this.shape6_6.addBox(0.0F, 0.0F, 0.0F, 1, 7, 14, 0.0F);
        this.setRotateAngle(shape6_6, -0.8196066167365371F, -0.091106186954104F, 0.9560913642424937F);
        this.shape6_4 = new ModelRenderer(this, 100, 170);
        this.shape6_4.setRotationPoint(-0.5F, 7.0F, 38.0F);
        this.shape6_4.addBox(0.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F);
        this.setRotateAngle(shape6_4, -0.22759093446006054F, 0.0F, 0.0F);
        this.shape6_7 = new ModelRenderer(this, 0, 79);
        this.shape6_7.setRotationPoint(1.0F, 10.0F, 1.0F);
        this.shape6_7.addBox(0.0F, 0.0F, 0.0F, 1, 7, 14, 0.0F);
        this.setRotateAngle(shape6_7, -0.8196066167365371F, 0.091106186954104F, -0.9560913642424937F);
        this.shape14_1 = new ModelRenderer(this, 0, 0);
        this.shape14_1.setRotationPoint(-3.1F, 12.0F, -27.0F);
        this.shape14_1.addBox(0.0F, 0.0F, 0.0F, 0, 1, 9, 0.0F);
        this.setRotateAngle(shape14_1, 0.10471975511965977F, 0.0F, 0.0F);
        this.shape14 = new ModelRenderer(this, 0, 0);
        this.shape14.setRotationPoint(3.1F, 12.0F, -27.0F);
        this.shape14.addBox(0.0F, 0.0F, 0.0F, 0, 1, 9, 0.0F);
        this.setRotateAngle(shape14, 0.10471975511965977F, 0.0F, 0.0F);
        this.shape1_4 = new ModelRenderer(this, 110, 56);
        this.shape1_4.setRotationPoint(-3.0F, 12.5F, -26.0F);
        this.shape1_4.addBox(0.0F, 0.0F, 0.0F, 6, 3, 10, 0.0F);
        this.setRotateAngle(shape1_4, 0.045553093477052F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	GlStateManager.pushMatrix();
    	GlStateManager.translate(0, -5, 0);
    	GlStateManager.scale(6, 6, 6);
        this.shape6_5.render(f5);
        this.shape1_1.render(f5);
        this.shape1_5.render(f5);
        this.shape14_2.render(f5);
        this.shape1.render(f5);
        this.shape1_3.render(f5);
        this.shape1_6.render(f5);
        this.shape1_2.render(f5);
        this.shape6_3.render(f5);
        this.shape6_1.render(f5);
        this.shape6.render(f5);
        this.shape6_2.render(f5);
        this.shape6_6.render(f5);
        this.shape6_4.render(f5);
        this.shape6_7.render(f5);
        this.shape14_1.render(f5);
        this.shape14.render(f5);
        this.shape1_4.render(f5);
        GlStateManager.popMatrix();
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
