package com.superhemi.PirateCraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGrapeShot extends Render 
{
	private static final ResourceLocation texture = new ResourceLocation("example", "textures/models/ModelGrapeShot.png");
	private static final ResourceLocation chargedTexture = new ResourceLocation("example", "textures/models/ModelGrapeshot");

	@Override
	public void doRender(Entity entity, double d0, double d1, double d2,
			float f, float f1) {
		// TODO Auto-generated method stub

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
