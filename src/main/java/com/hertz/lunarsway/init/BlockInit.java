package com.hertz.lunarsway.init;

import com.hertz.lunarsway.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block DERSITE_BRICKS = new BlockBase("dersite_bricks", Material.ROCK);
}
