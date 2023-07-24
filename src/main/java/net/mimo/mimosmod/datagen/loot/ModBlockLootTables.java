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
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
