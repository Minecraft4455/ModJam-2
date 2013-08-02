package net.minecraft4455.bartercraft.core.items;

import net.minecraft.item.Item;
import net.minecraft4455.bartercraft.config.BarterCraftConfig;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BarterItems {

	public static Item BriefCase01;
	public static Item BlueCupcake;
	
	public static void init() {
		
		BriefCase01 = new ItemBriefCase01(BarterCraftConfig.BriefCase01ID);
		LanguageRegistry.addName(BriefCase01, "BriefCase 01");
		
		BlueCupcake = new ItemBlueCupcake(BarterCraftConfig.BlueCupcakeID);
		LanguageRegistry.addName(BlueCupcake, "BlueCupcake");
		
	}
	
}
