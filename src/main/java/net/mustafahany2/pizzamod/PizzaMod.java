package net.mustafahany2.pizzamod;

import net.fabricmc.api.ModInitializer;
import net.mustafahany2.pizzamod.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.mustafahany2.pizzamod.items.ModItems;

public class PizzaMod implements ModInitializer {
    public static final String MOD_ID = "pizzamod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello from Pizza Mod!");
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
