package com.superhemi.PirateCraft.item;

import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.lib.Reference;
import com.superhemi.PirateCraft.lib.Strings;

import net.minecraft.item.Item;

public class ItemBag extends Item {

	public ItemBag(int par1) {
		super(par1);
		this.setUnlocalizedName(Strings.BAG_NAME);
        this.setCreativeTab(BaseForgePC.tabsPC);
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        maxStackSize = 64;
	}

}
