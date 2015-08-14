package com.houtekamert.testmod1.block;//

import com.houtekamert.testmod1.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

import static com.houtekamert.testmod1.init.ModItems.indicolite;

public class BlockBlueElbaite extends BlockTM1
{
    public BlockBlueElbaite()
    {
        super(Material.rock);
        this.setBlockName("belbaite");
        setHardness(4.0f);
        setStepSound(Block.soundTypeStone);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return ModItems.indicolite;
    }

    @Override
    public int quantityDropped(Random random)
    {
        return 1;
    }
}
