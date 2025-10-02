package net.mustafahany2.pizzamod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.mustafahany2.pizzamod.PizzaMod;
import net.mustafahany2.pizzamod.block.ModBlocks;
import net.mustafahany2.pizzamod.util.ModTags;

public class ModItems {
    public static final Item DOUGH = registerItem("dough", new Item(new Item.Settings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings()));
    public static final Item PIZZA_CUTTER = registerItem("pizza_cutter", new SwordItem(ModToolMaterials.PIZZA_CUTTER,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PIZZA_CUTTER, 3, -2.4F))));

    public static final Item PIZZA_HELMET = registerItem("pizza_helmet", new ArmorItem(
            ModArmorMaterials.PIZZA_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final Item PIZZA_CHESTPLATE = registerItem("pizza_chestplate", new ArmorItem(
            ModArmorMaterials.PIZZA_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

    public static final Item PIZZA_LEGGINGS = registerItem("pizza_leggings", new ArmorItem(
            ModArmorMaterials.PIZZA_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));


    public static final Item PIZZA_BOOTS = registerItem("pizza_boots", new ArmorItem(
            ModArmorMaterials.PIZZA_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PizzaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PizzaMod.LOGGER.info("Registering ModItems For " + PizzaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DOUGH);
            entries.add(TOMATO);
            entries.add(ModBlocks.PIZZA);
            entries.add(PIZZA_CUTTER);

            entries.add(PIZZA_HELMET);
            entries.add(PIZZA_CHESTPLATE);
            entries.add(PIZZA_LEGGINGS);
            entries.add(PIZZA_BOOTS);

        });
    }
}
