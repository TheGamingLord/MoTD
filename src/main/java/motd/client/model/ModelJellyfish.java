package motd.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Jellyfish - AguilaDaddy
 * Created using Tabula 7.0.0
 */
public class ModelJellyfish extends ModelBase {
    public ModelRenderer Body1;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer Body4;
    public ModelRenderer Center1;
    public ModelRenderer Center2;
    public ModelRenderer Center3;
    public ModelRenderer Center4;
    public ModelRenderer Side1;
    public ModelRenderer Side2;
    public ModelRenderer Side3;
    public ModelRenderer Side4;

    public ModelJellyfish() {
        this.textureWidth = 200;
        this.textureHeight = 180;
        this.Body1 = new ModelRenderer(this, 57, 6);
        this.Body1.setRotationPoint(-7.0F, -9.0F, -7.0F);
        this.Body1.addBox(0.0F, 0.0F, 0.0F, 16, 4, 16, 0.0F);
        this.Side1 = new ModelRenderer(this, 0, 110);
        this.Side1.setRotationPoint(-4.0F, -4.0F, 6.0F);
        this.Side1.addBox(0.0F, 0.0F, 0.0F, 10, 17, 0, 0.0F);
        this.setRotateAngle(Side1, 0.091106186954104F, 0.0F, 0.0F);
        this.Side4 = new ModelRenderer(this, 0, 100);
        this.Side4.setRotationPoint(-4.0F, -4.0F, -4.0F);
        this.Side4.addBox(0.0F, 0.0F, 0.0F, 0, 17, 10, 0.0F);
        this.setRotateAngle(Side4, 0.0F, 0.0F, 0.091106186954104F);
        this.Body4 = new ModelRenderer(this, 0, 43);
        this.Body4.setRotationPoint(-6.0F, -12.0F, -6.0F);
        this.Body4.addBox(0.0F, 0.0F, 0.0F, 14, 3, 14, 0.0F);
        this.Side3 = new ModelRenderer(this, 0, 110);
        this.Side3.setRotationPoint(-4.0F, -4.0F, -4.0F);
        this.Side3.addBox(0.0F, 0.0F, 0.0F, 10, 17, 0, 0.0F);
        this.setRotateAngle(Side3, -0.091106186954104F, 0.0F, 0.0F);
        this.Center3 = new ModelRenderer(this, 0, 150);
        this.Center3.setRotationPoint(-2.0F, -4.0F, -3.0F);
        this.Center3.addBox(0.0F, 0.0F, 0.0F, 0, 6, 8, 0.0F);
        this.Center4 = new ModelRenderer(this, 0, 158);
        this.Center4.setRotationPoint(-3.0F, -4.0F, -2.0F);
        this.Center4.addBox(0.0F, 0.0F, 0.0F, 8, 6, 0, 0.0F);
        this.Center1 = new ModelRenderer(this, 0, 150);
        this.Center1.setRotationPoint(4.0F, -4.0F, -3.0F);
        this.Center1.addBox(0.0F, 0.0F, 0.0F, 0, 6, 8, 0.0F);
        this.Center2 = new ModelRenderer(this, 0, 158);
        this.Center2.setRotationPoint(-3.0F, -4.0F, 4.0F);
        this.Center2.addBox(0.0F, 0.0F, 0.0F, 8, 6, 0, 0.0F);
        this.Body3 = new ModelRenderer(this, 23, 70);
        this.Body3.setRotationPoint(-5.0F, -5.0F, -5.0F);
        this.Body3.addBox(0.0F, 0.0F, 0.0F, 12, 1, 12, 0.0F);
        this.Body2 = new ModelRenderer(this, 0, 0);
        this.Body2.setRotationPoint(-5.0F, -13.0F, -5.0F);
        this.Body2.addBox(0.0F, 0.0F, 0.0F, 12, 1, 12, 0.0F);
        this.Side2 = new ModelRenderer(this, 0, 100);
        this.Side2.setRotationPoint(6.0F, -4.0F, -4.0F);
        this.Side2.addBox(0.0F, 0.0F, 0.0F, 0, 17, 10, 0.0F);
        this.setRotateAngle(Side2, 0.0F, 0.0F, -0.091106186954104F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	GlStateManager.pushMatrix();
    	GlStateManager.translate(-0.05, 0, -0.05);
    	GlStateManager.enableBlend();
    	GlStateManager.enableCull();
        this.Body1.render(f5);
        this.Side1.render(f5);
        this.Side4.render(f5);
        this.Body4.render(f5);
        this.Side3.render(f5);
        this.Center3.render(f5);
        this.Center4.render(f5);
        this.Center1.render(f5);
        this.Center2.render(f5);
        this.Body3.render(f5);
        this.Body2.render(f5);
        this.Side2.render(f5);
        GlStateManager.disableCull();
        GlStateManager.disableBlend();
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
