package dusty.dusty_building_plus.block;

import dusty.dusty_building_plus.DustysBuilding;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static dusty.dusty_building_plus.DustysBuilding.MOD_ID;

public class ModBlocks {
    //SETTING UP THE BLOCK AND ITEM REGISTRARS
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    //REGISTERING THE BLOCKS VVV
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.CALCITE)));
    //add diorite, andesite, and granite brick suite; calcite brick suite? polished calcite? chiseled calcite with greek meander?

    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            new StairsBlock(Blocks.RED_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            new StairsBlock(Blocks.LIME_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            new StairsBlock(Blocks.PINK_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            new SlabBlock(SlabBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_WOOL)));

    //ADDING BLOCKS TO CREATIVE TABS VVV
    public static void registerModBlocks(){DustysBuilding.LOGGER.info("Registering ModBlocks for " + MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.CALCITE_WALL);
            entries.add(ModBlocks.CALCITE_SLAB);
            entries.add(ModBlocks.CALCITE_STAIRS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(ModBlocks.RED_WOOL_SLAB);
            entries.add(ModBlocks.RED_WOOL_STAIRS);
            entries.add(ModBlocks.ORANGE_WOOL_SLAB);
            entries.add(ModBlocks.ORANGE_WOOL_STAIRS);
            entries.add(ModBlocks.YELLOW_WOOL_SLAB);
            entries.add(ModBlocks.YELLOW_WOOL_STAIRS);
            entries.add(ModBlocks.LIME_WOOL_SLAB);
            entries.add(ModBlocks.LIME_WOOL_STAIRS);
            entries.add(ModBlocks.GREEN_WOOL_SLAB);
            entries.add(ModBlocks.GREEN_WOOL_STAIRS);
            entries.add(ModBlocks.CYAN_WOOL_SLAB);
            entries.add(ModBlocks.CYAN_WOOL_STAIRS);
            entries.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
            entries.add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
            entries.add(ModBlocks.BLUE_WOOL_SLAB);
            entries.add(ModBlocks.BLUE_WOOL_STAIRS);
            entries.add(ModBlocks.PURPLE_WOOL_SLAB);
            entries.add(ModBlocks.PURPLE_WOOL_STAIRS);
            entries.add(ModBlocks.MAGENTA_WOOL_SLAB);
            entries.add(ModBlocks.MAGENTA_WOOL_STAIRS);
            entries.add(ModBlocks.PINK_WOOL_SLAB);
            entries.add(ModBlocks.PINK_WOOL_STAIRS);
            entries.add(ModBlocks.WHITE_WOOL_SLAB);
            entries.add(ModBlocks.WHITE_WOOL_STAIRS);
            entries.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
            entries.add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
            entries.add(ModBlocks.GRAY_WOOL_SLAB);
            entries.add(ModBlocks.GRAY_WOOL_STAIRS);
            entries.add(ModBlocks.BLACK_WOOL_SLAB);
            entries.add(ModBlocks.BLACK_WOOL_STAIRS);
            entries.add(ModBlocks.BROWN_WOOL_SLAB);
            entries.add(ModBlocks.BROWN_WOOL_STAIRS);
        });
    }
}
