package com.nataniel.copperrosegoldsteel.datagen;

import com.nataniel.copperrosegoldsteel.Copperrosegoldsteel;
import com.nataniel.copperrosegoldsteel.ModTrimMaterials;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder datapackEntriesBuilder = new RegistrySetBuilder()
            .add(Registries.TRIM_MATERIAL, ModTrimMaterials::bootstrap);

    public ModDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries ) {
        super(output, registries, datapackEntriesBuilder, Set.of(Copperrosegoldsteel.MODID));
    }
}
