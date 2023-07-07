package net.mimo.mimosmod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class InfectionEffect extends MobEffect {
    public InfectionEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {

            if (pLivingEntity.getHealth() > 1.0F) {
                pLivingEntity.hurt(pLivingEntity.damageSources().magic(), 0.5F);


                super.applyEffectTick(pLivingEntity, pAmplifier);
            }

    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
