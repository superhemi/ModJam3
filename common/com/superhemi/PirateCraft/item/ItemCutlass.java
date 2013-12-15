package com.superhemi.PirateCraft.item;

import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.lib.Strings;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemCutlass extends ItemSword {

	public ItemCutlass(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.CUTLASS_NAME);
        this.setCreativeTab(BaseForgePC.tabsPC);
        this.setTextureName(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        maxStackSize = 1;
	}

}
