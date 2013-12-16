package com.superhemi.PirateCraft.item;

import net.minecraft.item.Item;
import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.lib.Strings;

public class ItemBag extends Item {

	public ItemBag(int id) {
		super(id);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.BAG_NAME);
        this.setCreativeTab(BaseForgePC.tabsPC);
        this.setTextureName(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        maxStackSize = 1;
	}

}
