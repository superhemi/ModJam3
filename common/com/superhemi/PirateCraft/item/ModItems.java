package com.superhemi.PirateCraft.item;

import com.superhemi.PirateCraft.lib.ItemIds;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * PirateCraft
 * 
 * ModItems
 * 
 * @author superhemi
 *@license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

public class ModItems {
	
	/* Mod item instances */
	public static Item Bag;
	
		
	public static void init() {
		
		Bag = new ItemBag(ItemIds.BAG_DEFAULT);
		
		GameRegistry.addShapedRecipe(new ItemStack(Bag), new Object[] {"xxx","x x","xxx", Character.valueOf('x'), Block.cloth});
		
	}

}
