package net.minecraft4455.bartercraft.core.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
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
	
}
