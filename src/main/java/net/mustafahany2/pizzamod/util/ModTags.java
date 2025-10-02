package net.mustafahany2.pizzamod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.mustafahany2.pizzamod.PizzaMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_PIZZA_TOOL = createTag("needs_pizza_tool");
        public static final TagKey<Block> INCORRECT_FOR_PIZZA_TOOL = createTag("incorrect_for_pizza_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(PizzaMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(PizzaMod.MOD_ID, name));
        }
    }
}
