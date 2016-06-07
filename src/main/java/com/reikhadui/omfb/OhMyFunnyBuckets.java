package com.reikhadui.omfb;

import com.reikhadui.omfb.proxy.iProxy;
import com.reikhadui.omfb.reference.reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=reference.MOD_ID, name=reference.MOD_NAME, version=reference.VERSION)
public class OhMyFunnyBuckets
{
    @Mod.Instance("OhMyFunnyBuckets")
    public static OhMyFunnyBuckets instance;

    @SidedProxy(clientSide = "com.reikhadui.omfb.proxy.clientProxy", serverSide = "com.reikhadui.omfb.proxy.serverProxy")
    public static iProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
