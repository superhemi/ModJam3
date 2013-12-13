package com.superhemi.PirateCraft.core.proxy;

import com.superhemi.PirateCraft.client.model.ModelPirate;
import com.superhemi.PirateCraft.client.renderer.entity.RenderPirate;
import com.superhemi.PirateCraft.entity.EntityPirate;

import cpw.mods.fml.client.registry.RenderingRegistry;

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

	public void registerRendererThings()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityPirate.class, new RenderPirate (new ModelPirate(), 0.5f));
	}
	
	
}
