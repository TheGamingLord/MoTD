package motd.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * KingCrab - Aguila
 * Created using Tabula 7.0.0
 */
public class ModelKingCrab extends ModelBase {
    public ModelRenderer Torso1;
    public ModelRenderer Stomach;
    public ModelRenderer Torso3;
    public ModelRenderer Torso2;
    public ModelRenderer Eyewires;
    public ModelRenderer Eyewires2;
    public ModelRenderer Eyeball;
    public ModelRenderer Eyeball2;
    public ModelRenderer arm1;
    public ModelRenderer arm2;
    public ModelRenderer Wrist;
    public ModelRenderer claw4;
    public ModelRenderer claw3;
    public ModelRenderer Arm3;
    public ModelRenderer claw1;
    public ModelRenderer claw2;
    public ModelRenderer leg1;
    public ModelRenderer leg1_1;
    public ModelRenderer leg2;
    public ModelRenderer leg2_1;
    public ModelRenderer leg3;
    public ModelRenderer leg3_1;
    public ModelRenderer leg6;
    public ModelRenderer leg6_1;
    public ModelRenderer leg5;
    public ModelRenderer leg5_1;
    public ModelRenderer leg4;
    public ModelRenderer leg4_1;

    public ModelKingCrab() {
        this.textureWidth = 150;
        this.textureHeight = 100;
        this.Eyeball = new ModelRenderer(this, 10, 20);
        this.Eyeball.setRotationPoint(3.0F, 8.0F, -5.0F);
        this.Eyeball.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.arm2 = new ModelRenderer(this, 0, 51);
        this.arm2.setRotationPoint(10.0F, 16.0F, -15.0F);
        this.arm2.addBox(0.0F, 0.0F, 0.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(arm2, 0.0F, -0.6829473363053812F, -0.25234331848892855F);
        this.leg6_1 = new ModelRenderer(this, 16, 0);
        this.leg6_1.setRotationPoint(-16.0F, 24.0F, -4.0F);
        this.leg6_1.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg6_1, 0.0F, 0.0F, -1.730144887501979F);
        this.Eyewires = new ModelRenderer(this, 0, 20);
        this.Eyewires.setRotationPoint(3.0F, 10.0F, -5.0F);
        this.Eyewires.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.Torso1 = new ModelRenderer(this, 67, 28);
        this.Torso1.setRotationPoint(-11.0F, 15.0F, -9.0F);
        this.Torso1.addBox(0.0F, 0.0F, 0.0F, 22, 4, 19, 0.0F);
        this.leg6 = new ModelRenderer(this, 16, 0);
        this.leg6.setRotationPoint(-16.7F, 18.0F, -4.0F);
        this.leg6.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg6, 0.0F, 0.0F, -0.31869712141416456F);
        this.claw1 = new ModelRenderer(this, 0, 39);
        this.claw1.setRotationPoint(-7.0F, 17.5F, -12.0F);
        this.claw1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(claw1, 0.0F, 1.0471975511965976F, 0.31869712141416456F);
        this.arm1 = new ModelRenderer(this, 0, 47);
        this.arm1.setRotationPoint(9.0F, 16.0F, -7.0F);
        this.arm1.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(arm1, 0.0F, 0.9105382707654417F, 0.0F);
        this.Arm3 = new ModelRenderer(this, 0, 30);
        this.Arm3.setRotationPoint(-12.0F, 16.0F, -10.0F);
        this.Arm3.addBox(0.0F, 0.0F, 0.0F, 6, 3, 3, 0.0F);
        this.setRotateAngle(Arm3, 0.024609142453120045F, 0.7740535232594852F, 0.136659280431156F);
        this.leg2 = new ModelRenderer(this, 16, 0);
        this.leg2.setRotationPoint(11.0F, 16.0F, 1.0F);
        this.leg2.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg2, 0.0F, 0.0F, 0.31869712141416456F);
        this.Stomach = new ModelRenderer(this, 99, 51);
        this.Stomach.setRotationPoint(-7.0F, 19.0F, -5.0F);
        this.Stomach.addBox(0.0F, 0.0F, 0.0F, 14, 1, 11, 0.0F);
        this.leg5_1 = new ModelRenderer(this, 16, 0);
        this.leg5_1.setRotationPoint(-16.0F, 24.0F, 1.0F);
        this.leg5_1.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg5_1, 0.0F, 0.0F, -1.730144887501979F);
        this.claw3 = new ModelRenderer(this, 0, 65);
        this.claw3.setRotationPoint(2.0F, 18.0F, -17.5F);
        this.claw3.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(claw3, 0.0F, 0.0F, -0.18203784098300857F);
        this.leg1 = new ModelRenderer(this, 16, 0);
        this.leg1.setRotationPoint(11.0F, 16.0F, 6.0F);
        this.leg1.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg1, 0.0F, 0.0F, 0.31869712141416456F);
        this.leg1_1 = new ModelRenderer(this, 16, 0);
        this.leg1_1.setRotationPoint(17.0F, 18.0F, 6.0F);
        this.leg1_1.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg1_1, 0.0F, 0.0F, 1.730144887501979F);
        this.claw2 = new ModelRenderer(this, 0, 39);
        this.claw2.setRotationPoint(-8.0F, 17.5F, -14.0F);
        this.claw2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(claw2, 0.0F, 0.5918411493512771F, 0.27314402793711257F);
        this.Wrist = new ModelRenderer(this, 0, 57);
        this.Wrist.setRotationPoint(7.0F, 16.0F, -17.0F);
        this.Wrist.addBox(0.0F, 0.0F, 0.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(Wrist, 0.0F, -0.40980330836826856F, -0.18203784098300857F);
        this.Eyeball2 = new ModelRenderer(this, 4, 20);
        this.Eyeball2.setRotationPoint(-5.0F, 8.0F, -5.0F);
        this.Eyeball2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.leg3 = new ModelRenderer(this, 16, 0);
        this.leg3.setRotationPoint(11.1F, 16.0F, -4.0F);
        this.leg3.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg3, 0.0F, 0.0F, 0.31869712141416456F);
        this.Eyewires2 = new ModelRenderer(this, 0, 20);
        this.Eyewires2.setRotationPoint(-4.0F, 10.0F, -5.0F);
        this.Eyewires2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.Torso2 = new ModelRenderer(this, 82, 11);
        this.Torso2.setRotationPoint(-9.0F, 13.0F, -7.0F);
        this.Torso2.addBox(0.0F, 0.0F, 0.0F, 18, 2, 15, 0.0F);
        this.leg4_1 = new ModelRenderer(this, 16, 0);
        this.leg4_1.setRotationPoint(-16.0F, 24.0F, 6.0F);
        this.leg4_1.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg4_1, 0.0F, 0.0F, -1.730144887501979F);
        this.Torso3 = new ModelRenderer(this, 107, 0);
        this.Torso3.setRotationPoint(-6.0F, 11.0F, -3.0F);
        this.Torso3.addBox(0.0F, 0.0F, 0.0F, 12, 2, 9, 0.0F);
        this.leg2_1 = new ModelRenderer(this, 16, 0);
        this.leg2_1.setRotationPoint(17.0F, 18.0F, 1.0F);
        this.leg2_1.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg2_1, 0.0F, 0.0F, 1.730144887501979F);
        this.leg4 = new ModelRenderer(this, 16, 0);
        this.leg4.setRotationPoint(-16.7F, 18.0F, 6.0F);
        this.leg4.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg4, 0.0F, 0.0F, -0.31869712141416456F);
        this.claw4 = new ModelRenderer(this, 0, 39);
        this.claw4.setRotationPoint(3.0F, 18.0F, -16.0F);
        this.claw4.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(claw4, 0.0F, -0.4553564018453205F, 0.0F);
        this.leg5 = new ModelRenderer(this, 16, 0);
        this.leg5.mirror = true;
        this.leg5.setRotationPoint(-16.7F, 18.0F, 1.0F);
        this.leg5.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg5, 0.0F, 0.0F, -0.31869712141416456F);
        this.leg3_1 = new ModelRenderer(this, 16, 0);
        this.leg3_1.setRotationPoint(17.0F, 18.0F, -4.0F);
        this.leg3_1.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        this.setRotateAngle(leg3_1, 0.0F, 0.0F, 1.730144887501979F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Eyeball.render(f5);
        this.arm2.render(f5);
        this.leg6_1.render(f5);
        this.Eyewires.render(f5);
        this.Torso1.render(f5);
        this.leg6.render(f5);
        this.claw1.render(f5);
        this.arm1.render(f5);
        this.Arm3.render(f5);
        this.leg2.render(f5);
        this.Stomach.render(f5);
        this.leg5_1.render(f5);
        this.claw3.render(f5);
        this.leg1.render(f5);
        this.leg1_1.render(f5);
        this.claw2.render(f5);
        this.Wrist.render(f5);
        this.Eyeball2.render(f5);
        this.leg3.render(f5);
        this.Eyewires2.render(f5);
        this.Torso2.render(f5);
        this.leg4_1.render(f5);
        this.Torso3.render(f5);
        this.leg2_1.render(f5);
        this.leg4.render(f5);
        this.claw4.render(f5);
        this.leg5.render(f5);
        this.leg3_1.render(f5);
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
