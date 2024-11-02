package com.nataniel.copperrosegoldsteel;

import com.nataniel.copperrosegoldsteel.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class    ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> ROSE_GOLD =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(Copperrosegoldsteel.MODID, "rose_gold"));

    public static final ResourceKey<TrimMaterial> STEEL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(Copperrosegoldsteel.MODID, "steel"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, ROSE_GOLD, ModItems.ROSE_GOLD_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#ff7a88").getOrThrow()), 0.5f);
        register(context, STEEL, ModItems.STEEL_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#4b4b4b").getOrThrow()), 0.3f);
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style, float itemModelIndex) {
        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimmaterial);
    }
}
