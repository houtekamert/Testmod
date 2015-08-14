package com.houtekamert.testmod1.init;

        import com.houtekamert.testmod1.item.*;
        import cpw.mods.fml.common.registry.GameRegistry;
        import net.minecraft.item.Item.ToolMaterial;
        import net.minecraft.item.ItemArmor;
        import net.minecraftforge.common.util.EnumHelper;


public class ModItems
{
    public static ToolMaterial BIOSTEEL= EnumHelper.addToolMaterial("BIOSTEEL", 4, 1500, 15.0F, 4.0F, 20);
    public static ToolMaterial QBSTEEL= EnumHelper.addToolMaterial("QBSTEEL", 4, 3000, 13.0F, 6.0F, 40);
    //public static ToolMaterial MATERIAL= EnumHelper.addToolMaterial("MATERIAL", harvestlvl, durability, speed, damage, enchantability);
    public static ItemArmor.ArmorMaterial AQBSTEEL = EnumHelper.addArmorMaterial("AQBSTEEL", 38, new int[]{4, 8, 6, 4}, 40);
    //public static ItemArmor.ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("NAME", durability, damageReduction[], enchantability);

    //items
    public static final ItemTM1 mapleLeaf = new ItemMapleLeaf();
    public static final ItemTM1 qbsteel = new ItemQBSteel();
    public static final ItemTM1 corefragment = new ItemQCoreFrag();
    public static final ItemTM1 biodust = new ItemBioDust();
    public static final ItemTM1 ebstick = new ItemEBStick();
    public static final ItemTM1 indicolite = new ItemBlueIndicolite();

    //armor
    public static final ItemArmor qbhelmet = (ItemArmor) new ItemQBArmor(AQBSTEEL, 0, 0).setUnlocalizedName("qbhelmet");
    public static final ItemArmor qbchestplate = (ItemArmor) new ItemQBArmor(AQBSTEEL, 0, 1).setUnlocalizedName("qbchestplate");
    public static final ItemArmor qbleggings = (ItemArmor) new ItemQBArmor(AQBSTEEL, 0, 2).setUnlocalizedName("qbleggings");
    public static final ItemArmor qbboots = (ItemArmor) new ItemQBArmor(AQBSTEEL, 0, 3).setUnlocalizedName("qbboots");

    //tools
    public static final ItemQBSword qbsword = new ItemQBSword(QBSTEEL);
    public static final ItemQBPick qbpick = new ItemQBPick(QBSTEEL);
    public static final ItemQBAxe qbaxe = new ItemQBAxe(QBSTEEL);
    public static final ItemQBShovel qbshovel = new ItemQBShovel(QBSTEEL);
    public static final ItemQBHoe qbhoe = new ItemQBHoe(QBSTEEL);

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "MapleLeaf");
        GameRegistry.registerItem(qbsteel, "qbsteel");
        GameRegistry.registerItem(corefragment, "corefragment");
        GameRegistry.registerItem(biodust, "biodust");
        GameRegistry.registerItem(ebstick, "ebstick");
        GameRegistry.registerItem(indicolite, "indicolite");

        //armor
        GameRegistry.registerItem(qbhelmet, "qbhelmet");
        GameRegistry.registerItem(qbchestplate, "qbchestpalate");
        GameRegistry.registerItem(qbleggings, "qbleggings");
        GameRegistry.registerItem(qbboots, "qbboots");

        //tools
        GameRegistry.registerItem(qbsword, "qbsword");
        GameRegistry.registerItem(qbpick, "qbpick");
        GameRegistry.registerItem(qbaxe, "qbaxe");
        GameRegistry.registerItem(qbshovel, "qbshovel");
        GameRegistry.registerItem(qbhoe, "qbhoe");
    }
}
