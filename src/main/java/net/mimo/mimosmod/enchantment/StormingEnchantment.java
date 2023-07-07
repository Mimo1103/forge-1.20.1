package net.mimo.mimosmod.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.ArrowInfiniteEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;


public class StormingEnchantment extends Enchantment {
    protected StormingEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if(!pAttacker.level().isClientSide) {
            ServerLevel level = ((ServerLevel) pAttacker.level());
            ServerLevel enemyDirection = ((ServerLevel) pTarget.level());
            BlockPos position = pAttacker.blockPosition();
            BlockPos targetPos = pTarget.blockPosition();

            if(!pTarget.hurtMarked && pTarget.canBeHitByProjectile())

            if (pLevel == 1) {

                }
            if (pLevel == 2) {

            }
            if (pLevel == 3) {

            }
            if (pLevel == 4) {

            }


        }
        super.doPostAttack(pAttacker, pTarget, pLevel);
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }

    public boolean checkCompatibility(Enchantment pEnch) {
        return pEnch instanceof ArrowInfiniteEnchantment ? false : super.checkCompatibility(pEnch);
    }
}
