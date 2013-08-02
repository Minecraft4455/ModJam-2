package net.minecraft4455.bartercraft;

import java.util.logging.Logger;

import net.minecraft4455.bartercraft.config.BarterCraftConfig;
import net.minecraft4455.bartercraft.core.items.BarterItems;
import net.minecraft4455.bartercraft.info.Referance;
import net.minecraft4455.bartercraft.proxy.CommonProxy;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(name = Referance.NAME, modid = Referance.MODID, version = Referance.VERSION)
@NetworkMod(clientSideRequired = Referance.CLIENT, serverSideRequired = Referance.SERVER)
public class BarterCraft {

	@Instance(Referance.MODID)
	public static BarterCraft instance;
	
	@SidedProxy(clientSide = Referance.CLIENTPROXY, serverSide = Referance.SERVERPROXY)
	public static CommonProxy proxy;
	
	public static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = Logger.getLogger(Referance.MODID);
		logger.setParent(FMLLog.getLogger());
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		BarterCraftConfig.start(config);
		
		BarterItems.init();
		
	}
	
}
