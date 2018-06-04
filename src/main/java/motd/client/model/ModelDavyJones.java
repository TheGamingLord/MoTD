package motd.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelIllager - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelDavyJones extends ModelBase {
    public ModelRenderer field_191217_a;
    public ModelRenderer field_191223_g;
    public ModelRenderer field_191220_d;
    public ModelRenderer field_191221_e;
    public ModelRenderer field_191224_h;
    public ModelRenderer field_191218_b0;
    public ModelRenderer field_191218_b1;
    public ModelRenderer field_78201_b7;
    public ModelRenderer field_78201_b7_1;
    public ModelRenderer shape15;
    public ModelRenderer shape15_1;
    public ModelRenderer field_191224_h_1;
    public ModelRenderer field_191224_h_2;
    public ModelRenderer field_78201_b7_2;
    public ModelRenderer field_78201_b7_3;
    public ModelRenderer field_78201_b7_4;
    public ModelRenderer field_78201_b7_5;
    public ModelRenderer field_191224_h_3;
    public ModelRenderer field_78201_b7_6;
    public ModelRenderer field_78201_b7_7;
    public ModelRenderer field_78201_b7_8;
    public ModelRenderer field_78201_b7_9;
    public ModelRenderer field_78201_b7_10;
    public ModelRenderer field_78201_b7_11;
    public ModelRenderer field_78201_b7_12;
    public ModelRenderer field_78201_b7_13;
    public ModelRenderer field_78201_b7_14;
    public ModelRenderer field_78201_b7_15;
    public ModelRenderer field_78201_b7_16;

    public ModelDavyJones() {
        this.textureWidth = 70;
        this.textureHeight = 70;
        this.field_78201_b7_11 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_11.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.field_78201_b7_11.addBox(1.7F, -1.3F, -3.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_11, -0.2574360646691636F, 0.0F, -0.8927154408039257F);
        this.field_78201_b7_5 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_5.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.field_78201_b7_5.addBox(0.2F, -1.3F, -3.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_5, -0.2574360646691636F, 0.0F, -0.15707963267948966F);
        this.field_191224_h_1 = new ModelRenderer(this, 46, 43);
        this.field_191224_h_1.mirror = true;
        this.field_191224_h_1.setRotationPoint(4.0F, 13.5F, 0.0F);
        this.field_191224_h_1.addBox(0.0F, -2.0F, -2.0F, 1, 3, 4, 0.0F);
        this.field_78201_b7_7 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_7.setRotationPoint(0.3F, 0.2F, 0.0F);
        this.field_78201_b7_7.addBox(0.2F, 2.2F, -3.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_7, -0.2574360646691636F, 0.0F, -0.12217304763960307F);
        this.shape15_1 = new ModelRenderer(this, 0, 44);
        this.shape15_1.setRotationPoint(-4.2F, 19.0F, -1.1F);
        this.shape15_1.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(shape15_1, 0.0F, 0.0F, -0.13962634015954636F);
        this.field_78201_b7_10 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_10.setRotationPoint(0.0F, 1.2F, 1.0F);
        this.field_78201_b7_10.addBox(-4.7F, 1.5F, -3.8F, 1, 3, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_10, -0.1902408884673819F, 0.07260569688296412F, 0.8873253917139171F);
        this.field_191223_g = new ModelRenderer(this, 32, 0);
        this.field_191223_g.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_191223_g.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_191218_b1 = new ModelRenderer(this, 18, 32);
        this.field_191218_b1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_191218_b1.addBox(-4.0F, 0.0F, -3.0F, 8, 18, 6, 0.5F);
        this.field_191221_e = new ModelRenderer(this, 28, 16);
        this.field_191221_e.mirror = true;
        this.field_191221_e.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.field_191221_e.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78201_b7_2 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_2.setRotationPoint(-7.9F, 10.0F, -1.1F);
        this.field_78201_b7_2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_2, 0.0F, 0.0F, -0.08726646259971647F);
        this.field_78201_b7_15 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_15.setRotationPoint(1.0F, 0.0F, 0.3F);
        this.field_78201_b7_15.addBox(1.7F, -1.3F, -3.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_15, -0.2574360646691636F, 0.0F, -0.5894758341568066F);
        this.field_191224_h_2 = new ModelRenderer(this, 46, 32);
        this.field_191224_h_2.mirror = true;
        this.field_191224_h_2.setRotationPoint(5.9F, 12.4F, -0.5F);
        this.field_191224_h_2.addBox(0.0F, -2.0F, -2.0F, 3, 4, 5, 0.0F);
        this.field_78201_b7_8 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_8.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.field_78201_b7_8.addBox(0.2F, 1.2F, -3.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_8, -0.2574360646691636F, 0.0F, -0.15707963267948966F);
        this.field_191220_d = new ModelRenderer(this, 48, 0);
        this.field_191220_d.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.field_191220_d.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.field_78201_b7_16 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_16.setRotationPoint(1.7F, 0.0F, -0.9F);
        this.field_78201_b7_16.addBox(-2.9F, 2.0F, -3.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_16, -0.15271630954950383F, 0.0F, 0.08726646259971647F);
        this.field_78201_b7_6 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_6.setRotationPoint(1.7F, 0.0F, -0.9F);
        this.field_78201_b7_6.addBox(-2.9F, -1.3F, -3.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_6, -0.15271630954950383F, 0.0F, 0.08726646259971647F);
        this.field_191217_a = new ModelRenderer(this, 0, 0);
        this.field_191217_a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_191217_a.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F);
        this.field_191224_h_3 = new ModelRenderer(this, 46, 32);
        this.field_191224_h_3.mirror = true;
        this.field_191224_h_3.setRotationPoint(6.3F, 14.5F, 0.0F);
        this.field_191224_h_3.addBox(0.0F, -2.0F, -2.0F, 2, 4, 4, 0.0F);
        this.setRotateAngle(field_191224_h_3, 0.0F, 0.0F, 0.23527038316883564F);
        this.field_191224_h = new ModelRenderer(this, 44, 16);
        this.field_191224_h.mirror = true;
        this.field_191224_h.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.field_191224_h.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78201_b7 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7.setRotationPoint(0.3F, 0.2F, 0.0F);
        this.field_78201_b7.addBox(0.2F, -1.3F, -3.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7, -0.2574360646691636F, 0.0F, -0.12217304763960307F);
        this.field_78201_b7_3 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_3.setRotationPoint(0.0F, 1.2F, 1.0F);
        this.field_78201_b7_3.addBox(-4.7F, 0.3F, -3.8F, 1, 3, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_3, -0.1902408884673819F, 0.07260569688296412F, 0.8873253917139171F);
        this.field_78201_b7_13 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_13.setRotationPoint(1.0F, 0.0F, 0.3F);
        this.field_78201_b7_13.addBox(-4.9F, -1.3F, -3.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_13, -0.2574360646691636F, 0.0F, 0.360410490536829F);
        this.field_78201_b7_14 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_14.setRotationPoint(1.0F, 0.0F, 0.3F);
        this.field_78201_b7_14.addBox(1.7F, 1.2F, -3.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_14, -0.2574360646691636F, 0.0F, -0.589397688398485F);
        this.field_191218_b0 = new ModelRenderer(this, 0, 18);
        this.field_191218_b0.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.field_191218_b0.addBox(-4.0F, 0.0F, -3.0F, 8, 12, 4, 0.0F);
        this.field_78201_b7_9 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_9.setRotationPoint(0.0F, 0.0F, -0.9F);
        this.field_78201_b7_9.addBox(-2.9F, 1.2F, -3.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_9, -0.2574360646691636F, 0.0F, 0.10471975511965977F);
        this.field_78201_b7_12 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_12.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.field_78201_b7_12.addBox(1.7F, 0.2F, -3.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_12, -0.2574360646691636F, 0.0F, -0.8927359123950995F);
        this.field_78201_b7_4 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_4.setRotationPoint(0.0F, 0.0F, -0.9F);
        this.field_78201_b7_4.addBox(-2.9F, -1.3F, -3.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_4, -0.2574360646691636F, 0.0F, 0.10471975511965977F);
        this.field_78201_b7_1 = new ModelRenderer(this, 64, 0);
        this.field_78201_b7_1.setRotationPoint(1.0F, 0.0F, 0.3F);
        this.field_78201_b7_1.addBox(-4.9F, 1.2F, -3.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(field_78201_b7_1, -0.2574360646691636F, 0.0F, 0.360410490536829F);
        this.shape15 = new ModelRenderer(this, 0, 34);
        this.shape15.setRotationPoint(-3.6F, 14.3F, -1.6F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(shape15, 0.0F, 0.0F, 0.12217304763960307F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78201_b7_11.render(f5);
        this.field_78201_b7_5.render(f5);
        this.field_191224_h_1.render(f5);
        this.field_78201_b7_7.render(f5);
        this.shape15_1.render(f5);
        this.field_78201_b7_10.render(f5);
        this.field_191223_g.render(f5);
        this.field_191218_b1.render(f5);
        this.field_191221_e.render(f5);
        this.field_78201_b7_2.render(f5);
        this.field_78201_b7_15.render(f5);
        this.field_191224_h_2.render(f5);
        this.field_78201_b7_8.render(f5);
        this.field_191220_d.render(f5);
        this.field_78201_b7_16.render(f5);
        this.field_78201_b7_6.render(f5);
        this.field_191217_a.render(f5);
        this.field_191224_h_3.render(f5);
        this.field_191224_h.render(f5);
        this.field_78201_b7.render(f5);
        this.field_78201_b7_3.render(f5);
        this.field_78201_b7_13.render(f5);
        this.field_78201_b7_14.render(f5);
        this.field_191218_b0.render(f5);
        this.field_78201_b7_9.render(f5);
        this.field_78201_b7_12.render(f5);
        this.field_78201_b7_4.render(f5);
        this.field_78201_b7_1.render(f5);
        this.shape15.render(f5);
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
