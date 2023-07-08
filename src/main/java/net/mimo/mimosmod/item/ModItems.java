package net.mimo.mimosmod.item;

import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.block.custom.FuelItem;
import net.mimo.mimosmod.item.custom.MetalDetectorItem;
import net.mimo.mimosmod.item.custom.ScytheItem;
import net.mimo.mimosmod.sound.ModSounds;
import net.minecraft.Util;
import net.minecraft.commands.CommandFunction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MimosMod.MOD_ID);

    public static final RegistryObject<Item> AZURITE = ITEMS.register("azurite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_AZURITE = ITEMS.register("raw_azurite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MYSTELITE = ITEMS.register("mystelite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARCANE_CRYSTAL = ITEMS.register("arcane_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOULSTEEL = ITEMS.register("soulsteel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL = ITEMS.register("celestial",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_SHARD = ITEMS.register("celestial_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CROCOITE = ITEMS.register("crocoite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STARDUST = ITEMS.register("stardust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMBERCORE = ITEMS.register("embercore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFERNITE = ITEMS.register("infernite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFERNIUM = ITEMS.register("infernium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMITE_INGOT = ITEMS.register("lumite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIANITE = ITEMS.register("pianite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMITE_SHARD = ITEMS.register("lumite_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOULSTEEL_INGOT = ITEMS.register("soulsteel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NECROSTONE_TWINE = ITEMS.register("necrostone_twine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTONE_AMETHYST = ITEMS.register("voidstone_amethyst",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SOULSTEEL_SWORD = ITEMS.register("soulsteel_sword",
            () -> new SwordItem(ModToolTiers.SOULSTEEL, 3 , -2.4f, new Item.Properties().durability(1761)));
    public static final RegistryObject<Item> SOULSTEEL_PICKAXE = ITEMS.register("soulsteel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SOULSTEEL, 2 , -2.8f, new Item.Properties().durability(1761)));
    public static final RegistryObject<Item> SOULSTEEL_SHOVEL = ITEMS.register("soulsteel_shovel",
            () -> new ShovelItem(ModToolTiers.SOULSTEEL, 2 , -3, new Item.Properties().durability(1761)));
    public static final RegistryObject<Item> SOULSTEEL_AXE = ITEMS.register("soulsteel_axe",
            () -> new AxeItem(ModToolTiers.SOULSTEEL, 5 , -3, new Item.Properties().durability(1761)));
    public static final RegistryObject<Item> SOULSTEEL_HOE = ITEMS.register("soulsteel_hoe",
            () -> new HoeItem(ModToolTiers.SOULSTEEL, 2 , 0.0f, new Item.Properties().durability(1761)));

    public static final RegistryObject<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe",
            () -> new ScytheItem(Tiers.DIAMOND, 4 , -2.6f, new Item.Properties().durability(1561)));


    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(512)));
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CUCUMBER)));
    public static final RegistryObject<Item> RADIOACTIVE_STEW = ITEMS.register("radioactive_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADIOACTIVE_STEW)));

    public static final RegistryObject<Item> CALSIFER = ITEMS.register("calsifer",
            () -> new FuelItem(new Item.Properties(), 2000)); //10 Items

    public static final RegistryObject<Item> DAEDALUS_BOW = ITEMS.register("daedalus_bow",
            () -> new BowItem(new Item.Properties().durability(836)));


    public static final RegistryObject<Item> MYSTELITE_HELMET = ITEMS.register("mystelite_helmet",
            () -> new ArmorItem(ModArmorMaterials.MYSTELITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MYSTELITE_CHESTPLATE = ITEMS.register("mystelite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MYSTELITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MYSTELITE_LEGGINGS = ITEMS.register("mystelite_leggings",
            () -> new ArmorItem(ModArmorMaterials.MYSTELITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MYSTELITE_BOOTS = ITEMS.register("mystelite_boots",
            () -> new ArmorItem(ModArmorMaterials.MYSTELITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ENCOUNTER_MUSIC_DISC = ITEMS.register("encounter_music_disc",
            () -> new RecordItem(4, ModSounds.ENCOUNTER, new Item.Properties().stacksTo(1), 1520)); //seconds * 20 = lengthInTicks
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}