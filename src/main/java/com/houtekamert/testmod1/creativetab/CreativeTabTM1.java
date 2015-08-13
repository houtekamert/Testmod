package com.houtekamert.testmod1.creativetab;


import com.houtekamert.testmod1.init.ModBlocks;
import com.houtekamert.testmod1.init.ModItems;
import com.houtekamert.testmod1.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTM1
{
    public static final CreativeTabs TMI_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.qbsteel;
        }

        public String getTranslatedTabLabel()
        {
            return "Test Mod Items";
        }
    };

    public static final CreativeTabs TMb_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }

        public String getTranslatedTabLabel()
        {
            return "Test Mod Blocks";
        }
    };

    public static final CreativeTabs TMT_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.qbsword;
        }

        public String getTranslatedTabLabel()
        {
            return "Test Mod Tools";
        }
    };
}
