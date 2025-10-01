package net.mustafahany.pizzamod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.mustafahany.pizzamod.PizzaMod;

public class ModItems {
    public static Item DOUGH;

    private static Item registerItem(String name, Item.Settings baseSettings) {
        // Create Identifier & RegistryKey for the item
        Identifier id = Identifier.of(PizzaMod.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        // Attach the registry key to settings so Item.Settings has the id/translation key
        Item.Settings settingsWithKey = baseSettings.registryKey(key);

        // Register using the RegistryKey overload
        return Registry.register(Registries.ITEM, key, new Item(settingsWithKey));
    }

    public static void registerModItems() {
        PizzaMod.LOGGER.info("Registering Mod Items for " + PizzaMod.MOD_ID);

        // Create + register item here (do NOT initialize as a static final at class-load time)
        DOUGH = registerItem("dough", new Item.Settings());

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DOUGH);
        });
    }
}
