package com.drag0n1zed.biologic.items;

import com.drag0n1zed.biologic.main.BioLogic;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BioLogic.MODID);

    public static final DeferredItem<Item> DNA = ITEMS.register("dna",() ->
            new Item(new Item.Properties().food(ModFoods.DNA)));

}
