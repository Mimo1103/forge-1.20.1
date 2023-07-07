package net.mimo.mimosmod.enchantment;

import net.mimo.mimosmod.effect.ModEffects;
import net.mimo.mimosmod.effect.RecoverEffect;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.util.Random;


public class LifeGainEnchantment extends Enchantment {
    protected LifeGainEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if(!pAttacker.level().isClientSide) {
            ServerLevel level = ((ServerLevel) pAttacker.level());
            BlockPos position = pTarget.blockPosition();
            if (pTarget instanceof LivingEntity livingEntity) {
                Random random = new Random();
            }
                int min = 1;
                int max = 10;

                int value = (int) (Math.random() * (max -min)) + min;

                if(value > 2) {

                        if (pLevel == 1) {
                            pAttacker.addEffect(new MobEffectInstance(ModEffects.RECOVER_EVENT.get(), 1, 1), pAttacker);
                        }
                        if (pLevel == 2) {
                            pAttacker.addEffect(new MobEffectInstance(ModEffects.RECOVER_EVENT.get(), 1, 2), pAttacker);
                        }
                        if (pLevel == 3) {
                            pAttacker.addEffect(new MobEffectInstance(ModEffects.RECOVER_EVENT.get(), 1, 3), pAttacker);
                        }
            }



        }
        super.doPostAttack(pAttacker, pTarget, pLevel);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
