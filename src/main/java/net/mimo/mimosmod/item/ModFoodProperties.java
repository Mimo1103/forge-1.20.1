package net.mimo.mimosmod.item;


import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CUCUMBER = new FoodProperties.Builder().nutrition(4)
            .saturationMod(2f).build();
    public static final FoodProperties RADIOACTIVE_STEW = new FoodProperties.Builder().nutrition(7).saturationMod(1.25f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 360, 4), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1600), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 1600), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600), 1f)
            .build();
}
