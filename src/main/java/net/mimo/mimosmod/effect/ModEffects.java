package net.mimo.mimosmod.effect;

import net.mimo.mimosmod.MimosMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Slime;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MimosMod.MOD_ID);

    public static final RegistryObject<MobEffect> INFECTION_EVENT = MOB_EFFECTS.register("infection",
            () -> new InfectionEffect(MobEffectCategory.HARMFUL, 0x9ab502).addAttributeModifier(Attributes.LUCK,
                    "7107DE5E-7CE8-4030-940E-514C1F160890", 0.0f, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static final RegistryObject<MobEffect> VULNERABILITY_EVENT = MOB_EFFECTS.register("vulnerability",
            () -> new VulnerableEffect(MobEffectCategory.HARMFUL, 0x4f0080).addAttributeModifier(Attributes.ARMOR,
                    "7107DE5E-7CE8-4030-940E-514C1F160890", -0.20f, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static final RegistryObject<MobEffect> RECOVER_EVENT = MOB_EFFECTS.register("recover",
            () -> new RecoverEffect(MobEffectCategory.BENEFICIAL, 0xe20147).addAttributeModifier(Attributes.LUCK,
                    "7107DE5E-7CE8-4030-940E-514C1F160890", 0.0f, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
