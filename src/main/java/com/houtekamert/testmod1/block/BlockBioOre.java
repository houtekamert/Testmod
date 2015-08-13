package com.houtekamert.testmod1.block;//

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBioOre extends BlockTM1
{
    public BlockBioOre()
    {
        super(Material.rock);
        this.setBlockName("bioore");
        setHardness(4.0f);
        setStepSound(Block.soundTypeStone);
        setHarvestLevel("pickaxe", 2);



    }
}
