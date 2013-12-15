package com.superhemi.PirateCraft.item;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.entity.EntityGrapeShot;
import com.superhemi.PirateCraft.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGrapeShot extends Item {
	
	public ItemGrapeShot(int par1) {
		super(par1);
        maxStackSize = 1;
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.GRAPESHOT_NAME);
        this.setCreativeTab(BaseForgePC.tabsPC);
        this.setTextureName(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));

	}
		
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLivingBase par7EntityLivingBase)
    {
        if ((double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D)
        {
            par1ItemStack.damageItem(2, par7EntityLivingBase);
        }

        return true;
    }
    
    @SideOnly(Side.CLIENT)

    public boolean isFull3D()
    {
        return true;
    }

    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.block;
    }

    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	   if(par3EntityPlayer.capabilities.isCreativeMode||par3EntityPlayer.inventory.consumeInventoryItem(ModItems.GrapeShot.itemID))
    	   {
    	     par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
    	     if (!par2World.isRemote)
    	     {
    	       par2World.spawnEntityInWorld(new EntityGrapeShot(par2World, par3EntityPlayer));
    	     }
    	   }
    	   return par1ItemStack;
           }

}
