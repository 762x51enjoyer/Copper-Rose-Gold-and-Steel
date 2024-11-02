package com.nataniel.copperrosegoldsteel.datagen;

import com.nataniel.copperrosegoldsteel.Copperrosegoldsteel;
import com.nataniel.copperrosegoldsteel.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Copperrosegoldsteel.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD.get())
                .add(ModItems.ROSE_GOLD_SWORD.get())
                .add(ModItems.STEEL_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE.get())
                .add(ModItems.ROSE_GOLD_PICKAXE.get())
                .add(ModItems.STEEL_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.COPPER_AXE.get())
                .add(ModItems.ROSE_GOLD_AXE.get())
                .add(ModItems.STEEL_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL.get())
                .add(ModItems.ROSE_GOLD_SHOVEL.get())
                .add(ModItems.STEEL_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.COPPER_HOE.get())
                .add(ModItems.ROSE_GOLD_HOE.get())
                .add(ModItems.STEEL_HOE.get());
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_HELMET.get())
                .add(ModItems.COPPER_CHESTPLATE.get())
                .add(ModItems.COPPER_LEGGINGS.get())
                .add(ModItems.COPPER_BOOTS.get())
                .add(ModItems.ROSE_GOLD_HELMET.get())
                .add(ModItems.ROSE_GOLD_CHESTPLATE.get())
                .add(ModItems.ROSE_GOLD_LEGGINGS.get())
                .add(ModItems.ROSE_GOLD_BOOTS.get())
                .add(ModItems.STEEL_HELMET.get())
                .add(ModItems.STEEL_CHESTPLATE.get())
                .add(ModItems.STEEL_LEGGINGS.get())
                .add(ModItems.STEEL_BOOTS.get());
    }
}
