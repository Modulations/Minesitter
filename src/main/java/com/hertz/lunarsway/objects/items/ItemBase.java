package com.hertz.lunarsway.objects.items;

import com.hertz.lunarsway.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(String regName, String unlocName) {
        this.setRegistryName(regName);
        this.setUnlocalizedName(unlocName);
        this.setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }
}
