package com.nataniel.copperrosegoldsteel.datagen;

import com.nataniel.copperrosegoldsteel.block.ModBlocks;
import com.nataniel.copperrosegoldsteel.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> STEEL_ALLOY = List.of(ModItems.STEEL_ALLOY);
        List<ItemLike> ROSE_GOLD_BLEND = List.of(ModItems.ROSE_GOLD_BLEND);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_DOOR.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_GOLD_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK)
                .unlockedBy("has_steel_block", has(ModBlocks.STEEL_BLOCK))
                .save(recipeOutput, "copperrosegoldsteel:steel_ingot_from_steel_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.ROSE_GOLD_BLOCK)
                .unlockedBy("has_rose_gold_block", has(ModBlocks.STEEL_BLOCK))
                .save(recipeOutput, "copperrosegoldsteel:rose_gold_ingot_from_rose_gold_block");
        oreSmelting(recipeOutput, STEEL_ALLOY, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.25f, 200, "steel");
        oreBlasting(recipeOutput, STEEL_ALLOY, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.25f, 100, "steel");
        oreSmelting(recipeOutput, ROSE_GOLD_BLEND, RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 0.25f, 200, "rose_gold");
        oreBlasting(recipeOutput, ROSE_GOLD_BLEND, RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 0.25f, 100, "rose_gold");

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE.get())
                .pattern("RRR")
                .pattern(" W ")
                .pattern(" W ")
                .define('R', Items.COPPER_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_copper", has(Items.COPPER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_PICKAXE.get())
                .pattern("RRR")
                .pattern(" W ")
                .pattern(" W ")
                .define('R', ModItems.ROSE_GOLD_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE.get())
                .pattern("RRR")
                .pattern(" W ")
                .pattern(" W ")
                .define('R', ModItems.STEEL_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_AXE.get())
                .pattern("RR ")
                .pattern("RW ")
                .pattern(" W ")
                .define('R', Items.COPPER_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_copper", has(Items.COPPER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_AXE.get())
                .pattern("RR ")
                .pattern("RW ")
                .pattern(" W ")
                .define('R', ModItems.ROSE_GOLD_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_AXE.get())
                .pattern("RR ")
                .pattern("RW ")
                .pattern(" W ")
                .define('R', ModItems.STEEL_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_HOE.get())
                .pattern("RR ")
                .pattern(" W ")
                .pattern(" W ")
                .define('R', Items.COPPER_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_copper", has(Items.COPPER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_HOE.get())
                .pattern("RR ")
                .pattern(" W ")
                .pattern(" W ")
                .define('R', ModItems.ROSE_GOLD_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_HOE.get())
                .pattern("RR ")
                .pattern(" W ")
                .pattern(" W ")
                .define('R', ModItems.STEEL_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL.get())
                .pattern(" R ")
                .pattern(" W ")
                .pattern(" W ")
                .define('R', Items.COPPER_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_copper", has(Items.COPPER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SHOVEL.get())
                .pattern(" R ")
                .pattern(" W ")
                .pattern(" W ")
                .define('R', ModItems.ROSE_GOLD_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL.get())
                .pattern(" R ")
                .pattern(" W ")
                .pattern(" W ")
                .define('R', ModItems.STEEL_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_SWORD.get())
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" W ")
                .define('R', Items.COPPER_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_copper", has(Items.COPPER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_SWORD.get())
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" W ")
                .define('R', ModItems.ROSE_GOLD_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_SWORD.get())
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" W ")
                .define('R', ModItems.STEEL_INGOT)
                .define('W', Items.STICK)
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_HELMET.get())
                .pattern("RRR")
                .pattern("R R")
                .define('R', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS.get())
                .pattern("R R")
                .pattern("R R")
                .define('R', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .define('R', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE.get())
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_HELMET.get())
                .pattern("RRR")
                .pattern("R R")
                .define('R', ModItems.ROSE_GOLD_INGOT)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_BOOTS.get())
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.ROSE_GOLD_INGOT)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_LEGGINGS.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.ROSE_GOLD_INGOT)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_CHESTPLATE.get())
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.ROSE_GOLD_INGOT)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_HELMET.get())
                .pattern("RRR")
                .pattern("R R")
                .define('R', ModItems.STEEL_INGOT)
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_BOOTS.get())
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.STEEL_INGOT)
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_LEGGINGS.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.STEEL_INGOT)
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_CHESTPLATE.get())
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.STEEL_INGOT)
                .unlockedBy("has_steel_ingot", has(ModItems.STEEL_INGOT)).save(recipeOutput);
    }
}
