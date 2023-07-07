package net.mimo.mimosmod.enchantment;

import net.mimo.mimosmod.MimosMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.enchantment.EnchantmentCategory.DIGGER;

public class ModEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MimosMod.MOD_ID);

    public static final RegistryObject<Enchantment> LIGHTNING_STRIKER =
            ENCHANTMENTS.register("lightning_striker",
                    () -> new LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON,
                            EquipmentSlot.MAINHAND));

    public static final RegistryObject<Enchantment> DOUBLE_SHOT =
            ENCHANTMENTS.register("double_shot",
                    () -> new DoubleShotEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.BOW,
                            EquipmentSlot.MAINHAND));

    public static final RegistryObject<Enchantment> LIFE_STEAL =
            ENCHANTMENTS.register("life_steal",
                    () -> new LifeGainEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON,
                            EquipmentSlot.MAINHAND));

    public static final RegistryObject<Enchantment> CURSE_OF_TRICKSTER =
            ENCHANTMENTS.register("curse_of_trickster",
                    () -> new CurseOfTricksterEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON,
                            EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
