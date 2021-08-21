package com.hertz.lunarsway.items;

import com.hertz.lunarsway.TabLunarSway;
import com.hertz.lunarsway.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LSItemBase extends Item {
    protected boolean unbreakable;
    protected double weaponDamage;
    protected int enchantability;
    protected double weaponSpeed;
    protected ToolMaterial material;
    ItemStack repairMaterial = ItemStack.EMPTY;

    protected float harvestSpeed = 0;
    protected int harvestLevel = 0;

    public LSItemBase(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(TabLunarSway.instance);

        ItemInit.ITEMS.add(this);
    }
}
