package net.minecraft4455.bartercraft.core.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBriefCase01 extends Item {

	public ItemBriefCase01(int id) {
		
		super(id);
		this.setUnlocalizedName("BriefCase01");
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxStackSize(1);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		
		itemIcon = icon.registerIcon("minecraft4455:BriefCase01");
		
	}
	
}
