package net.mimo.mimosmod.item;


import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static final Tier VOIDSTONE_AMETHYST = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1683, 8f, 3f, 12,
                    ModTags.Blocks.NEEDS_VOIDSTONE_AMETHYST_TOOL, () -> Ingredient.of(ModItems.VOIDSTONE_AMETHYST.get())),
            new ResourceLocation(MimosMod.MOD_ID, "voidstone_amethyst"), List.of(Tiers.IRON), List.of());

    public static final Tier SOULSTEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1761, 8f, 3f, 12,
                    ModTags.Blocks.NEEDS_SOULSTEEL_TOOL, () -> Ingredient.of(ModItems.SOULSTEEL.get())),
            new ResourceLocation(MimosMod.MOD_ID, "soulsteel"), List.of(Tiers.IRON), List.of());

    public static final Tier CELESTIAL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1971, 8.5f, 3f, 21,
                    ModTags.Blocks.NEEDS_CELESTIAL_TOOL, () -> Ingredient.of(ModItems.CELESTIAL.get())),
            new ResourceLocation(MimosMod.MOD_ID, "celestial"), List.of(Tiers.IRON), List.of());

    public static final Tier MYSTELITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2318, 9f, 4f, 15,
                    ModTags.Blocks.NEEDS_MYSTELITE_TOOL, () -> Ingredient.of(ModItems.MYSTELITE.get())),
            new ResourceLocation(MimosMod.MOD_ID, "mystelite"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier ARCANE_CRYSTAL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2517, 9.5f, 4.5f, 17,
                    ModTags.Blocks.NEEDS_ARCANE_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.ARCANE_CRYSTAL.get())),
            new ResourceLocation(MimosMod.MOD_ID, "arcane_crystal"), List.of(Tiers.NETHERITE), List.of());

}
