package com.hertz.lunarsway.init;

import com.hertz.lunarsway.armor.LSArmorBase;
import com.hertz.lunarsway.items.ItemScepter;
import com.hertz.lunarsway.items.LSItemBase;
import com.hertz.lunarsway.items.LSWeaponBase;
import com.hertz.lunarsway.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Armor Materials
    public static final ItemArmor.ArmorMaterial materialWhiteRoyals = EnumHelper.addArmorMaterial("WHITE_ROYAL", Reference.MODID + ":white_royal",18, new int[]{4, 6, 6, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
    public static final ItemArmor.ArmorMaterial materialBlackRoyals = EnumHelper.addArmorMaterial("BLACK_ROYAL", Reference.MODID + ":black_royal",18, new int[]{4, 8, 6, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
    // TODO make dream armor unbreakable
    public static final ItemArmor.ArmorMaterial materialProspit = EnumHelper.addArmorMaterial("PROSPIT_DREAM", Reference.MODID + ":prospit_dream",0, new int[]{0, 0, 0, 0}, 1, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
    public static final ItemArmor.ArmorMaterial materialDerse = EnumHelper.addArmorMaterial("DERSE_DREAM", Reference.MODID + ":derse_dream",0, new int[]{0, 0, 0, 0}, 1, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);

    // Royalty Items
    public static final Item QUEEN_RING = new LSItemBase("queen_ring");
    public static final Item WHITE_SCEPTER = new LSWeaponBase(1200, 1D, 1, 20, "white_scepter");
    public static final Item BLACK_SCEPTER = new LSWeaponBase(1200, 1D, 1, 20, "black_scepter");

    // Armor
    public static final Item WHITE_CROWN = new LSArmorBase("white_crown", materialWhiteRoyals, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLACK_CROWN = new LSArmorBase("black_crown", materialBlackRoyals, 1, EntityEquipmentSlot.HEAD);
    // Prospit
    public static final Item CHESTPLATE_PROSPIT = new LSArmorBase("chestplate_prospit", materialProspit, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_PROSPIT = new LSArmorBase("leggings_prospit", materialProspit, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_PROSPIT = new LSArmorBase("boots_prospit", materialProspit, 1, EntityEquipmentSlot.FEET);
    // Derse
    public static final Item CHESTPLATE_DERSE = new LSArmorBase("chestplate_derse", materialDerse, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_DERSE = new LSArmorBase("leggings_derse", materialDerse, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_DERSE = new LSArmorBase("boots_derse", materialDerse, 1, EntityEquipmentSlot.FEET);

    // Other
    public static final Item DERSE_BRICK = new LSItemBase("derse_brick");
    public static final Item PROSPIT_BRICK = new LSItemBase("prospit_brick");
}
