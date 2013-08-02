package net.minecraft4455.bartercraft.core.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGhostlyLantern extends Item {

	public ItemGhostlyLantern(int id) {
		
		super(id);
		this.setUnlocalizedName("GhostlyLantern");
		this.setMaxStackSize(1);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		
		itemIcon = icon.registerIcon("minecraft4455:GhostlyLantern");
		
	}
	
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.common;
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	
    	par3List.add("Common item from BriefCase01");
    	par3List.add("Found in BriefCase01 & BriefCase06");
    	par3List.add("Worth around 4.4 Iron");
    	par3List.add("On entity hit makes them slow");
    	
    }
    
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
        
    	par1ItemStack.damageItem(0, par2EntityLivingBase);
    	par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 1));
    	
    	return true;
    }

	
}
