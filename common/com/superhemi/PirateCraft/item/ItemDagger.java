package com.superhemi.PirateCraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

import com.google.common.collect.Multimap;
import com.superhemi.PirateCraft.BaseForgePC;
import com.superhemi.PirateCraft.entity.EntityDagger;
import com.superhemi.PirateCraft.lib.ItemIds;
import com.superhemi.PirateCraft.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDagger extends Item {
	
    private float weaponDamage;
    private final EnumToolMaterial toolMaterial;
	
	public ItemDagger(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1);
		this.toolMaterial = par2EnumToolMaterial;
        maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.DAGGER_NAME);
        this.setCreativeTab(BaseForgePC.tabsPC);
        this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
        this.setTextureName(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));

	}
	
	public float func_82803_g()
    {
        return this.toolMaterial.getDamageVsEntity();
    }
	
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        if (par2Block.blockID == Block.web.blockID)
        {
            return 15.0F;
        }
        else
        {
            Material material = par2Block.blockMaterial;
            return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.pumpkin ? 1.0F : 1.5F;
        }
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
    	   if(par3EntityPlayer.capabilities.isCreativeMode||par3EntityPlayer.inventory.consumeInventoryItem(ModItems.Dagger.itemID))
    	   {
    	     par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
    	     if (!par2World.isRemote)
    	     {
    	       par2World.spawnEntityInWorld(new EntityDagger(par2World, par3EntityPlayer));
    	     }
    	   }
    	   return par1ItemStack;
    	   }
    
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block.blockID == Block.web.blockID;
    }

    public int getItemEnchantability()
    {
        return this.toolMaterial.getEnchantability();
    }

    public String getToolMaterialName()
    {
        return this.toolMaterial.toString();
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return this.toolMaterial.getToolCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.weaponDamage, 0));
        return multimap;
    }
}