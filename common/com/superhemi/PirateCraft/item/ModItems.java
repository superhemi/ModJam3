package com.superhemi.PirateCraft.item;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.lib.ItemIds;
import com.superhemi.PirateCraft.spawn.customSpawner;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
	public static Item Scimitar;
	public static Item GrapeShot;
	public static Item customSpawner;

			
	public static void initItems() {
		
		Bag = new ItemBag(ItemIds.BAG_DEFAULT);
		BoardAxe = new ItemBoardAxe(ItemIds.BOARDAXE_DEFAULT, EnumToolMaterial.IRON);
		Cutlass = new ItemCutlass(ItemIds.CUTLASS_DEFAULT, EnumToolMaterial.EMERALD);
		Dagger = new ItemDagger(ItemIds.DAGGER_DEFAULT, EnumToolMaterial.IRON);
		Dirk = new ItemDirk(ItemIds.DIRK_DEFAULT, EnumToolMaterial.IRON);
		Scimitar = new ItemSchimitar(ItemIds.SCHIMITAR_DEFAULT, EnumToolMaterial.EMERALD);
		GrapeShot = new ItemGrapeShot(ItemIds.GRAPESHOT_DEFAULT);
		customSpawner = new customSpawner(1016).setUnlocalizedName("customSpawner").setCreativeTab(BaseForgePC.tabsPC);
		
		LanguageRegistry.addName(customSpawner, "Spawn");
		
		GameRegistry.addShapedRecipe(new ItemStack(Bag), new Object[] {"xxx","x x","xxx", Character.valueOf('x'), Block.cloth});
		
	}

}
