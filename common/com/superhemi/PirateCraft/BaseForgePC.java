package com.superhemi.PirateCraft;

import net.minecraft.command.CommandHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import com.superhemi.PirateCraft.block.ModBlocks;
import com.superhemi.PirateCraft.core.handlers.LocalizationHandler;
import com.superhemi.PirateCraft.core.proxy.CommonProxy;
import com.superhemi.PirateCraft.creativetab.CreativeTabPC;
import com.superhemi.PirateCraft.entity.EntityPirate;
import com.superhemi.PirateCraft.item.ModItems;
import com.superhemi.PirateCraft.lib.Reference;

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

    public static CreativeTabs tabsPC = new CreativeTabPC(CreativeTabs.getNextID(), Reference.MOD_ID);

    public void preInit(FMLPreInitializationEvent event){
    	
    	// Load the localization files into the LanguageRegistry
    	LocalizationHandler.loadLanguages();
    	
        // Initialize mod blocks
        ModBlocks.init();

        // Initialize mod items
        ModItems.init();
      
    }
    
    public void init(FMLInitializationEvent event)
    {
        int id =0;
        EntityRegistry.registerModEntity(EntityPirate.class, "Pirate", id, this, 80, 1, true);
        id++;
        EntityRegistry.addSpawn(EntityPirate.class, 100, 0, 5, EnumCreatureType.creature, BiomeGenBase.biomeList);             
        proxy.registerRendererThings();

        LanguageRegistry.instance().addStringLocalization("entity.Pirate.name", "en_US","Pirate");
        
    }
    public void load(FMLInitializationEvent event)
    {
    	LanguageRegistry.instance().addStringLocalization("itemGroup.PiraCraft", "en_US", "PirateCraft");

    }


}
