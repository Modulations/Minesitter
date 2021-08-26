package com.hertz.lunarsway.init;

import com.hertz.lunarsway.blocks.BlockBase;
import com.hertz.lunarsway.blocks.StairBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block DERSE_BRICKS = new BlockBase("derse_bricks", Material.ROCK);
    public static final Block DERSE_STAIRS = new StairBase("derse_stairs", DERSE_BRICKS.getDefaultState());
    public static final Block PROSPIT_BRICKS = new BlockBase("prospit_bricks", Material.ROCK);
    public static final Block PROSPIT_STAIRS = new StairBase("prospit_stairs", PROSPIT_BRICKS.getDefaultState());
}
