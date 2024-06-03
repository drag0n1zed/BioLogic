package com.drag0n1zed.biologic.ui;

import com.drag0n1zed.biologic.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.drag0n1zed.biologic.main.BioLogic.MODID;


public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    //CREATIVE_MODE_TABS is a DeferredRegister<CreativeModeTab>
    public static final Supplier<CreativeModeTab> BIOLOGIC = CREATIVE_TABS.register("biologic", () -> CreativeModeTab.builder()
            //Set the title of the tab. Don't forget to add a translation!
            .title(Component.translatable("itemGroup." + MODID + ".biologic"))
            //Set the icon of the tab.
            .icon(() -> ModItems.DNA.get().getDefaultInstance())
            //Add your items to the tab.
            .displayItems((params, output) -> {
                output.accept(ModItems.DNA.get());
                output.accept(ModItems.BIOTECH_CORE.get());
            })
            .build()
    );
}

