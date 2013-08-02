package net.minecraft4455.bartercraft.core.items;

import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBriefCase01 extends Item {

	Random rand = new Random();
	
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
	
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	
    	int gm1 = rand.nextInt(5);
    	
    	if(gm1 == 0) {
    		
    		return new ItemStack(BarterItems.BlueCupcake.itemID, 1, 0);
    		
    	}
    	
        return par1ItemStack;
    }
	
}
