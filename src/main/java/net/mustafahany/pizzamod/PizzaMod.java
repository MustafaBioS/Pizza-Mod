package net.mustafahany.pizzamod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.mustafahany.pizzamod.items.ModItems;

public class PizzaMod implements ModInitializer {
    public static final String MOD_ID = "pizza-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello from Pizza Mod!");
        ModItems.registerModItems();
    }
}
