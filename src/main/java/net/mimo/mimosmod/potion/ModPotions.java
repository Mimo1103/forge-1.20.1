package net.mimo.mimosmod.potion;

import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, MimosMod.MOD_ID);

    public static final RegistryObject<Potion> INFECTION_POTION = POTIONS.register("infection_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.INFECTION_EVENT.get(), 1800, 0)));
    public static final RegistryObject<Potion> RECOVER_POTION = POTIONS.register("recover_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.RECOVER_EVENT.get(), 1000, 0)));
    public static final RegistryObject<Potion> VULNERABLE_POTION = POTIONS.register("vulnerable_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.VULNERABILITY_EVENT.get(), 1600, 0)));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
