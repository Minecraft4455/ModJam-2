package net.minecraft4455.bartercraft.core.items;

import java.util.Random;

import net.minecraft.block.Block;
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

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {

		final int gm1 = rand.nextInt(20);

		if (gm1 == 0)
			return new ItemStack(BarterItems.GhostlyLantern.itemID, 1, 0);

		if (gm1 == 1)
			return new ItemStack(Item.appleGold.itemID, 1, 0);

		if (gm1 == 2)
			return new ItemStack(Item.diamond.itemID, 1, 0);

		if (gm1 == 3)
			return new ItemStack(Block.dirt.blockID, 1, 0);

		if (gm1 == 4)
			return new ItemStack(BarterItems.GhostlyLantern.itemID, 1, 0);

		if (gm1 == 0)
			return new ItemStack(BarterItems.BlueCupcake.itemID, 1, 0);

		if (gm1 == 1)
			return new ItemStack(BarterItems.HillarysHickup.itemID, 1, 0);

		if (gm1 == 2)
			return new ItemStack(Item.diamond.itemID, 1, 0);

		if (gm1 == 3)
			return new ItemStack(Block.dirt.blockID, 1, 0);

		if (gm1 == 4)
			return new ItemStack(BarterItems.BlueCupcake.itemID, 1, 0);

		if (gm1 == 5)
			return new ItemStack(BarterItems.BlueCupcake.itemID, 1, 0);

		if (gm1 == 6)
			return new ItemStack(BarterItems.GhostlyLantern.itemID, 1, 0);

		if (gm1 == 7)
			return new ItemStack(Item.diamond.itemID, 1, 0);

		if (gm1 == 8)
			return new ItemStack(BarterItems.GillysBoots.itemID, 1, 0);

		if (gm1 == 9)
			return new ItemStack(BarterItems.BlueCupcake.itemID, 1, 0);

		if (gm1 == 10)
			return new ItemStack(BarterItems.GillysBoots.itemID, 1, 0);

		if (gm1 == 11)
			return new ItemStack(Item.diamond.itemID, 1, 0);

		if (gm1 == 12)
			return new ItemStack(Block.dirt.blockID, 1, 0);

		if (gm1 == 13)
			return new ItemStack(BarterItems.BlueCupcake.itemID, 1, 0);

		if (gm1 == 14)
			return new ItemStack(BarterItems.BlueCupcake.itemID, 1, 0);

		if (gm1 == 15)
			return new ItemStack(BarterItems.HillarysHickup.itemID, 1, 0);

		if (gm1 == 16)
			return new ItemStack(Item.diamond.itemID, 1, 0);

		if (gm1 == 17)
			return new ItemStack(BarterItems.HillarysHickup.itemID, 1, 0);

		if (gm1 == 18)
			return new ItemStack(BarterItems.BlueCupcake.itemID, 1, 0);

		if (gm1 == 19)
			return new ItemStack(BarterItems.BlueCupcake.itemID, 1, 0);

		return this
				.onItemRightClick(par1ItemStack, par2World, par3EntityPlayer);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {

		itemIcon = icon.registerIcon("minecraft4455:BriefCase01");

	}

}
