package net.mimo.mimosmod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class RecoverEffect extends MobEffect {
    public RecoverEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {

            if (pAmplifier == 3) {
                pLivingEntity.heal(0.65f);
            }
            pLivingEntity.heal(0.43f * pAmplifier);


            super.applyEffectTick(pLivingEntity, pAmplifier);
        }




    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
