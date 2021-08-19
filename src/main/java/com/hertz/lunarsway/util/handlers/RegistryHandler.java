package com.hertz.lunarsway.util.handlers;

import com.hertz.lunarsway.init.BlockInit;
import com.hertz.lunarsway.init.ItemInit;
import com.hertz.lunarsway.Main;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ItemInit.ITEMS) {
            Main.proxy.registerItemRenderer(item, 0, "inventory");
        }
        for (Block block : BlockInit.BLOCKS) {
            Main.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
    }

    public static void initRegistries() {
        Main.proxy.render();
    }
}
