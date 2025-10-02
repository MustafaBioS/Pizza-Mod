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
    public static Item TOMATO;

    private static Item registerItem(String name, Item.Settings baseSettings) {
        Identifier id = Identifier.of(PizzaMod.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        Item.Settings settingsWithKey = baseSettings.registryKey(key);

        return Registry.register(Registries.ITEM, key, new Item(settingsWithKey));
    }

    public static void registerModItems() {
        PizzaMod.LOGGER.info("Registering Mod Items for " + PizzaMod.MOD_ID);

        DOUGH = registerItem("dough", new Item.Settings());
        TOMATO = registerItem("tomato", new Item.Settings());

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DOUGH);
            entries.add(TOMATO);
        });
    }
}
