package net.mimo.mimosmod.item.custom;


import net.mimo.mimosmod.item.ModItemProperties;
import net.mimo.mimosmod.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;


public class ScytheItem extends SwordItem {


    public ScytheItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {

        if (entity instanceof LivingEntity livingEntity) {


            new MobEffectInstance(MobEffects.HARM, 0, 0);

        }

            return super.onLeftClickEntity(stack, player, entity);

    }

}

