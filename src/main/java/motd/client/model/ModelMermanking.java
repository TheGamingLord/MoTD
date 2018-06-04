package motd.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelVillager - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelMermanking extends ModelBase {
    public ModelRenderer field_78191_a;
    public ModelRenderer field_78190_c0;
    public ModelRenderer field_78190_c1;
    public ModelRenderer field_78188_e;
    public ModelRenderer field_78189_b0;
    public ModelRenderer field_78189_b1;
    public ModelRenderer field_78188_e_1;
    public ModelRenderer field_78188_e_2;
    public ModelRenderer shape24;
    public ModelRenderer field_78191_a_1;
    public ModelRenderer field_78191_a_2;
    public ModelRenderer shape24_1;
    public ModelRenderer field_78191_aChild;

    public ModelMermanking() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.shape24_1 = new ModelRenderer(this, 52, 5);
        this.shape24_1.setRotationPoint(0.0F, -13.0F, -1.0F);
        this.shape24_1.addBox(0.0F, 0.0F, 0.0F, 0, 3, 6, 0.0F);
        this.field_78188_e = new ModelRenderer(this, 56, 70);
        this.field_78188_e.setRotationPoint(-2.0F, 11.5F, -0.5F);
        this.field_78188_e.addBox(-2.0F, 0.0F, -2.0F, 8, 5, 5, 0.0F);
        this.setRotateAngle(field_78188_e, 0.18203784098300857F, 0.0F, 0.0F);
        this.field_78190_c0 = new ModelRenderer(this, 44, 22);
        this.field_78190_c0.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.field_78190_c0.addBox(-8.0F, -2.0F, -2.0F, 4, 11, 4, 0.0F);
        this.setRotateAngle(field_78190_c0, 0.2792526803190927F, 0.0F, 0.0F);
        this.field_78191_a = new ModelRenderer(this, 0, 0);
        this.field_78191_a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78191_a.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F);
        this.field_78189_b1 = new ModelRenderer(this, 0, 38);
        this.field_78189_b1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78189_b1.addBox(-4.0F, 0.0F, -3.0F, 8, 6, 6, 0.5F);
        this.field_78189_b0 = new ModelRenderer(this, 16, 20);
        this.field_78189_b0.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78189_b0.addBox(-4.0F, 0.0F, -3.0F, 8, 12, 6, 0.0F);
        this.field_78191_aChild = new ModelRenderer(this, 24, 0);
        this.field_78191_aChild.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.field_78191_aChild.addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);
        this.field_78188_e_2 = new ModelRenderer(this, 0, 67);
        this.field_78188_e_2.setRotationPoint(-5.0F, 20.0F, 3.6F);
        this.field_78188_e_2.addBox(0.0F, 0.0F, 0.0F, 10, 13, 0, 0.0F);
        this.setRotateAngle(field_78188_e_2, 1.5481070465189704F, 0.0F, 0.0F);
        this.field_78191_a_1 = new ModelRenderer(this, 22, 41);
        this.field_78191_a_1.setRotationPoint(-0.5F, -0.8F, -0.5F);
        this.field_78191_a_1.addBox(-4.0F, -9.7F, -4.0F, 9, 4, 9, 0.0F);
        this.field_78190_c1 = new ModelRenderer(this, 44, 22);
        this.field_78190_c1.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.field_78190_c1.addBox(4.0F, -2.0F, -2.0F, 4, 11, 4, 0.0F);
        this.setRotateAngle(field_78190_c1, 0.2792526803190927F, 0.0F, 0.0F);
        this.field_78191_a_2 = new ModelRenderer(this, 56, 15);
        this.field_78191_a_2.setRotationPoint(0.0F, 7.6F, -0.6F);
        this.field_78191_a_2.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 1, 0.0F);
        this.shape24 = new ModelRenderer(this, 0, -3);
        this.shape24.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.shape24.addBox(0.0F, 0.0F, 0.0F, 0, 6, 3, 0.0F);
        this.field_78188_e_1 = new ModelRenderer(this, 44, 0);
        this.field_78188_e_1.setRotationPoint(-3.0F, 16.7F, -0.8F);
        this.field_78188_e_1.addBox(0.0F, 0.0F, 0.0F, 6, 7, 4, 0.0F);
        this.setRotateAngle(field_78188_e_1, 0.9105382707654417F, 0.0F, 0.0F);
        this.field_78191_a.addChild(this.field_78191_aChild);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape24_1.render(f5);
        this.field_78188_e.render(f5);
        this.field_78190_c0.render(f5);
        this.field_78191_a.render(f5);
        this.field_78189_b1.render(f5);
        this.field_78189_b0.render(f5);
        this.field_78188_e_2.render(f5);
        this.field_78191_a_1.render(f5);
        this.field_78190_c1.render(f5);
        this.field_78191_a_2.render(f5);
        this.shape24.render(f5);
        this.field_78188_e_1.render(f5);
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
