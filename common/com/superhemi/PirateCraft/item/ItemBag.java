package com.superhemi.PirateCraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.entity.EntityPirate;
import com.superhemi.PirateCraft.lib.Strings;

public class ItemBag extends Item {

	public ItemBag(int id) {
		super(id);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.BAG_NAME);
        this.setCreativeTab(BaseForgePC.tabsPC);
        this.setTextureName(Strings.RESOURCE_PREFIX + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        maxStackSize = 1;
	}

	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	{
		if (!world.isRemote)
		{
			EntityPirate pirate = new EntityPirate(world);
			
			pirate.posX = x + 0.5;
			pirate.posY = y + 1.5;
			pirate.posZ = z + 0.5;
			
			world.spawnEntityInWorld(pirate);
			
			return true;
		}else{
		     return false;
		}
	}
}
