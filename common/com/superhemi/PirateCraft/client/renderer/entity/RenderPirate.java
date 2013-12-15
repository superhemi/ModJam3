package com.superhemi.PirateCraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.superhemi.PirateCraft.client.model.ModelPirate;
import com.superhemi.PirateCraft.entity.EntityPirate;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPirate extends Render
{

	private static final ResourceLocation pirateTextures  = new ResourceLocation("textures/entity/ModelPirate.png");
	 
	protected ModelPirate model;
	
	public RenderPirate() 
	{
		shadowSize = 0.5f;
		model = new ModelPirate();
	}
	
	public void renderPirate(EntityPirate pirate, double x, double y, double z, float yaw, float partialTickTime)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		GL11.glRotatef(180.0F - yaw, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		
		func_110777_b(pirate);
		
		model.render(pirate, 0.0F, 0.0F, -0.0F, 0.0F, 0.0625F);
		
		GL11.glPopMatrix();
    } 

	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime)
	{
		this.renderPirate((EntityPirate)entity, x, y, z, yaw, partialTickTime);
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return pirateTextures;
	}

}
