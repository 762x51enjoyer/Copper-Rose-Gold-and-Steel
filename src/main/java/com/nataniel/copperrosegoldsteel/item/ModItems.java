package com.nataniel.copperrosegoldsteel.item;

import com.nataniel.copperrosegoldsteel.Copperrosegoldsteel;
import com.nataniel.copperrosegoldsteel.util.ModToolTier;
import net.minecraft.world.item.*;
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
    public static final DeferredItem<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
        () -> new SwordItem(ModToolTier.COPPER, new Item.Properties()
                .attributes(SwordItem.createAttributes(ModToolTier.COPPER, 3.0f, -2.4f))));
    public static final DeferredItem<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTier.COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTier.COPPER, 1.0f, -2.8f))));
    public static final DeferredItem<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTier.COPPER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTier.COPPER, 6.0f, -3.1f))));
    public static final DeferredItem<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTier.COPPER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTier.COPPER, 1.5f, -3f))));
    public static final DeferredItem<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTier.COPPER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTier.COPPER, 1.0f, -2.8f))));
    public static final DeferredItem<SwordItem> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(ModToolTier.ROSE_GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTier.ROSE_GOLD, 3.0f, -2.4f))));
    public static final DeferredItem<PickaxeItem> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe",
            () -> new PickaxeItem(ModToolTier.ROSE_GOLD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTier.ROSE_GOLD, 1.0f, -2.8f))));
    public static final DeferredItem<AxeItem> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe",
            () -> new AxeItem(ModToolTier.ROSE_GOLD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTier.ROSE_GOLD, 6.0f, -3.1f))));
    public static final DeferredItem<ShovelItem> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel",
            () -> new ShovelItem(ModToolTier.ROSE_GOLD, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTier.ROSE_GOLD, 1.5f, -3f))));
    public static final DeferredItem<HoeItem> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe",
            () -> new HoeItem(ModToolTier.ROSE_GOLD, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTier.ROSE_GOLD, 1.0f, -2.8f))));
    public static final DeferredItem<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTier.STEEL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTier.STEEL, 3.0f, -2.4f))));
    public static final DeferredItem<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTier.STEEL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTier.STEEL, 1.0f, -2.8f))));
    public static final DeferredItem<AxeItem> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTier.STEEL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTier.STEEL, 6.0f, -3.1f))));
    public static final DeferredItem<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTier.STEEL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTier.STEEL, 1.5f, -3f))));
    public static final DeferredItem<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTier.STEEL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTier.STEEL, 1.0f, -2.8f))));
    //Armor
    public static final DeferredItem<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet",
            ()-> new ArmorItem(ModArmorMaterial.COPPER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            ()-> new ArmorItem(ModArmorMaterial.COPPER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            ()-> new ArmorItem(ModArmorMaterial.COPPER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots",
            ()-> new ArmorItem(ModArmorMaterial.COPPER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet",
            ()-> new ArmorItem(ModArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            ()-> new ArmorItem(ModArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings",
            ()-> new ArmorItem(ModArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            ()-> new ArmorItem(ModArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet",
            ()-> new ArmorItem(ModArmorMaterial.STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(33))));
    public static final DeferredItem<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            ()-> new ArmorItem(ModArmorMaterial.STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(33))));
    public static final DeferredItem<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            ()-> new ArmorItem(ModArmorMaterial.STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(33))));
    public static final DeferredItem<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots",
            ()-> new ArmorItem(ModArmorMaterial.STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(33))));
//Register
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
