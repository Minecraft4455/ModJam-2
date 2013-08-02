package net.minecraft4455.bartercraft.core.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlueCupcake extends Item {

	public ItemBlueCupcake(int id) {
		
		super(id);
		this.setUnlocalizedName("BlueCupcake");;
		this.setMaxStackSize(1);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		
		itemIcon = icon.registerIcon("minecraft4455:BlueCupcake");
		
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		
		par3List.add("Ultra Rare Cupcake from BriefCase 01");
		par3List.add("Only found in BriefCase01");
		par3List.add("Worth $3000 ingame money");
		par3List.add("On right click get speed boost");
		
	}
	
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack, int pass)
    {
        return true;
    }
	
}
