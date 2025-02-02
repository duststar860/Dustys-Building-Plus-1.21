package dusty.dusty_building_plus.datagen;

import dusty.dusty_building_plus.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.SPRUCE_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.CALCITE_SLAB)
                .add(ModBlocks.CALCITE_STAIRS)

                .add(ModBlocks.OSSUARY_BLOCK)

                .add(ModBlocks.TERRACOTTA_STAIRS)
                .add(ModBlocks.RED_TERRACOTTA_STAIRS)
                .add(ModBlocks.ORANGE_TERRACOTTA_STAIRS)
                .add(ModBlocks.YELLOW_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIME_TERRACOTTA_STAIRS)
                .add(ModBlocks.GREEN_TERRACOTTA_STAIRS)
                .add(ModBlocks.CYAN_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)
                .add(ModBlocks.BLUE_TERRACOTTA_STAIRS)
                .add(ModBlocks.PURPLE_TERRACOTTA_STAIRS)
                .add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS)
                .add(ModBlocks.PINK_TERRACOTTA_STAIRS)
                .add(ModBlocks.WHITE_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)
                .add(ModBlocks.GRAY_TERRACOTTA_STAIRS)
                .add(ModBlocks.BLACK_TERRACOTTA_STAIRS)
                .add(ModBlocks.BROWN_TERRACOTTA_STAIRS);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.CALCITE_WALL)

                .add(ModBlocks.SPRUCE_WALL);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.CALCITE_STAIRS)

                .add(ModBlocks.RED_WOOL_STAIRS)
                .add(ModBlocks.ORANGE_WOOL_STAIRS)
                .add(ModBlocks.YELLOW_WOOL_STAIRS)
                .add(ModBlocks.LIME_WOOL_STAIRS)
                .add(ModBlocks.GREEN_WOOL_STAIRS)
                .add(ModBlocks.CYAN_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(ModBlocks.BLUE_WOOL_STAIRS)
                .add(ModBlocks.PURPLE_WOOL_STAIRS)
                .add(ModBlocks.MAGENTA_WOOL_STAIRS)
                .add(ModBlocks.PINK_WOOL_STAIRS)
                .add(ModBlocks.WHITE_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .add(ModBlocks.GRAY_WOOL_STAIRS)
                .add(ModBlocks.BLACK_WOOL_STAIRS)
                .add(ModBlocks.BROWN_WOOL_STAIRS)

                .add(ModBlocks.TERRACOTTA_STAIRS)
                .add(ModBlocks.RED_TERRACOTTA_STAIRS)
                .add(ModBlocks.ORANGE_TERRACOTTA_STAIRS)
                .add(ModBlocks.YELLOW_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIME_TERRACOTTA_STAIRS)
                .add(ModBlocks.GREEN_TERRACOTTA_STAIRS)
                .add(ModBlocks.CYAN_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)
                .add(ModBlocks.BLUE_TERRACOTTA_STAIRS)
                .add(ModBlocks.PURPLE_TERRACOTTA_STAIRS)
                .add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS)
                .add(ModBlocks.PINK_TERRACOTTA_STAIRS)
                .add(ModBlocks.WHITE_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)
                .add(ModBlocks.GRAY_TERRACOTTA_STAIRS)
                .add(ModBlocks.BLACK_TERRACOTTA_STAIRS)
                .add(ModBlocks.BROWN_TERRACOTTA_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.CALCITE_SLAB)

                .add(ModBlocks.RED_WOOL_SLAB)
                .add(ModBlocks.ORANGE_WOOL_SLAB)
                .add(ModBlocks.YELLOW_WOOL_SLAB)
                .add(ModBlocks.LIME_WOOL_SLAB)
                .add(ModBlocks.GREEN_WOOL_SLAB)
                .add(ModBlocks.CYAN_WOOL_SLAB)
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(ModBlocks.BLUE_WOOL_SLAB)
                .add(ModBlocks.PURPLE_WOOL_SLAB)
                .add(ModBlocks.MAGENTA_WOOL_SLAB)
                .add(ModBlocks.PINK_WOOL_SLAB)
                .add(ModBlocks.WHITE_WOOL_SLAB)
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(ModBlocks.GRAY_WOOL_SLAB)
                .add(ModBlocks.BLACK_WOOL_SLAB)
                .add(ModBlocks.BROWN_WOOL_SLAB);
    }
}
