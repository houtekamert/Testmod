package com.houtekamert.testmod1.item;//

import com.houtekamert.testmod1.creativetab.CreativeTabTM1;
import com.houtekamert.testmod1.init.ModItems;
import com.houtekamert.testmod1.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemQBArmor extends ItemArmor {
    public ItemQBArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
        super(armorMaterial, renderIndex, armorType);
        this.setCreativeTab(CreativeTabTM1.TMT_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(this.armorType == 2)
        {
            return "testmod1:textures/models/armor/qbarmour_layer_2.png";
        }
        return "testmod1:textures/models/armor/qbarmour_layer_1.png";
    }


    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ModItems.qbhelmet))
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 100));
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
