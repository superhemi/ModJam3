package com.superhemi.PirateCraft.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityDagger extends EntityThrowable
{
	
	   public int canBePickedUp;
	   private int explosionRadius = 1;
	    
	   public EntityDagger(World par1World)
	   {
	       super(par1World);
	   }
	   
	   public EntityDagger(World par1World, EntityLivingBase par2EntityLivingBase)
	   {
	       super(par1World, par2EntityLivingBase);
	   }
	   
	   public EntityDagger(World par1World, double par2, double par4, double par6)
	   {
	       super(par1World, par2, par4, par6);
	   }
	   
	   protected void onImpact(MovingObjectPosition movingobjectposition)
	   {
		   this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);	
		   this.setDead();
	   }
	   
	    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer)
	   {
	       if (!this.worldObj.isRemote && this.inGround)
	       {
	           boolean flag = this.canBePickedUp == 1 || this.canBePickedUp == 2 && par1EntityPlayer.capabilities.isCreativeMode;

	           if (this.canBePickedUp == 1 && !par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Item.arrow, 1)))
	           {
	               flag = false;
	           }

	           if (flag)
	           {
	               this.playSound("random.pop", 0.2F, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
	               par1EntityPlayer.onItemPickup(this, 1);
	               this.setDead();
	           }
	       }
	   }

}