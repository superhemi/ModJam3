package com.superhemi.PirateCraft.item;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.entity.EntityGrapeShot;
import com.superhemi.PirateCraft.lib.ItemIds;
import com.superhemi.PirateCraft.lib.Strings;

public class ItemGrapeShot extends Item
{
    public ItemGrapeShot(int par1)
    {
        super(par1);
        this.maxStackSize = 16;
        this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.GRAPESHOT_NAME);
        this.setCreativeTab(BaseForgePC.tabsPC);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) 
    {
      if(!par3EntityPlayer.capabilities.isCreativeMode)
      {
    	  --par1ItemStack.stackSize;
      }
        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if (!par2World.isRemote)
        {
          par2World.spawnEntityInWorld(new EntityGrapeShot(par2World, par3EntityPlayer));
        }
      
      return par1ItemStack;
      }
}