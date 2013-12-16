package com.superhemi.PirateCraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraftforge.common.Configuration;

import com.superhemi.PirateCraft.core.proxy.CommonProxy;
import com.superhemi.PirateCraft.creativetab.CreativeTabPC;
import com.superhemi.PirateCraft.lib.Reference;
import com.superhemi.PirateCraft.net.NetworkHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

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
@NetworkMod(channels = { NetworkHandler.MOD_CHANNEL }, clientSideRequired = true, serverSideRequired = false, versionBounds = "0.0.1", packetHandler = NetworkHandler.class)
public class BaseForgePC {

    @Instance(Reference.MOD_ID)
    public static BaseForgePC instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static Configuration config;
    public static CreativeTabPC tabsPC;
    public static int startEntityId = 300;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	BaseForgePC.config = new Configuration(event.getSuggestedConfigurationFile());
    	BaseForgePC.config.load();
    	
    	BaseForgePC.proxy.init();
    	
    	BaseForgePC.config.save();
    	

        
 
        
}
    public static int getUniqueEntityId() {
        do {
                startEntityId++;
                }
        while(EntityList.getStringFromID(startEntityId) != null);
                return startEntityId++;
                }
                
		@SuppressWarnings("unchecked")
		public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) {
                int id = getUniqueEntityId();
                EntityList.IDtoClassMapping.put(id, entity);
                EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
                }  	
      
}
