package net.mimo.mimosmod.item;

import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.block.ModBlocks;
import net.mimo.mimosmod.effect.ModEffects;
import net.mimo.mimosmod.enchantment.ModEnchantments;
import net.mimo.mimosmod.potion.ModPotions;
import net.mimo.mimosmod.sound.ModSounds;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MimosMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MIMOS_BUILDING_BLOCKS = CREATIVE_MODE_TABS.register("mimos_building_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AZURITE.get()))
                    .title(Component.translatable("creativetab.mimos_building_blocks"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.AZURITE.get());
                        output.accept(ModItems.RAW_AZURITE.get());
                        output.accept(ModBlocks.AZURITE_BLOCK.get());
                        output.accept(ModBlocks.CROCOITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_AZURITE_BLOCK.get());
                        output.accept(ModBlocks.AZURITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_AZURITE_ORE.get());
                        output.accept(ModBlocks.GREENHEART_STAIRS.get());
                        output.accept(ModBlocks.GREENHEART_SLAB.get());
                        output.accept(ModBlocks.GREENHEART_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.GREENHEART_BUTTON.get());
                        output.accept(ModBlocks.GREENHEART_FENCE.get());
                        output.accept(ModBlocks.GREENHEART_FENCE_GATE.get());
                        output.accept(ModBlocks.GREENHEART_DOOR.get());
                        output.accept(ModBlocks.GREENHEART_TRAPDOOR.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MIMOS_NATURAL_BLOCKS = CREATIVE_MODE_TABS.register("mimos_natural_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AZURITE.get()))
                    .title(Component.translatable("creativetab.mimos_natural_blocks"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.AZURITE.get());
                        output.accept(ModItems.RAW_AZURITE.get());
                        output.accept(ModBlocks.GREENHEART_LOG.get());
                        output.accept(ModBlocks.GREENHEART_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_GREENHEART_LOG.get());
                        output.accept(ModBlocks.STRIPPED_GREENHEART_WOOD.get());
                        output.accept(ModBlocks.GREENHEART_PLANKS.get());
                        output.accept(ModBlocks.GREENHEART_SAPLING.get());
                        output.accept(ModBlocks.GREENHEART_LEAVES.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MIMOS_FUNCTIONAL_BLOCKS = CREATIVE_MODE_TABS.register("mimos_functional_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SOUND_BLOCK.get()))
                    .title(Component.translatable("creativetab.mimos_functional_blocks"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.METAL_DETECTOR.get());
                        output.accept(ModBlocks.SOUND_BLOCK.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MIMOS_REDSTONE_BLOCKS = CREATIVE_MODE_TABS.register("mimos_redstone_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GREENHEART_PRESSURE_PLATE.get()))
                    .title(Component.translatable("creativetab.mimos_redstone_blocks"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModBlocks.GREENHEART_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.GREENHEART_BUTTON.get());
                        output.accept(ModBlocks.GREENHEART_FENCE_GATE.get());
                        output.accept(ModBlocks.GREENHEART_DOOR.get());
                        output.accept(ModBlocks.GREENHEART_TRAPDOOR.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MIMOS_TOOLS_AND_UTILITIES = CREATIVE_MODE_TABS.register("mimos_tools_and_utilities",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AZURITE.get()))
                    .title(Component.translatable("creativetab.mimos_tools_and_utilities"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.SOULSTEEL_HOE.get());
                        output.accept(ModItems.SOULSTEEL_PICKAXE.get());
                        output.accept(ModItems.SOULSTEEL_AXE.get());
                        output.accept(ModItems.SOULSTEEL_SHOVEL.get());
                        output.accept(ModItems.ENCOUNTER_MUSIC_DISC.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MIMOS_COMBAT = CREATIVE_MODE_TABS.register("mimos_combat",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_SCYTHE.get()))
                    .title(Component.translatable("creativetab.mimos_combat"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.SOULSTEEL_SWORD.get());
                        output.accept(ModItems.SOULSTEEL_AXE.get());
                        output.accept(ModItems.DIAMOND_SCYTHE.get());
                        output.accept(ModItems.MYSTELITE_SCYTHE.get());
                        output.accept(ModItems.DAEDALUS_BOW.get());
                        output.accept(ModItems.MYSTELITE_HELMET.get());
                        output.accept(ModItems.MYSTELITE_CHESTPLATE.get());
                        output.accept(ModItems.MYSTELITE_LEGGINGS.get());
                        output.accept(ModItems.MYSTELITE_BOOTS.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> MIMOS_FOOD_AND_DRINKS = CREATIVE_MODE_TABS.register("mimos_food_and_drinks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CUCUMBER.get()))
                    .title(Component.translatable("creativetab.mimos_food_and_drinks"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.CUCUMBER.get());
                        output.accept(ModItems.RADIOACTIVE_STEW.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MIMOS_INGREDIENTS = CREATIVE_MODE_TABS.register("mimos_ingredients",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AZURITE.get()))
                    .title(Component.translatable("creativetab.mimos_ingredients"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.AZURITE.get());
                        output.accept(ModItems.RAW_AZURITE.get());
                        output.accept(ModItems.LUMITE_SHARD.get());
                        output.accept(ModItems.LUMITE_INGOT.get());
                        output.accept(ModItems.STARDUST.get());
                        output.accept(ModItems.CELESTIAL_SHARD.get());
                        output.accept(ModItems.CELESTIAL.get());
                        output.accept(ModItems.PIANITE.get());
                        output.accept(ModItems.CROCOITE.get());
                        output.accept(ModItems.SOULSTEEL.get());
                        output.accept(ModItems.SOULSTEEL_INGOT.get());
                        output.accept(ModItems.INFERNITE.get());
                        output.accept(ModItems.INFERNIUM.get());
                        output.accept(ModItems.EMBERCORE.get());
                        output.accept(ModItems.VOIDSTONE_AMETHYST.get());
                        output.accept(ModItems.MYSTELITE.get());
                        output.accept(ModItems.ARCANE_CRYSTAL.get());
                        output.accept(ModItems.NECROSTONE_TWINE.get());
                        output.accept(ModItems.CALSIFER.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MIMOS_MOBS = CREATIVE_MODE_TABS.register("mimos_mobs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AZURITE.get()))
                    .title(Component.translatable("creativetab.mimos_mobs"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.AZURITE.get());
                        output.accept(ModItems.RAW_AZURITE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
