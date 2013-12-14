package com.superhemi.PirateCraft.client.renderer.entity;

import com.superhemi.PirateCraft.client.model.ModelPirate;
import com.superhemi.PirateCraft.entity.EntityPirate;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderPirate extends RenderLiving
{

	private static final ResourceLocation pirateTextures  = new ResourceLocation("PiraCraft:textures/entity/ModelPirate.png");
	 
	protected ModelPirate model;
	
	public RenderPirate(ModelBase par1ModelBase, float par2) 
	{
		super(par1ModelBase, par2);
		model = ((ModelPirate)mainModel);
	}
	
	public void PirateRender(EntityPirate entity, double par2, double par4, double par6, float par8, float par9){
		 
		 
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);

    } 


    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        PirateRender((EntityPirate)par1EntityLiving, par2, par4, par6, par8, par9);


    }


    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
    PirateRender((EntityPirate)par1Entity, par2, par4, par6, par8, par9);

    }
    
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return pirateTextures;
	}

}
