package com.houtekamert.testmod1.item;

import com.houtekamert.testmod1.creativetab.CreativeTabTM1;
import com.houtekamert.testmod1.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemQBPick extends ItemPickaxe
{
    public ItemQBPick(ToolMaterial material)
    {
        super(material);
        this.setUnlocalizedName("qbpick");
        this.setTextureName(Reference.MOD_ID + ":" + "qbpick");
        this.setCreativeTab(CreativeTabTM1.TMT_TAB);
    }




    @Override
    public String getUnlocalizedName()
    { return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName())); }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    { return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName())); }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    { itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)); }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    { return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1); }


}