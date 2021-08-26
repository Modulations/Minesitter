package com.hertz.lunarsway.blocks;

import com.hertz.lunarsway.TabLunarSway;
import com.hertz.lunarsway.init.BlockInit;
import com.hertz.lunarsway.init.ItemInit;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;

public class StairBase extends BlockStairs {
    public StairBase(String name, IBlockState modelState) {
        super(modelState);
        this.useNeighborBrightness = true;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TabLunarSway.instance);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }
}
