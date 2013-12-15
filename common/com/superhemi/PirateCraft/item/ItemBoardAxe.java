package com.superhemi.PirateCraft.item;

import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.lib.Strings;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemBoardAxe extends ItemAxe {

	public ItemBoardAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.BOARDAXE_NAME);
        this.setCreativeTab(BaseForgePC.tabsPC);
        this.setTextureName(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        maxStackSize = 1;
	}

}
