package net.mustafahany.pizzamod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mustafahany.pizzamod.PizzaMod;

public class ModItems {
    public static Item DOUGH;

    @SuppressWarnings("unused")
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PizzaMod.MOD_ID, name), item);
    }
    
    public static void registerModItems() {
        PizzaMod.LOGGER.info("Registering Mod Items for " + PizzaMod.MOD_ID);

        DOUGH = registerItem("dough", new Item(new Item.Settings()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DOUGH);
        });
    }
}