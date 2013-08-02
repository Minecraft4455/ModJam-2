package net.minecraft4455.bartercraft.core.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemHillarysHickup extends Item {

	public ItemHillarysHickup(int id) {
		
		super(id);
		this.setUnlocalizedName("HillarysHickup");
		this.setMaxStackSize(1);
		
	}
	
	public void registerIcons(IconRegister icon) {
		
		itemIcon = icon.registerIcon("minecraft4455:HillarysHickup");
		
	}
	
}
