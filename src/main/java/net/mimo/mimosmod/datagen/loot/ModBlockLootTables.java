package net.mimo.mimosmod.datagen.loot;

import net.mimo.mimosmod.block.ModBlocks;
import net.mimo.mimosmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;


public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.AZURITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_AZURITE_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());
        this.dropSelf(ModBlocks.CROCOITE_BLOCK.get());

        this.add(ModBlocks.AZURITE_ORE.get(),
                block -> createOreDrop(ModBlocks.AZURITE_ORE.get(), ModItems.RAW_AZURITE.get()));
        this.add(ModBlocks.DEEPSLATE_AZURITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_AZURITE_ORE.get(), ModItems.RAW_AZURITE.get()));

        this.dropSelf(ModBlocks.GREENHEART_LOG.get());
        this.dropSelf(ModBlocks.GREENHEART_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_GREENHEART_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_GREENHEART_WOOD.get());
        this.dropSelf(ModBlocks.GREENHEART_PLANKS.get());
        this.dropSelf(ModBlocks.GREENHEART_SAPLING.get());
        this.add(ModBlocks.GREENHEART_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.GREENHEART_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.GREENHEART_STAIRS.get());
        this.add(ModBlocks.GREENHEART_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GREENHEART_SLAB.get()));
        this.dropSelf(ModBlocks.GREENHEART_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GREENHEART_BUTTON.get());
        this.dropSelf(ModBlocks.GREENHEART_FENCE.get());
        this.dropSelf(ModBlocks.GREENHEART_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREENHEART_TRAPDOOR.get());

        this.add(ModBlocks.GREENHEART_DOOR.get(),
                block -> createDoorTable(ModBlocks.GREENHEART_DOOR.get()));

        this.dropSelf(ModBlocks.CHERRY_DAHLIA.get());
        this.add(ModBlocks.POTTED_CHERRY_DAHLIA.get(),
                createPotFlowerItemTable(ModBlocks.POTTED_CHERRY_DAHLIA.get()));

        this.dropSelf(ModBlocks.COPPER_LAMP.get());

        this.add(ModBlocks.STARDUST_ORE.get(),
                block -> createOreDrop(ModBlocks.STARDUST_ORE.get(), ModItems.STARDUST.get()));
        this.add(ModBlocks.DEEPSLATE_STARDUST_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_STARDUST_ORE.get(), ModItems.STARDUST.get()));
        this.add(ModBlocks.LUMITE_ORE.get(),
                block -> createOreDrop(ModBlocks.LUMITE_ORE.get(), ModItems.LUMITE_SHARD.get()));
        this.add(ModBlocks.CELESTIAL_ORE.get(),
                block -> createOreDrop(ModBlocks.CELESTIAL_ORE.get(), ModItems.CELESTIAL_SHARD.get()));
        this.add(ModBlocks.PIANITE_ORE.get(),
                block -> createOreDrop(ModBlocks.PIANITE_ORE.get(), ModItems.PIANITE.get()));
        this.add(ModBlocks.CROCOITE_ORE.get(),
                block -> createOreDrop(ModBlocks.CROCOITE_ORE.get(), ModItems.CROCOITE.get()));
        this.add(ModBlocks.NECROSTONE_ORE.get(),
                block -> createOreDrop(ModBlocks.NECROSTONE_ORE.get(), ModItems.NECROSTONE_TWINE.get()));
        this.add(ModBlocks.SOULSTEEL_ORE.get(),
                block -> createOreDrop(ModBlocks.SOULSTEEL_ORE.get(), ModItems.SOULSTEEL.get()));
        this.add(ModBlocks.INFERNIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.INFERNIUM_ORE.get(), ModItems.INFERNIUM.get()));
        this.add(ModBlocks.INFERNITE_ORE.get(),
                block -> createOreDrop(ModBlocks.INFERNITE_ORE.get(), ModItems.INFERNITE.get()));
        this.add(ModBlocks.EMBERCORE_ORE.get(),
                block -> createOreDrop(ModBlocks.EMBERCORE_ORE.get(), ModItems.EMBERCORE.get()));
        this.add(ModBlocks.ARCANE_CRYSTAL_ORE.get(),
                block -> createOreDrop(ModBlocks.ARCANE_CRYSTAL_ORE.get(), ModItems.ARCANE_CRYSTAL.get()));
        this.add(ModBlocks.MYSTELITE_ORE.get(),
                block -> createOreDrop(ModBlocks.MYSTELITE_ORE.get(), ModItems.MYSTELITE.get()));
        this.add(ModBlocks.VOIDSTONE_AMETHYST_ORE.get(),
                block -> createOreDrop(ModBlocks.VOIDSTONE_AMETHYST_ORE.get(), ModItems.VOIDSTONE_AMETHYST.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
