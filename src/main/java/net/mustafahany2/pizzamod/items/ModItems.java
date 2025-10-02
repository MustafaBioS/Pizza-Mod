package net.mustafahany2.pizzamod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.mustafahany2.pizzamod.PizzaMod;
import net.mustafahany2.pizzamod.block.ModBlocks;

public class ModItems {
    public static final Item DOUGH = registerItem("dough", new Item(new Item.Settings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PizzaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PizzaMod.LOGGER.info("Registering ModItems For " + PizzaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DOUGH);
            entries.add(TOMATO);
            entries.add(ModBlocks.PIZZA);
        });
    }
}
