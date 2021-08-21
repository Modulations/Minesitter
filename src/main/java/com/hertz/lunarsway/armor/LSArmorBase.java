package com.hertz.lunarsway.armor;

import com.hertz.lunarsway.TabLunarSway;
import com.hertz.lunarsway.init.ItemInit;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class LSArmorBase extends ItemArmor {
    public LSArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipSlot) {
        super(material, renderIndex, equipSlot);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(TabLunarSway.instance);

        ItemInit.ITEMS.add(this);
    }
}
