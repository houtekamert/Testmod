package com.houtekamert.testmod1.init;


import com.houtekamert.testmod1.block.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockTM1 flag = new BlockFlag();
    public static final BlockTM1 qcore = new BlockQCore();
    public static final BlockTM1 qcable = new BlockQCable();
    public static final BlockTM1 bioore = new BlockBioOre();
    public static final BlockTM1 qtop = new BlockQTop();
    public static final BlockTM1 qconnector = new BlockQConnector();
    public static final BlockTM1 belbaite = new BlockBlueElbaite();


    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(qcore, "qcore");
        GameRegistry.registerBlock(qcable, "tmbtesta");
        GameRegistry.registerBlock(bioore, "bioore");
        GameRegistry.registerBlock(qtop, "qtop");
        GameRegistry.registerBlock(qconnector, "qconnector");
        GameRegistry.registerBlock(belbaite, "bindicolite");
    }


}
