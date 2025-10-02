package net.mustafahany2.pizzamod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CakeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mustafahany2.pizzamod.PizzaMod;
import net.mustafahany2.pizzamod.block.custom.PizzaBlock;
import net.mustafahany2.pizzamod.items.ModItems;

public class ModBlocks {
    public static Block PIZZA;

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PizzaMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(PizzaMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        PIZZA = registerBlock("pizza", new PizzaBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

        PizzaMod.LOGGER.info("Registering Mod Blocks For " + PizzaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PIZZA);
        });
    }
}
