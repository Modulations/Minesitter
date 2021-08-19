package com.hertz.lunarsway;

import com.hertz.lunarsway.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import com.hertz.lunarsway.util.Reference;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
    private static Logger logger;

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}
}
