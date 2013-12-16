package com.superhemi.PirateCraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPirate extends ModelBase
{
	  //fields
	    ModelRenderer head;
	    ModelRenderer body;
	    ModelRenderer rightarm;
	    ModelRenderer leftarm;
	    ModelRenderer rightleg;
	    ModelRenderer leftleg;
	    ModelRenderer hatright;
	    ModelRenderer hatbaseright;
	    ModelRenderer hatbaseleft;
	    ModelRenderer hatbase;
	    ModelRenderer hatbackside;
	    ModelRenderer hatleftside;
	    ModelRenderer hatcenter;
	    ModelRenderer hatrightside;
	    ModelRenderer hatfront;
	    ModelRenderer hatleft;

	    public int heldItemLeft;
	    public int heldItemRight;
	    public boolean isSneak;
	      
	  public ModelPirate()
	  {
	    textureWidth = 64;
	    textureHeight = 64;
	    
	      head = new ModelRenderer(this, 0, 31);
	      head.addBox(-4F, -8F, -4F, 8, 8, 8);
	      head.setRotationPoint(0F, 0F, 0F);
	      head.setTextureSize(64, 64);
	      head.mirror = true;
	      setRotation(head, 0F, 0F, 0F);
	      body = new ModelRenderer(this, 17, 48);
	      body.addBox(-4F, 0F, -2F, 8, 12, 4);
	      body.setRotationPoint(0F, 0F, 0F);
	      body.setTextureSize(64, 64);
	      body.mirror = true;
	      setRotation(body, 0F, 0F, 0F);
	      rightarm = new ModelRenderer(this, 42, 48);
	      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
	      rightarm.setRotationPoint(-5F, 2F, 0F);
	      rightarm.setTextureSize(64, 64);
	      rightarm.mirror = true;
	      setRotation(rightarm, 0F, 0F, 0F);
	      leftarm = new ModelRenderer(this, 42, 48);
	      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
	      leftarm.setRotationPoint(5F, 2F, 0F);
	      leftarm.setTextureSize(64, 64);
	      leftarm.mirror = true;
	      setRotation(leftarm, 0F, 0F, 0F);
	      rightleg = new ModelRenderer(this, 0, 48);
	      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
	      rightleg.setRotationPoint(-2F, 12F, 0F);
	      rightleg.setTextureSize(64, 64);
	      rightleg.mirror = true;
	      setRotation(rightleg, 0F, 0F, 0F);
	      leftleg = new ModelRenderer(this, 0, 48);
	      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
	      leftleg.setRotationPoint(2F, 12F, 0F);
	      leftleg.setTextureSize(64, 64);
	      leftleg.mirror = true;
	      setRotation(leftleg, 0F, 0F, 0F);
	      hatright = new ModelRenderer(this, 0, 0);
	      hatright.addBox(-1F, 0F, 0F, 2, 1, 4);
	      hatright.setRotationPoint(-1F, -9F, 1F);
	      hatright.setTextureSize(64, 64);
	      hatright.mirror = true;
	      setRotation(hatright, 0F, -0.7853982F, 0F);
	      hatright.mirror = false;
	      hatbaseright = new ModelRenderer(this, 0, 23);
	      hatbaseright.addBox(-2F, 0F, -1F, 4, 0, 7);
	      hatbaseright.setRotationPoint(0F, -8.1F, -2F);
	      hatbaseright.setTextureSize(64, 64);
	      hatbaseright.mirror = true;
	      setRotation(hatbaseright, 0F, -0.418879F, 0F);
	      hatbaseleft = new ModelRenderer(this, 0, 23);
	      hatbaseleft.addBox(-2F, 0F, -1F, 4, 0, 7);
	      hatbaseleft.setRotationPoint(0F, -8.1F, -2F);
	      hatbaseleft.setTextureSize(64, 64);
	      hatbaseleft.mirror = true;
	      setRotation(hatbaseleft, 0F, 0.418879F, 0F);
	      hatbase = new ModelRenderer(this, 23, 24);
	      hatbase.addBox(-3F, 0F, -2F, 6, 0, 6);
	      hatbase.setRotationPoint(0F, -8.1F, 0.5F);
	      hatbase.setTextureSize(64, 64);
	      hatbase.mirror = true;
	      setRotation(hatbase, 0F, 0F, 0F);
	      hatbackside = new ModelRenderer(this, 19, 10);
	      hatbackside.addBox(0F, 0F, -5F, 0, 2, 10);
	      hatbackside.setRotationPoint(0F, -10F, 4.5F);
	      hatbackside.setTextureSize(64, 64);
	      hatbackside.mirror = true;
	      setRotation(hatbackside, 0F, 1.570796F, 0F);
	      hatleftside = new ModelRenderer(this, 0, 11);
	      hatleftside.addBox(0F, 0F, 0F, 0, 2, 9);
	      hatleftside.setRotationPoint(1F, -10F, -4.9F);
	      hatleftside.setTextureSize(64, 64);
	      hatleftside.mirror = true;
	      setRotation(hatleftside, 0F, 0.418879F, 0F);
	      hatcenter = new ModelRenderer(this, 18, 2);
	      hatcenter.addBox(-2F, 0F, 0F, 4, 2, 4);
	      hatcenter.setRotationPoint(0F, -8F, -2F);
	      hatcenter.setTextureSize(64, 64);
	      hatcenter.mirror = true;
	      setRotation(hatcenter, 0F, 0F, 3.141593F);
	      hatrightside = new ModelRenderer(this, 0, 11);
	      hatrightside.addBox(-1F, 0F, 0F, 0, 2, 9);
	      hatrightside.setRotationPoint(0F, -10F, -4.6F);
	      hatrightside.setTextureSize(64, 64);
	      hatrightside.mirror = true;
	      setRotation(hatrightside, 0F, -0.418879F, 0F);
	      hatfront = new ModelRenderer(this, 0, 6);
	      hatfront.addBox(-1F, 0F, 0F, 2, 1, 3);
	      hatfront.setRotationPoint(0F, -8F, -5F);
	      hatfront.setTextureSize(64, 64);
	      hatfront.mirror = true;
	      setRotation(hatfront, 0F, 0F, 3.141593F);
	      hatleft = new ModelRenderer(this, 0, 0);
	      hatleft.addBox(-1F, 0F, 0F, 2, 1, 4);
	      hatleft.setRotationPoint(1F, -9F, 1F);
	      hatleft.setTextureSize(64, 64);
	      hatleft.mirror = true;
	      setRotation(hatleft, 0F, 0.7853982F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    head.render(f5);
	    body.render(f5);
	    rightarm.render(f5);
	    leftarm.render(f5);
	    rightleg.render(f5);
	    leftleg.render(f5);
	    hatright.render(f5);
	    hatbaseright.render(f5);
	    hatbaseleft.render(f5);
	    hatbase.render(f5);
	    hatbackside.render(f5);
	    hatleftside.render(f5);
	    hatcenter.render(f5);
	    hatrightside.render(f5);
	    hatfront.render(f5);
	    hatleft.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	  {
	    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	    
	    this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
        this.hatright.rotateAngleY = this.head.rotateAngleY;
        this.hatright.rotateAngleX = this.head.rotateAngleX;
        this.hatbaseright.rotateAngleY = this.head.rotateAngleY;
        this.hatbaseright.rotateAngleX = this.head.rotateAngleX;
        this.hatbaseleft.rotateAngleY = this.head.rotateAngleY;
        this.hatbaseleft.rotateAngleX = this.head.rotateAngleX;
        this.hatbase.rotateAngleY = this.head.rotateAngleY;
        this.hatbase.rotateAngleX = this.head.rotateAngleX;
        this.hatbackside.rotateAngleY = this.head.rotateAngleY;
        this.hatbackside.rotateAngleX = this.head.rotateAngleX;
        this.hatleftside.rotateAngleY = this.head.rotateAngleY;
        this.hatleftside.rotateAngleX = this.head.rotateAngleX;
        this.hatcenter.rotateAngleY = this.head.rotateAngleY;
        this.hatcenter.rotateAngleX = this.head.rotateAngleX;
        this.hatrightside.rotateAngleY = this.head.rotateAngleY;
        this.hatrightside.rotateAngleX = this.head.rotateAngleX;
        this.hatfront.rotateAngleY = this.head.rotateAngleY;
        this.hatfront.rotateAngleX = this.head.rotateAngleX;
        this.hatleft.rotateAngleY = this.head.rotateAngleY;
        this.hatleft.rotateAngleX = this.head.rotateAngleX;
        this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
	  	  
	  if (this.heldItemLeft != 0)
      {
          this.leftarm.rotateAngleX = this.leftarm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemLeft;
      }

      if (this.heldItemRight != 0)
      {
          this.rightarm.rotateAngleX = this.rightarm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
      }

      this.rightarm.rotateAngleY = 0.0F;
      this.leftarm.rotateAngleY = 0.0F;
      float f6;
      float f7;

      if (this.onGround > -9990.0F)
      {
          f6 = this.onGround;
          this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
          this.rightarm.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
          this.rightarm.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
          this.leftarm.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
          this.leftarm.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
          this.rightarm.rotateAngleY += this.body.rotateAngleY;
          this.leftarm.rotateAngleY += this.body.rotateAngleY;
          this.leftarm.rotateAngleX += this.body.rotateAngleY;
          f6 = 1.0F - this.onGround;
          f6 *= f6;
          f6 *= f6;
          f6 = 1.0F - f6;
          f7 = MathHelper.sin(f6 * (float)Math.PI);
          float f8 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
          this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
          this.rightarm.rotateAngleY += this.body.rotateAngleY * 2.0F;
          this.rightarm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
      }
  }

}