package net.mustafahany2.pizzamod.items;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;
import net.mustafahany2.pizzamod.PizzaMod;
import net.minecraft.util.Identifier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> PIZZA_ARMOR_MATERIAL = registerArmorMaterial("pizza",
            () -> new ArmorMaterial(Util.make(new EnumMap(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.DOUGH),
                    List.of(new ArmorMaterial.Layer(Identifier.of(PizzaMod.MOD_ID, "pizza"))), 0, 0));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(PizzaMod.MOD_ID, name), material.get());
    }
}
