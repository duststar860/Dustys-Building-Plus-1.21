package dusty.dusty_building_plus.item;

import dusty.dusty_building_plus.DustysBuilding;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static dusty.dusty_building_plus.DustysBuilding.MOD_ID;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }

    public static void registerModItems() {
        DustysBuilding.LOGGER.info("Registering Mod Items for " + MOD_ID);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {});
    }
}