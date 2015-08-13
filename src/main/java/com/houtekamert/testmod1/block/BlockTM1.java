package com.houtekamert.testmod1.block;

import com.houtekamert.testmod1.creativetab.CreativeTabTM1;
import com.houtekamert.testmod1.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

// D:\Development\Minecraft Modding\1.7.10\First test mod\Testmod\src\main\resources\assets\testmod1\textures\blocks
// D:\Development\Minecraft Modding\1.7.10\First test mod\Testmod\build\tmp\recompSrc\assets\minecraft\textures\items

public class BlockTM1 extends Block
{
    public BlockTM1(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabTM1.TMb_TAB);
    }

    public BlockTM1()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}
