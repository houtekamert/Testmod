package com.houtekamert.testmod1;

import com.houtekamert.testmod1.client.handler.keyInputEventHandler;
import com.houtekamert.testmod1.generation.WorldGen;
import com.houtekamert.testmod1.handler.ConfigurationHandler;
import com.houtekamert.testmod1.init.ModBlocks;
import com.houtekamert.testmod1.init.ModItems;
import com.houtekamert.testmod1.init.Recipes;
import com.houtekamert.testmod1.proxy.IProxy;
import com.houtekamert.testmod1.reference.Reference;
import com.houtekamert.testmod1.utitlity.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class testmod1
{
    @Mod.Instance(Reference.MOD_ID)
    public static testmod1 instance;

    @SidedProxy(clientSide = Reference.Client_Proxy_Class, serverSide = Reference.Server_Proxy_Class)
    public static IProxy proxy;

    WorldGen eventWorldGen = new WorldGen();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Pre-initialization commencing...");

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        LogHelper.info(" ...Initializing Items...");
        ModItems.init();
        //LogHelper.info("Item initialization complete");

        LogHelper.info(" ...Initializing Blocks...");
        ModBlocks.init();
        //LogHelper.info("Block initialization complete");

        LogHelper.info(" ...Registering Wordlgeneration...");
        GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);

        LogHelper.info("Pre-initialization complete");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization commencing...");

        LogHelper.info(" ...Registering Keybinds...");
        FMLCommonHandler.instance().bus().register(new keyInputEventHandler());


        LogHelper.info(" ...Initializing Recipes...");
        Recipes.init();

        LogHelper.info("initialization complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-initialization commencing...");

        LogHelper.info("Post-initialization complete");
    }
}
