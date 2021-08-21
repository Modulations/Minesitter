package com.hertz.lunarsway.blocks;

import com.hertz.lunarsway.TabLunarSway;
import com.hertz.lunarsway.init.BlockInit;
import com.hertz.lunarsway.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {
    public BlockBase(String name, Material material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(TabLunarSway.instance);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }
}
