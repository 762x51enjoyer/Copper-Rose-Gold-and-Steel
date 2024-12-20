package com.nataniel.copperrosegoldsteel.block;

import com.nataniel.copperrosegoldsteel.Copperrosegoldsteel;
import com.nataniel.copperrosegoldsteel.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Copperrosegoldsteel.MODID);
//Blocks
    public static final DeferredBlock<Block> ROSE_GOLD_BLOCK = registerBlock ("rose_gold_block",
        () -> new Block(BlockBehaviour.Properties.of()
                .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock ("steel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<DoorBlock> STEEL_DOOR = registerBlock ("steel_door",
            () -> new DoorBlock(BlockSetType.IRON,BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).noOcclusion()));
//Items
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
}
    private static <T extends Block> void registerBlockItem (String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
//Register
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
