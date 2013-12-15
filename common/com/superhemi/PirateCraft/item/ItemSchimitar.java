package com.superhemi.PirateCraft.item;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

import com.google.common.collect.Multimap;
import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.lib.Strings;

public class ItemSchimitar extends ItemSword {
	
    private float weaponDamage;

	public ItemSchimitar(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.SCHIMITAR_NAME);
        this.setCreativeTab(BaseForgePC.tabsPC);
        this.setTextureName(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        this.weaponDamage = 6.0F + par2EnumToolMaterial.getDamageVsEntity();
        maxStackSize = 1;
	}

	 public Multimap getItemAttributeModifiers()
	    {
	        Multimap multimap = super.getItemAttributeModifiers();
	        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.weaponDamage, 0));
	        return multimap;
	    }
}
