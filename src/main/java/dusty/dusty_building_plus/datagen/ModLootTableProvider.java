package dusty.dusty_building_plus.datagen;

import dusty.dusty_building_plus.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CALCITE_WALL);
        addDrop(ModBlocks.CALCITE_SLAB, slabDrops(ModBlocks.CALCITE_SLAB));
        addDrop(ModBlocks.CALCITE_STAIRS);

        addDrop(ModBlocks.OSSUARY_BLOCK);
        addDrop(ModBlocks.TEMP_OSSUARY);

        addDrop(ModBlocks.RED_WOOL_SLAB, slabDrops(ModBlocks.RED_WOOL_SLAB));
        addDrop(ModBlocks.RED_WOOL_STAIRS);
        addDrop(ModBlocks.ORANGE_WOOL_SLAB, slabDrops(ModBlocks.ORANGE_WOOL_SLAB));
        addDrop(ModBlocks.ORANGE_WOOL_STAIRS);
        addDrop(ModBlocks.YELLOW_WOOL_SLAB, slabDrops(ModBlocks.YELLOW_WOOL_SLAB));
        addDrop(ModBlocks.YELLOW_WOOL_STAIRS);
        addDrop(ModBlocks.LIME_WOOL_SLAB, slabDrops(ModBlocks.LIME_WOOL_SLAB));
        addDrop(ModBlocks.LIME_WOOL_STAIRS);
        addDrop(ModBlocks.GREEN_WOOL_SLAB, slabDrops(ModBlocks.GREEN_WOOL_SLAB));
        addDrop(ModBlocks.GREEN_WOOL_STAIRS);
        addDrop(ModBlocks.CYAN_WOOL_SLAB, slabDrops(ModBlocks.CYAN_WOOL_SLAB));
        addDrop(ModBlocks.CYAN_WOOL_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_WOOL_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        addDrop(ModBlocks.BLUE_WOOL_SLAB, slabDrops(ModBlocks.BLUE_WOOL_SLAB));
        addDrop(ModBlocks.BLUE_WOOL_STAIRS);
        addDrop(ModBlocks.PURPLE_WOOL_SLAB, slabDrops(ModBlocks.PURPLE_WOOL_SLAB));
        addDrop(ModBlocks.PURPLE_WOOL_STAIRS);
        addDrop(ModBlocks.MAGENTA_WOOL_SLAB, slabDrops(ModBlocks.MAGENTA_WOOL_SLAB));
        addDrop(ModBlocks.MAGENTA_WOOL_STAIRS);
        addDrop(ModBlocks.PINK_WOOL_SLAB, slabDrops(ModBlocks.PINK_WOOL_SLAB));
        addDrop(ModBlocks.PINK_WOOL_STAIRS);
        addDrop(ModBlocks.WHITE_WOOL_SLAB, slabDrops(ModBlocks.WHITE_WOOL_SLAB));
        addDrop(ModBlocks.WHITE_WOOL_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_WOOL_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        addDrop(ModBlocks.GRAY_WOOL_SLAB, slabDrops(ModBlocks.GRAY_WOOL_SLAB));
        addDrop(ModBlocks.GRAY_WOOL_STAIRS);
        addDrop(ModBlocks.BLACK_WOOL_SLAB, slabDrops(ModBlocks.BLACK_WOOL_SLAB));
        addDrop(ModBlocks.BLACK_WOOL_STAIRS);
        addDrop(ModBlocks.BROWN_WOOL_SLAB, slabDrops(ModBlocks.BROWN_WOOL_SLAB));
        addDrop(ModBlocks.BROWN_WOOL_STAIRS);

        addDrop(ModBlocks.TERRACOTTA_STAIRS);
        addDrop(ModBlocks.RED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIME_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PINK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BROWN_TERRACOTTA_STAIRS);
    }
}




