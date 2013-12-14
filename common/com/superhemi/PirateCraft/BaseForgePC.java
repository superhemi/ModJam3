package com.superhemi.PirateCraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.superhemi.PirateCraft.block.ModBlocks;
import com.superhemi.PirateCraft.core.proxy.CommonProxy;
import com.superhemi.PirateCraft.creativetab.CreativeTabPC;
import com.superhemi.PirateCraft.entity.EntityPirate;
import com.superhemi.PirateCraft.item.ModItems;
import com.superhemi.PirateCraft.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;



/**
 * PirateCraft
 * 
 * BaseForgePC
 * 
 * @author superhemi
 *@license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, versionBounds = "0.0.1")
public class BaseForgePC {

    @Instance(Reference.MOD_ID)
    public static BaseForgePC instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    public static int startEntityId = 300;
    public static int getUniqueEntityId() {
        do {
            startEntityId++;
           } 
           while (EntityList.getStringFromID(startEntityId) != null);
           return startEntityId++;
       }
    public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) 
    {
       int id = getUniqueEntityId();
       EntityList.IDtoClassMapping.put(id, entity);
       EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
    }
   
    public static CreativeTabs tabsPC = new CreativeTabPC(CreativeTabs.getNextID(), Reference.MOD_ID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	
      	    
        // Initialize mod blocks
        ModBlocks.init();

        // Initialize mod items
        ModItems.init();
      
    }
      
    public void init(FMLInitializationEvent event)
    {
        EntityRegistry.registerGlobalEntityID(EntityPirate.class, "Pirate", 1);
        EntityRegistry.addSpawn(EntityPirate.class, 50, 1, 20, EnumCreatureType.monster);
        EntityRegistry.findGlobalUniqueEntityId();
        registerEntityEgg(EntityPirate.class, 0xffffff, 0x000000);
        proxy.registerRendererThings();

        LanguageRegistry.instance().addStringLocalization("entity.Pirate.name", "en_US","Pirate");
                
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        
    
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
  
    }

}
