package com.superhemi.PirateCraft.client.renderer.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderPirate extends RenderLiving
{

	private static final ResourceLocation pirateTextures  = new ResourceLocation("textures/entity/ModelPirate.png");
	 
	public RenderPirate(ModelBase par1ModelBase, float par2) 
	{
		super(par1ModelBase, par2);

	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return null;
	}

}
