package net.mimo.mimosmod.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.ArrowInfiniteEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.level.NoteBlockEvent;

import java.util.Random;


public class DoubleShotEnchantment extends Enchantment {
    protected DoubleShotEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level().isClientSide) {
            ServerLevel level = ((ServerLevel) pAttacker.level());
            ServerLevel enemyDirection = ((ServerLevel) pTarget.level());
            BlockPos position = pAttacker.blockPosition();
            BlockPos targetPos = pTarget.blockPosition();
            Random rand = new Random();
            int min = 1;
            int max = 10;

            int value = (int) (Math.random() * (max - min)) + min;


            if (value > 6) {
                if (pLevel == 1) {
                    pTarget.setInvulnerable(false);
                    EntityType.ARROW.spawn(level, (ItemStack) null, (Player) null, position, MobSpawnType.DISPENSER, false, false).moveTo(targetPos.getX(), targetPos.getY() + 5f, targetPos.getZ());
                    EntityType.ARROW.spawn(level, (ItemStack) null, (Player) null, position, MobSpawnType.DISPENSER, false, false).moveTo(targetPos.getX() + 0.35f, targetPos.getY() + 4.2f, targetPos.getZ() + 0.35f);
                    EntityType.ARROW.spawn(level, (ItemStack) null, (Player) null, position, MobSpawnType.DISPENSER, false, false).moveTo(targetPos.getX() + 0.35f, targetPos.getY() + 4.5f, targetPos.getZ() - 0.35f);
                    EntityType.ARROW.spawn(level, (ItemStack) null, (Player) null, position, MobSpawnType.DISPENSER, false, false).moveTo(targetPos.getX() - 0.35f, targetPos.getY() + 4.3f, targetPos.getZ() - 0.35f);
                    EntityType.ARROW.spawn(level, (ItemStack) null, (Player) null, position, MobSpawnType.DISPENSER, false, false).moveTo(targetPos.getX() - 0.35f, targetPos.getY() + 4.8f, targetPos.getZ() + 0.35f);

                    pTarget.setInvulnerable(false);
                }

            }
            super.doPostAttack(pAttacker, pTarget, pLevel);
        }
    }

        @Override
        public int getMaxLevel () {
            return 1;
        }

        public boolean checkCompatibility (Enchantment pEnch){
            return pEnch instanceof ArrowInfiniteEnchantment ? false : super.checkCompatibility(pEnch);
        }
    }
