package net.mustafahany2.pizzamod.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CakeBlock;

public class PizzaBlock extends CakeBlock {

    public PizzaBlock(AbstractBlock.Settings settings) {
        super(settings); // CakeBlock handles bites & eating automatically
    }

}
