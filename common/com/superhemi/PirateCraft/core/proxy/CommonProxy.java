package com.superhemi.PirateCraft.core.proxy;

import com.superhemi.PirateCraft.core.handlers.ServerTickHandler;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

/**
 * PirateCraft
 * 
 * CommonProxy
 * 
 * @author superhemi
 *@license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

public class CommonProxy {
 
	public void registerRenderThings()
	{
		
	}
	
	public void registerServerTickHandler()
	{
		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
	}
	
}
