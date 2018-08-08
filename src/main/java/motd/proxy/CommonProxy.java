package motd.proxy;

import motd.handlers.MOTDBlocks;
import motd.handlers.MOTDEntities;
import motd.handlers.MOTDItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		MOTDEntities.init();
	}

	public void init(FMLInitializationEvent event) {
		// TODO Auto-generated method stub

	}

	public void postInit(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub

	}

}
