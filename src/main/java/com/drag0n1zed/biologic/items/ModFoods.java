package com.drag0n1zed.biologic.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties DNA = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.3f).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.CONFUSION,500,1),1).build();
}
