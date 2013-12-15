package com.superhemi.PirateCraft.item;

import com.superhemi.PirateCraft.lib.ItemIds;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
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
	public static Item BoardAxe;
	public static Item Cutlass;
	public static Item Dagger;
	public static Item Dirk;
	public static Item Schimitar;

			
	public static void init() {
		
		Bag = new ItemBag(ItemIds.BAG_DEFAULT);
		BoardAxe = new ItemBoardAxe(ItemIds.BOARDAXE_DEFAULT, EnumToolMaterial.IRON);
		Cutlass = new ItemCutlass(ItemIds.CUTLASS_DEFAULT, EnumToolMaterial.EMERALD);
		Dagger = new ItemDagger(ItemIds.DAGGER_DEFAULT, EnumToolMaterial.IRON);
		Dirk = new ItemDirk(ItemIds.DIRK_DEFAULT, EnumToolMaterial.IRON);
		Schimitar = new ItemSchimitar(ItemIds.SCHIMITAR_DEFAULT, EnumToolMaterial.EMERALD);
		
		GameRegistry.addShapedRecipe(new ItemStack(Bag), new Object[] {"xxx","x x","xxx", Character.valueOf('x'), Block.cloth});
		
	}

}
