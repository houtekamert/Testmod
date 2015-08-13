package com.houtekamert.testmod1.block;

import com.houtekamert.testmod1.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockQCable extends BlockTM1
{

    private IIcon[] icons = new IIcon[6];

    public BlockQCable()
    {
        super(Material.rock);
        this.setBlockName("qcable");
        setHardness(2.0f);
        setStepSound(Block.soundTypeMetal);
        setHarvestLevel("pickaxe", 1);

    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        for (int i = 0; i < icons.length; i++)
        {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" + "qcable" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)

    public IIcon getIcon(int side, int meta)
    {
        return icons[side];
    }


}
