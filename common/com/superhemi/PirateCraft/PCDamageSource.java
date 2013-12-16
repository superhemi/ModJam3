package com.superhemi.PirateCraft;

import com.superhemi.PirateCraft.entity.EntityLaunchedGrapeShot;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

public class PCDamageSource {
        
        public static DamageSource causeLaunchedGrapeShotDamage(EntityLaunchedGrapeShot par1EntityLaunchedGrapeShot, Entity par2Entity) {
                return (new EntityDamageSourceIndirect("launchedGrapeShot", par1EntityLaunchedGrapeShot, par2Entity)).setProjectile();
        }
        
}