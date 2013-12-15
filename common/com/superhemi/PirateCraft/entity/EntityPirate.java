package com.superhemi.PirateCraft.entity;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityPirate extends EntityMob {

    public EntityPirate(World par1World) {
        super(par1World);
        this.experienceValue = 15;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.5D, false));
        this.tasks.addTask(5, new EntityAIWander(this, 0.25D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        }

    public boolean isAIEnabled()
    {
        return true;
    }
 
    public void applyEntityAttributes() {
         super.applyEntityAttributes();
         this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(30.0F);
         this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(80.0F);
         this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.3D);
         this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(3.0D);
    }
    
    protected void entityInit()
    {
    	super.entityInit();
    	this.getDataWatcher().addObject(12, Byte.valueOf((byte)0));
    	this.getDataWatcher().addObject(13, Byte.valueOf((byte)0));
    	this.getDataWatcher().addObject(14, Byte.valueOf((byte)0));
    }
    
    protected String getHurtSound() {
    	return "mob.zombie.hurt";
    }
    
    protected String getDeathSound() {
    	return "mob.zombie.death";
    }
    
    protected void playStepSound(int par1, int par2, int par3, int par4){
    	this.playSound("mob.zombie.step", 0.15F, 1.0F);
    }
 
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
        {
            float f = this.getBrightness(1.0F);

            if (f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)))
            {
              
                    this.setFire(8);
            }
        }

        if (this.isWet())
        {
            this.attackEntityFrom(DamageSource.drown, 1.0F);
        }

        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.posZ);

        if (this.worldObj.getBiomeGenForCoords(i, j).getFloatTemperature() > 1.0F)
        {
            this.attackEntityFrom(DamageSource.onFire, 1.0F);
        }

     }
 
    protected int getDropItemId()
    {
        return Item.rottenFlesh.itemID;
    }
    public EnumCreatureAttribute getCreatureAttribute() {
    	return EnumCreatureAttribute.UNDEAD;
    }
    
}

