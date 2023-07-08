package net.mimo.mimosmod.enchantment;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.FireAspectEnchantment;

import java.util.Random;


public class LightningStrikerEnchantment extends Enchantment {
    protected LightningStrikerEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if(!pAttacker.level().isClientSide) {
            ServerLevel level = ((ServerLevel) pAttacker.level());
            BlockPos position = pTarget.blockPosition();
            Random rand = new Random();
            int min = 1;
            int max = 10;

            int value = (int) (Math.random() * (max -min)) + min;


            if(value > 7) {
                if (pLevel == 1) {
                    EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, (Player) null, position, MobSpawnType.TRIGGERED, true, true);
                }
                if (pLevel == 2) {
                    EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, (Player) null, position, MobSpawnType.TRIGGERED, true, true);
                    EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, (Player) null, position, MobSpawnType.TRIGGERED, true, true);
                }
            }

        }
        super.doPostAttack(pAttacker, pTarget, pLevel);
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    public boolean checkCompatibility(Enchantment pEnch) {
        return pEnch instanceof FireAspectEnchantment ? false : super.checkCompatibility(pEnch);
    }
}
