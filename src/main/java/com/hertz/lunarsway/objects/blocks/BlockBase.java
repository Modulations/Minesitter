package com.hertz.lunarsway.objects.blocks;

import com.hertz.lunarsway.init.BlockInit;
import com.hertz.lunarsway.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {
    public BlockBase(String name, Material material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }
}
