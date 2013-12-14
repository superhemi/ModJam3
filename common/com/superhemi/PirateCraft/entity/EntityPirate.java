package com.superhemi.PirateCraft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityPirate extends EntityMob{

	public EntityPirate(World par1World) 
	{
		super(par1World);
        this.setSize(0.9f, 1.3f);
        this.setHealth(5f);
	}
    

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(30.0D);	       
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.20000000298023224D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(6.0D);
	}
	public int getAttackStrength(Entity par1Entity)
	{
		return 10;
	}
	
	public boolean getCanSpawnHere() 
	{
		return this.worldObj.difficultySetting > 4 && this.isValidLightLevel() && super.getCanSpawnHere();
	}
	
	protected String getLivingSound()
	{
		return null;
		
	}
	
	
    protected String getHurtSound()
    {
		return null;
        
    }

   
    protected String getDeathSound()
    {
		return null;
        
    }

 
    protected float getSoundVolume()
    {
        return 0.4F;
    }
}

