package com.houtekamert.testmod1.init;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

//
public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick) );
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));

        //tools
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.qbsword), " s ", " s ", " e ", 's', new ItemStack(ModItems.qbsteel), 'e', new ItemStack(ModItems.ebstick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.qbaxe), "ss ", "se ", " e ", 's', new ItemStack(ModItems.qbsteel), 'e', new ItemStack(ModItems.ebstick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.qbpick), "sss", " e ", " e ", 's', new ItemStack(ModItems.qbsteel), 'e', new ItemStack(ModItems.ebstick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.qbshovel), " s ", " e ", " e ", 's', new ItemStack(ModItems.qbsteel), 'e', new ItemStack(ModItems.ebstick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.qbhoe), "ss ", " e ", " e ", 's', new ItemStack(ModItems.qbsteel), 'e', new ItemStack(ModItems.ebstick));

        //armor
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.qbhelmet), "sss", "sts", "   ", 's', new ItemStack(ModItems.qbsteel), 't', new ItemStack(ModItems.corefragment));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.qbchestplate), "sts", "sss", "sss", 's', new ItemStack(ModItems.qbsteel), 't', new ItemStack(ModItems.corefragment));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.qbleggings), "sss", "sts", "s s", 's', new ItemStack(ModItems.qbsteel), 't', new ItemStack(ModItems.corefragment));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.qbboots), "s s", "sts", "   ", 's', new ItemStack(ModItems.qbsteel), 't', new ItemStack(ModItems.corefragment));

        //blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.qcore), "dsd", "sts", "dsd", 's', new ItemStack(ModItems.qbsteel), 't', new ItemStack(ModItems.corefragment), 'd', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.qcable, 4), "sss", "ttt", "sss", 's', new ItemStack(ModItems.qbsteel), 't', new ItemStack(Items.string));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.qconnector), " s ", "sts", " s ", 's', new ItemStack(ModBlocks.qcable), 't', new ItemStack(ModItems.corefragment));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.qtop), "sss", " t ", "   ", 's', new ItemStack(Items.iron_ingot), 't', new ItemStack(ModBlocks.qcable));


        //items
        GameRegistry.addRecipe(new ItemStack(ModItems.ebstick, 2), "   ", " s ", " s ", 's', new ItemStack(Items.ender_pearl));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.qbsteel), new ItemStack(ModItems.biodust), new ItemStack(ModItems.biodust), new ItemStack(Items.iron_ingot), new ItemStack(Items.coal));

        //smelting
        GameRegistry.addSmelting(ModBlocks.bioore, new ItemStack(ModItems.biodust), 0.1f);

    }
}
