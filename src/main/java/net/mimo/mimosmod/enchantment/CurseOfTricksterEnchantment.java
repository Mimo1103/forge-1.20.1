package net.mimo.mimosmod.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.ArrowInfiniteEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;


public class CurseOfTricksterEnchantment extends Enchantment {
    protected CurseOfTricksterEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if(!pAttacker.level().isClientSide) {
            ServerLevel level = ((ServerLevel) pAttacker.level());
            ServerLevel enemyDirection = ((ServerLevel) pTarget.level());
            BlockPos position = pAttacker.blockPosition();
            BlockPos targetPos = pTarget.blockPosition();

            if (pTarget.isCrouching()) {
                pTarget.setCustomName(pAttacker.getCustomName());


                if (pLevel == 1) {
                    pTarget.setCustomName(pAttacker.getCustomName());

                }
            }



        }
        super.doPostAttack(pAttacker, pTarget, pLevel);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    public boolean checkCompatibility(Enchantment pEnch) {
        return pEnch instanceof ArrowInfiniteEnchantment ? false : super.checkCompatibility(pEnch);
    }

    @Override
    public boolean isCurse() {
        return true;
    }
}
