package com.superhemi.PirateCraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.superhemi.PirateCraft.client.model.ModelPirate;
import com.superhemi.PirateCraft.entity.EntityPirate;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPirate extends RenderLiving
{

    protected ModelPirate model;

    public RenderPirate(ModelBase par1ModelBase, float par2) {
            super(par1ModelBase, par2);
            model = ((ModelPirate)mainModel);
    }
    
    public void renderPirate(EntityPirate par1Entity, double par2, double par4, double par6, float par8, float par9) {
            super.doRenderLiving(par1Entity, par2, par4, par6, par8, par9);
    }
    
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
            renderPirate((EntityPirate)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    @Override
    public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) {
            renderPirate((EntityPirate)entity, d0, d1, d2, f, f1);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
            return new ResourceLocation ("piracraft:textures/entity/ModelPirate.png");
    }
}
