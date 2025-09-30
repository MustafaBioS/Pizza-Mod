package net.mustafahany.pizzamod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mustafahany.pizzamod.PizzaMod;

public class ModItems {
    public static final Item DOUGH_ITEM = regiserItem("dough", new Item(new Item.Settings()));

    private static Item regiserItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PizzaMod.MOD_ID), item);
    }

    public static void registerModItems() {
        PizzaMod.LOGGER.info("Registering Mod Items for" + PizzaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DOUGH_ITEM);
        });
    }
}
