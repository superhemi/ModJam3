package com.superhemi.PirateCraft.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityPirate extends EntityMob{

	public EntityPirate(World par1World) {
		super(par1World);
        this.setSize(0.9f, 1.3f);
	}
    
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.20000000298023224D);
	}
	
	@Override
	protected String getLivingSound()
	{
		return null;
		
	}
	
	@Override
    protected String getHurtSound()
    {
		return null;
        
    }

    @Override
    protected String getDeathSound()
    {
		return null;
        
    }

    @Override
    protected float getSoundVolume()
    {
        return 0.4F;
    }
}

