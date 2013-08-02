package net.minecraft4455.bartercraft.core.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGillysBoots extends Item {

	public ItemGillysBoots(int id) {
		
		super(id);
		this.setUnlocalizedName("GillysBoots");
		this.setMaxStackSize(1);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		
		itemIcon = icon.registerIcon("minecraft4455:GillysBoots");
		
	}
	
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	
    	par3List.add("Common item from BriefCase01");
    	par3List.add("Found in BriefCase01 & BriefCase08");
    	par3List.add("Worth around 4.7 Iron");
    	par3List.add("On right click gives you jump boost for two seconds");
    	
    }

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 60, 3));
        	
        	return par1ItemStack;
        	
    }
    
}
