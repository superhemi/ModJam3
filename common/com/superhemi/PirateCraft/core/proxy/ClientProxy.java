package com.superhemi.PirateCraft.core.proxy;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.superhemi.PirateCraft.client.model.ModelPirate;
import com.superhemi.PirateCraft.client.renderer.entity.RenderGrapeShot;
import com.superhemi.PirateCraft.client.renderer.entity.RenderPirate;
import com.superhemi.PirateCraft.entity.EntityGrapeShot;
import com.superhemi.PirateCraft.entity.EntityPirate;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

/**
 * PirateCraft
 * 
 * ClientProxy
 * 
 * @author superhemi
 *@license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenderThings()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityPirate.class, new RenderPirate (new ModelPirate(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrapeShot.class, new RenderGrapeShot());
	}
	
}
