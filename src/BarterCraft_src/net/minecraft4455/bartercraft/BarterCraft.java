package net.minecraft4455.bartercraft;

import net.minecraft4455.bartercraft.info.Referance;
import net.minecraft4455.bartercraft.proxy.CommonProxy;
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
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		
		
	}
	
}
