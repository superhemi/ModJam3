package com.superhemi.PirateCraft.item;

import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.lib.Strings;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemBoardAxe extends ItemSword {
	
	public ItemBoardAxe(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.BOARDAXE_NAME);
        this.setCreativeTab(BaseForgePC.tabsPC);
        this.setTextureName(Strings.RESOURCE_PREFIX + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        maxStackSize = 1;
}
}