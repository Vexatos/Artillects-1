// Date: 12/16/2013 8:15:38 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package artillects.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFabricator extends ModelArtillect
{
    //fields
    ModelRenderer Buttock;
    ModelRenderer Body;
    ModelRenderer UpperBackLeg1;
    ModelRenderer Lower_Mandible;
    ModelRenderer BackAxil;
    ModelRenderer UpperBackLeg2;
    ModelRenderer LowerBackLeg2;
    ModelRenderer LowerBackLeg1;
    ModelRenderer FrontAxil;
    ModelRenderer UpperFrontLeg1;
    ModelRenderer LowerFrontLeg1;
    ModelRenderer UpperFrontLeg2;
    ModelRenderer LowerFrontLeg2;
    ModelRenderer Face;
    ModelRenderer High_Mandible;

    public ModelFabricator()
    {
        textureWidth = 32;
        textureHeight = 64;

        Buttock = new ModelRenderer(this, 0, 13);
        Buttock.addBox(0F, 0F, 0F, 6, 5, 4);
        Buttock.setRotationPoint(-3F, 16F, 4F);
        Buttock.setTextureSize(32, 64);
        Buttock.mirror = true;
        setRotation(Buttock, 0F, 0F, 0F);
        Body = new ModelRenderer(this, 0, 23);
        Body.addBox(0F, 0F, 0F, 8, 7, 4);
        Body.setRotationPoint(-4F, 15F, 0F);
        Body.setTextureSize(32, 64);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        UpperBackLeg1 = new ModelRenderer(this, 0, 35);
        UpperBackLeg1.addBox(-0.5F, -1F, -1F, 1, 5, 2);
        UpperBackLeg1.setRotationPoint(-4.5F, 18F, 4.8F);
        UpperBackLeg1.setTextureSize(32, 64);
        UpperBackLeg1.mirror = true;
        setRotation(UpperBackLeg1, 0.5452863F, 0F, 0F);
        Lower_Mandible = new ModelRenderer(this, 0, 43);
        Lower_Mandible.addBox(0F, 0F, 0F, 2, 1, 6);
        Lower_Mandible.setRotationPoint(-1F, 21F, -8F);
        Lower_Mandible.setTextureSize(32, 64);
        Lower_Mandible.mirror = true;
        setRotation(Lower_Mandible, 0F, 0F, 0F);
        BackAxil = new ModelRenderer(this, 7, 35);
        BackAxil.addBox(0F, 0F, 0F, 8, 1, 1);
        BackAxil.setRotationPoint(-4F, 17.5F, 4.3F);
        BackAxil.setTextureSize(32, 64);
        BackAxil.mirror = true;
        setRotation(BackAxil, 0F, 0F, 0F);
        UpperBackLeg2 = new ModelRenderer(this, 0, 35);
        UpperBackLeg2.addBox(-0.5F, -1F, -1F, 1, 5, 2);
        UpperBackLeg2.setRotationPoint(4.5F, 18F, 4.8F);
        UpperBackLeg2.setTextureSize(32, 64);
        UpperBackLeg2.mirror = true;
        setRotation(UpperBackLeg2, 0.5452863F, 0F, 0F);
        LowerBackLeg2 = new ModelRenderer(this, 0, 51);
        LowerBackLeg2.addBox(-1F, -1F, -0.6F, 2, 4, 2);
        LowerBackLeg2.setRotationPoint(4.5F, 21F, 6.5F);
        LowerBackLeg2.setTextureSize(32, 64);
        LowerBackLeg2.mirror = true;
        setRotation(LowerBackLeg2, 0F, 0F, 0F);
        LowerBackLeg1 = new ModelRenderer(this, 0, 51);
        LowerBackLeg1.addBox(-1F, -1F, -0.6F, 2, 4, 2);
        LowerBackLeg1.setRotationPoint(-4.5F, 21F, 6.5F);
        LowerBackLeg1.setTextureSize(32, 64);
        LowerBackLeg1.mirror = true;
        setRotation(LowerBackLeg1, 0F, 0F, 0F);
        FrontAxil = new ModelRenderer(this, 7, 35);
        FrontAxil.addBox(0F, 0F, 0F, 8, 1, 1);
        FrontAxil.setRotationPoint(-4F, 17.5F, -4F);
        FrontAxil.setTextureSize(32, 64);
        FrontAxil.mirror = true;
        setRotation(FrontAxil, 0F, 0F, 0F);
        UpperFrontLeg1 = new ModelRenderer(this, 0, 35);
        UpperFrontLeg1.addBox(-0.5F, -1F, -1F, 1, 5, 2);
        UpperFrontLeg1.setRotationPoint(-4.5F, 18F, -3.5F);
        UpperFrontLeg1.setTextureSize(32, 64);
        UpperFrontLeg1.mirror = true;
        setRotation(UpperFrontLeg1, 0.5452863F, 0F, 0F);
        LowerFrontLeg1 = new ModelRenderer(this, 0, 51);
        LowerFrontLeg1.addBox(-1F, -1F, -0.6F, 2, 4, 2);
        LowerFrontLeg1.setRotationPoint(-4.5F, 21F, -1.8F);
        LowerFrontLeg1.setTextureSize(32, 64);
        LowerFrontLeg1.mirror = true;
        setRotation(LowerFrontLeg1, 0F, 0F, 0F);
        UpperFrontLeg2 = new ModelRenderer(this, 0, 35);
        UpperFrontLeg2.addBox(-0.5F, -1F, -1F, 1, 5, 2);
        UpperFrontLeg2.setRotationPoint(4.5F, 18F, -3.5F);
        UpperFrontLeg2.setTextureSize(32, 64);
        UpperFrontLeg2.mirror = true;
        setRotation(UpperFrontLeg2, 0.5452863F, 0F, 0F);
        LowerFrontLeg2 = new ModelRenderer(this, 0, 51);
        LowerFrontLeg2.addBox(-1F, -1F, -0.6F, 2, 4, 2);
        LowerFrontLeg2.setRotationPoint(4.5F, 21F, -1.8F);
        LowerFrontLeg2.setTextureSize(32, 64);
        LowerFrontLeg2.mirror = true;
        setRotation(LowerFrontLeg2, 0F, 0F, 0F);
        Face = new ModelRenderer(this, 0, 0);
        Face.addBox(0F, 0F, 0F, 6, 5, 7);
        Face.setRotationPoint(-3F, 16F, -7F);
        Face.setTextureSize(32, 64);
        Face.mirror = true;
        setRotation(Face, 0F, 0F, 0F);
        High_Mandible = new ModelRenderer(this, 0, 43);
        High_Mandible.addBox(0F, 0F, 0F, 2, 1, 6);
        High_Mandible.setRotationPoint(-1F, 15F, -8F);
        High_Mandible.setTextureSize(32, 64);
        High_Mandible.mirror = true;
        setRotation(High_Mandible, 0F, 0F, 0F);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        this.render(par7);
    }

    @Override
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
    {
        // Yaw
        //this.cannon.rotateAngleY = par4 / (180F / (float) Math.PI);
        // Pitch
        // this.cannon.rotateAngleX = par5 / (180F / (float) Math.PI);
    }

    @Override
    public void render(float f5)
    {
        Buttock.render(f5);
        Body.render(f5);
        UpperBackLeg1.render(f5);
        Lower_Mandible.render(f5);
        BackAxil.render(f5);
        UpperBackLeg2.render(f5);
        LowerBackLeg2.render(f5);
        LowerBackLeg1.render(f5);
        FrontAxil.render(f5);
        UpperFrontLeg1.render(f5);
        LowerFrontLeg1.render(f5);
        UpperFrontLeg2.render(f5);
        LowerFrontLeg2.render(f5);
        Face.render(f5);
        High_Mandible.render(f5);
    }

}
