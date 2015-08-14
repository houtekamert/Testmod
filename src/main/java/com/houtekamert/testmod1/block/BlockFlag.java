package com.houtekamert.testmod1.block;

import com.houtekamert.testmod1.creativetab.CreativeTabTM1;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockFlag extends BlockTM1
{
    public BlockFlag() {
        super();
        this.setBlockName("flag");
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }



}
