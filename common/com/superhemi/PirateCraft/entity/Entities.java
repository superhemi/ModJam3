package com.superhemi.PirateCraft.entity;

import com.superhemi.PirateCraft.BaseForgePC;

import cpw.mods.fml.common.registry.EntityRegistry;

public class Entities {
	
	public static void initEntities()
	{
		EntityRegistry.registerModEntity(EntityGrapeShot.class, "GrapeShot", 0, BaseForgePC.instance, 80, 3, true);
		EntityRegistry.registerModEntity(EntityPirate.class, "Pirate", 1, BaseForgePC.instance, 80, 5, true);
	}

}
