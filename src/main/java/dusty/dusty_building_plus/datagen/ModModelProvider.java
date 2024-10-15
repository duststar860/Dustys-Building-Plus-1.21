package dusty.dusty_building_plus.datagen;

import dusty.dusty_building_plus.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool calcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
            calcitePool.wall(ModBlocks.CALCITE_WALL);
            calcitePool.slab(ModBlocks.CALCITE_SLAB);
            calcitePool.stairs(ModBlocks.CALCITE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool redWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_WOOL);
            redWoolPool.slab(ModBlocks.RED_WOOL_SLAB);
            redWoolPool.stairs(ModBlocks.RED_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool orangeWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_WOOL);
            orangeWoolPool.slab(ModBlocks.ORANGE_WOOL_SLAB);
            orangeWoolPool.stairs(ModBlocks.ORANGE_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool yellowWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_WOOL);
            yellowWoolPool.slab(ModBlocks.YELLOW_WOOL_SLAB);
            yellowWoolPool.stairs(ModBlocks.YELLOW_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool limeWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_WOOL);
            limeWoolPool.slab(ModBlocks.LIME_WOOL_SLAB);
            limeWoolPool.stairs(ModBlocks.LIME_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool greenWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_WOOL);
            greenWoolPool.slab(ModBlocks.GREEN_WOOL_SLAB);
            greenWoolPool.stairs(ModBlocks.GREEN_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool cyanWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_WOOL);
            cyanWoolPool.slab(ModBlocks.CYAN_WOOL_SLAB);
            cyanWoolPool.stairs(ModBlocks.CYAN_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool lightBlueWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_WOOL);
            lightBlueWoolPool.slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
            lightBlueWoolPool.stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool blueWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_WOOL);
            blueWoolPool.slab(ModBlocks.BLUE_WOOL_SLAB);
            blueWoolPool.stairs(ModBlocks.BLUE_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool purpleWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_WOOL);
            purpleWoolPool.slab(ModBlocks.PURPLE_WOOL_SLAB);
            purpleWoolPool.stairs(ModBlocks.PURPLE_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool magentaWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_WOOL);
            magentaWoolPool.slab(ModBlocks.MAGENTA_WOOL_SLAB);
            magentaWoolPool.stairs(ModBlocks.MAGENTA_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool pinkWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_WOOL);
            pinkWoolPool.slab(ModBlocks.PINK_WOOL_SLAB);
            pinkWoolPool.stairs(ModBlocks.PINK_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool whiteWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL);
            whiteWoolPool.slab(ModBlocks.WHITE_WOOL_SLAB);
            whiteWoolPool.stairs(ModBlocks.WHITE_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool lightGrayWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_WOOL);
            lightGrayWoolPool.slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
            lightGrayWoolPool.stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool grayWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_WOOL);
            grayWoolPool.slab(ModBlocks.GRAY_WOOL_SLAB);
            grayWoolPool.stairs(ModBlocks.GRAY_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool blackWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_WOOL);
            blackWoolPool.slab(ModBlocks.BLACK_WOOL_SLAB);
            blackWoolPool.stairs(ModBlocks.BLACK_WOOL_STAIRS);
        BlockStateModelGenerator.BlockTexturePool brownWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_WOOL);
            brownWoolPool.slab(ModBlocks.BROWN_WOOL_SLAB);
            brownWoolPool.stairs(ModBlocks.BROWN_WOOL_STAIRS);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
