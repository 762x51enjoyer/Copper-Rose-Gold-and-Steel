package com.nataniel.rosegoldsteel.item;

import com.nataniel.rosegoldsteel.Copperrosegoldsteel;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Copperrosegoldsteel.MODID);
//items
    public static final DeferredItem<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_GOLD_BLEND = ITEMS.register("rose_gold_blend",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_ALLOY = ITEMS.register("steel_alloy",
            () -> new Item(new Item.Properties()));
//Tools

//Register
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
