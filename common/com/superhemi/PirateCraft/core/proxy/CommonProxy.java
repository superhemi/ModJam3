package com.superhemi.PirateCraft.core.proxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.block.ModBlocks;
import com.superhemi.PirateCraft.core.handlers.ServerTickHandler;
import com.superhemi.PirateCraft.creativetab.CreativeTabPC;
import com.superhemi.PirateCraft.entity.Entities;
import com.superhemi.PirateCraft.entity.EntityPirate;
import com.superhemi.PirateCraft.item.ModItems;
import com.superhemi.PirateCraft.lib.Reference;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
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
 
	public void init()
	{
		BaseForgePC.tabsPC = new CreativeTabPC(CreativeTabs.getNextID(), Reference.MOD_ID);
        ModBlocks.initBlocks();
        ModItems.initItems();
        Entities.initEntities();
        initEntities();
        initRecipes();

        
             
                    
        
	}
	
	 public void initEntities()
     {
		 EntityRegistry.registerGlobalEntityID(EntityPirate.class, "Pirate", EntityRegistry.findGlobalUniqueEntityId());
         EntityRegistry.findGlobalUniqueEntityId();
         EntityRegistry.addSpawn(EntityPirate.class, 8000, 10, 20, EnumCreatureType.monster, BiomeGenBase.plains);
         EntityRegistry.addSpawn(EntityPirate.class, 25, 7, 15, EnumCreatureType.monster, BiomeGenBase.ocean);
         EntityList.addMapping(EntityPirate.class, "Pirate", 101, 14342901, 8026845);
         LanguageRegistry.instance().addStringLocalization("entity.Pirate.name", "Pirate");
            
     }
     
     public void initRecipes()
     {
    	 
     }
     
	public void registerServerTickHandler()
	{
		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
	}
}
