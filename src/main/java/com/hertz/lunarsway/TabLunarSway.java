package com.hertz.lunarsway;

import com.hertz.lunarsway.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabLunarSway extends CreativeTabs {
    public static final TabLunarSway instance = new TabLunarSway("tabLunarSway");

    private TabLunarSway(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.QUEEN_RING, 1, 0);
    }
}
