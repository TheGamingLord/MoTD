package motd.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * White Whale - AguilaDaddy
 * Created using Tabula 7.0.0
 */
public class ModelWhiteWhale extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape1_1;
    public ModelRenderer shape1_2;
    public ModelRenderer shape1_3;
    public ModelRenderer shape1_4;
    public ModelRenderer shape1_5;
    public ModelRenderer shape1_6;
    public ModelRenderer shape1_7;
    public ModelRenderer shape1_8;
    public ModelRenderer shape1_9;
    public ModelRenderer shape15;

    public ModelWhiteWhale() {
        this.textureWidth = 100;
        this.textureHeight = 150;
        this.shape1 = new ModelRenderer(this, 0, 118);
        this.shape1.setRotationPoint(-5.0F, 1.0F, -10.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 9, 12, 20, 0.0F);
        this.shape1_3 = new ModelRenderer(this, 0, 60);
        this.shape1_3.setRotationPoint(-2.0F, 2.0F, 34.0F);
        this.shape1_3.addBox(0.0F, 0.0F, 0.0F, 3, 5, 8, 0.0F);
        this.shape1_4 = new ModelRenderer(this, 34, 28);
        this.shape1_4.setRotationPoint(-4.0F, 1.0F, -30.0F);
        this.shape1_4.addBox(0.0F, 0.0F, 0.0F, 7, 10, 20, 0.0F);
        this.shape15 = new ModelRenderer(this, 0, 26);
        this.shape15.setRotationPoint(-3.0F, 11.0F, -15.0F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 5, 1, 5, 0.0F);
        this.shape1_6 = new ModelRenderer(this, 64, 0);
        this.shape1_6.setRotationPoint(-2.0F, 3.0F, 37.5F);
        this.shape1_6.addBox(0.0F, 0.0F, 0.0F, 5, 2, 11, 0.0F);
        this.setRotateAngle(shape1_6, 0.0F, -1.1383037381507017F, 0.0F);
        this.shape1_9 = new ModelRenderer(this, 64, 14);
        this.shape1_9.setRotationPoint(-5.0F, 11.0F, -6.5F);
        this.shape1_9.addBox(0.0F, 0.0F, 0.0F, 5, 1, 10, 0.0F);
        this.setRotateAngle(shape1_9, -0.136659280431156F, -0.9105382707654417F, -0.22759093446006054F);
        this.shape1_5 = new ModelRenderer(this, 49, 66);
        this.shape1_5.setRotationPoint(-2.0F, 12.0F, -27.0F);
        this.shape1_5.addBox(0.0F, 0.0F, 0.0F, 3, 1, 12, 0.0F);
        this.setRotateAngle(shape1_5, 0.08726646259971647F, 0.0F, 0.0F);
        this.shape1_7 = new ModelRenderer(this, 64, 0);
        this.shape1_7.setRotationPoint(-1.0F, 3.0F, 42.0F);
        this.shape1_7.addBox(0.0F, 0.0F, 0.0F, 5, 2, 11, 0.0F);
        this.setRotateAngle(shape1_7, 0.0F, 1.1383037381507017F, 0.0F);
        this.shape1_2 = new ModelRenderer(this, 0, 75);
        this.shape1_2.setRotationPoint(-3.0F, 1.6F, 23.0F);
        this.shape1_2.addBox(0.0F, 0.0F, 0.0F, 5, 8, 11, 0.0F);
        this.shape1_1 = new ModelRenderer(this, 0, 94);
        this.shape1_1.setRotationPoint(-4.0F, 1.2F, 10.0F);
        this.shape1_1.addBox(0.0F, 0.0F, 0.0F, 7, 10, 13, 0.0F);
        this.shape1_8 = new ModelRenderer(this, 64, 14);
        this.shape1_8.setRotationPoint(1.0F, 10.0F, -2.5F);
        this.shape1_8.addBox(0.0F, 0.0F, 0.0F, 5, 1, 10, 0.0F);
        this.setRotateAngle(shape1_8, -0.136659280431156F, 0.9105382707654417F, 0.22759093446006054F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape1.render(f5);
        this.shape1_3.render(f5);
        this.shape1_4.render(f5);
        this.shape15.render(f5);
        this.shape1_6.render(f5);
        this.shape1_9.render(f5);
        this.shape1_5.render(f5);
        this.shape1_7.render(f5);
        this.shape1_2.render(f5);
        this.shape1_1.render(f5);
        this.shape1_8.render(f5);
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
