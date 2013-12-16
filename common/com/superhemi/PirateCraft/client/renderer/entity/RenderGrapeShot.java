package com.superhemi.PirateCraft.client.renderer.entity;

import org.lwjgl.opengl.GL11;

import com.superhemi.PirateCraft.client.model.ModelGrapeShot;
import com.superhemi.PirateCraft.entity.EntityGrapeShot;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGrapeShot extends Render 
{
	private static final ResourceLocation texture = new ResourceLocation("example", "textures/models/ModelGrapeShot.png");

	protected ModelGrapeShot model;
	
	public RenderGrapeShot()
	{
		shadowSize = 0.5f;
		model = new ModelGrapeShot();
	}
	
	public void renderGrapeShot(EntityGrapeShot grapeshot, double x, double y, double z, float yaw, float partialTickTime) 
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		GL11.glRotatef(180.0F - yaw, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		
		//func_110777_b(grapeshot);
		
		//model.render(grapeshot, 0.0F, 0.0F, -0.0F, 0.0F, 0.0625F);
		
		GL11.glPopMatrix();
	}
	
	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime)
	{
		this.renderGrapeShot((EntityGrapeShot)entity, x, y, z, yaw, partialTickTime);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}

}
