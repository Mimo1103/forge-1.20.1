package net.mimo.mimosmod.util;

import net.mimo.mimosmod.MimosMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Items {
        private static TagKey<Item> tag(String name) {

            return ItemTags.create(new ResourceLocation(MimosMod.MOD_ID, name));


        }

        private static TagKey<Item> forgetag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {

        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        public static final TagKey<Block> NEEDS_VOIDSTONE_AMETHYST_TOOL = tag("needs_voidstone_amethyst_tool"); //start better diamonds
        public static final TagKey<Block> NEEDS_SOULSTEEL_TOOL = tag("needs_soulsteel_tool");
        public static final TagKey<Block> NEEDS_CELESTIAL_TOOL = tag("needs_celestial_tool");
        public static final TagKey<Block> NEEDS_MYSTELITE_TOOL = tag("needs_mystelite_tool"); //start better Netherite
        public static final TagKey<Block> NEEDS_ARCANE_CRYSTAL_TOOL = tag("needs_arcane_crystal_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MimosMod.MOD_ID, name));
        }

        private static TagKey<Block> forgetag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }

    }
