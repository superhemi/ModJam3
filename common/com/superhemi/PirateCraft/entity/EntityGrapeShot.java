package com.superhemi.PirateCraft.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGrapeShot extends EntityThrowable
{
    private int explosionRadius = 2;
	
   public EntityGrapeShot(World par1World)
   {
       super(par1World);
   }
   public EntityGrapeShot(World par1World, EntityLivingBase par2EntityLiving)
   {
       super(par1World, par2EntityLiving);
   }
   public EntityGrapeShot(World par1World, double par2, double par4, double par6)
   {
       super(par1World, par2, par4, par6);
   }

   protected void onImpact(MovingObjectPosition movingobjectposition)
   {
	   this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);		
	   this.setDead();
   }
}