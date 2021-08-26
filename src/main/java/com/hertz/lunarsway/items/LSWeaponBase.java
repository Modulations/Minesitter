package com.hertz.lunarsway.items;

import com.hertz.lunarsway.TabLunarSway;
import com.hertz.lunarsway.init.ItemInit;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LSWeaponBase extends Item {
    protected boolean unbreakable;
    protected double weaponDamage;
    protected int enchantability;
    protected double weaponSpeed;
    protected ToolMaterial material;
    ItemStack repairMaterial = ItemStack.EMPTY;

    protected float harvestSpeed = 0;
    protected int harvestLevel = 0;

    public LSWeaponBase(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);

        ItemInit.ITEMS.add(this);
    }

    // thank you ciber :)
    public LSWeaponBase(int maxUses, double damageVsEntity, double weaponSpeed, int enchantability, String name)
    {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);

        this.unbreakable = maxUses <= 0;
        this.maxStackSize = 1;
        this.setMaxDamage(maxUses);
        this.weaponDamage = damageVsEntity;
        this.enchantability = enchantability;
        this.weaponSpeed = weaponSpeed;
        this.setCreativeTab(TabLunarSway.instance);

        ItemInit.ITEMS.add(this);
    }

    public double getAttackDamage(ItemStack stack) {
        return weaponDamage;
    }

    public double getAttackSpeed(ItemStack stack) {
        return weaponSpeed;
    }

    @Override
    public int getItemEnchantability() {
        return enchantability;
    }

    @Override
    public boolean isDamageable() {
        return !unbreakable;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase player) {
        if (!this.unbreakable) {
            stack.damageItem(1, player);
        }
        return true;
    }
}
