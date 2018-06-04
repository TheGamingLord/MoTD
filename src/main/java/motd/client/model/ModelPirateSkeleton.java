package motd.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSkeleton - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPirateSkeleton extends ModelBase {
    public ModelRenderer field_178723_h;
    public ModelRenderer field_178721_j;
    public ModelRenderer field_78115_e;
    public ModelRenderer field_178724_i;
    public ModelRenderer field_178722_k;
    public ModelRenderer field_191218_b1;
    public ModelRenderer field_191224_h;
    public ModelRenderer field_191224_h_1;
    public ModelRenderer field_78116_c;

    public ModelPirateSkeleton() {
        this.textureWidth = 70;
        this.textureHeight = 70;
        this.field_178724_i = new ModelRenderer(this, 40, 0);
        this.field_178724_i.mirror = true;
        this.field_178724_i.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.field_178724_i.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F);
        this.setRotateAngle(field_178724_i, 0.0F, 0.0F, -0.10000000149011613F);
        this.field_178723_h = new ModelRenderer(this, 0, 0);
        this.field_178723_h.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_178723_h.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F);
        this.setRotateAngle(field_178723_h, 0.0F, 0.0F, 0.10000000149011613F);
        this.field_78115_e = new ModelRenderer(this, 16, 0);
        this.field_78115_e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78115_e.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.field_191224_h = new ModelRenderer(this, 0, 14);
        this.field_191224_h.mirror = true;
        this.field_191224_h.setRotationPoint(3.9F, -0.1F, -2.1F);
        this.field_191224_h.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.field_178721_j = new ModelRenderer(this, 8, 0);
        this.field_178721_j.setRotationPoint(-2.0F, 12.0F, 0.10000000149011612F);
        this.field_178721_j.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.field_191224_h_1 = new ModelRenderer(this, 16, 16);
        this.field_191224_h_1.setRotationPoint(-8.0F, -0.1F, -2.1F);
        this.field_191224_h_1.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.field_78116_c = new ModelRenderer(this, 0, 32);
        this.field_78116_c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_c.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.field_191218_b1 = new ModelRenderer(this, 34, 14);
        this.field_191218_b1.setRotationPoint(-4.0F, 0.5F, -3.0F);
        this.field_191218_b1.addBox(0.0F, 0.0F, 0.0F, 8, 18, 6, 0.5F);
        this.field_178722_k = new ModelRenderer(this, 48, 0);
        this.field_178722_k.mirror = true;
        this.field_178722_k.setRotationPoint(2.0F, 12.0F, 0.10000000149011612F);
        this.field_178722_k.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_178724_i.render(f5);
        this.field_178723_h.render(f5);
        this.field_78115_e.render(f5);
        this.field_191224_h.render(f5);
        this.field_178721_j.render(f5);
        this.field_191224_h_1.render(f5);
        this.field_78116_c.render(f5);
        this.field_191218_b1.render(f5);
        this.field_178722_k.render(f5);
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
