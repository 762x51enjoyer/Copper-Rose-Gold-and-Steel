package com.nataniel.copperrosegoldsteel.util;

import com.nataniel.copperrosegoldsteel.item.ModItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTier {
    public static final Tier COPPER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
            192, 5f, 1.5f, 8, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final Tier ROSE_GOLD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ROSE_GOLD_TOOL,
            250, 12f, 2f, 22, () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT));
    public static final Tier STEEL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL,
            2048, 8f, 3f, 14, () -> Ingredient.of(ModItems.STEEL_INGOT));
}
