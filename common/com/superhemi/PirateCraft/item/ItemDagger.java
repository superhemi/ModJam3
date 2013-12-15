package com.superhemi.PirateCraft.item;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;

import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.lib.Strings;

public class ItemDagger extends ItemTool {
	
	protected ItemDagger(int par1, float par2,
			EnumToolMaterial par3EnumToolMaterial, Block[] par4ArrayOfBlock) {
		super(par1, par2, par3EnumToolMaterial, par4ArrayOfBlock);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.DAGGER_NAME);
        this.setCreativeTab(BaseForgePC.tabsPC);
        this.setTextureName(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        maxStackSize = 1;
	}

}