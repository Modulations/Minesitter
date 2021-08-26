package com.hertz.lunarsway.items;

import com.hertz.lunarsway.TabLunarSway;
import com.hertz.lunarsway.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LSItemBase extends Item {
    public LSItemBase(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(TabLunarSway.instance);

        ItemInit.ITEMS.add(this);
    }
}
