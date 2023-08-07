package net.mimo.mimosmod.datagen;

import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.block.ModBlocks;
import net.mimo.mimosmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MimosMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.AZURITE_ORE.get())
                .add(Blocks.REDSTONE_ORE)
                .add(Blocks.DEEPSLATE_REDSTONE_ORE)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)
                .add(Blocks.LAPIS_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE);



        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AZURITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_AZURITE_ORE.get())
                .add(ModBlocks.CROCOITE_ORE.get())
                .add(ModBlocks.STARDUST_ORE.get())
                .add(ModBlocks.DEEPSLATE_STARDUST_ORE.get())
                .add(ModBlocks.LUMITE_ORE.get())
                .add(ModBlocks.CELESTIAL_ORE.get())
                .add(ModBlocks.PIANITE_ORE.get())
                .add(ModBlocks.NECROSTONE_ORE.get())
                .add(ModBlocks.SOULSTEEL_ORE.get())
                .add(ModBlocks.INFERNIUM_ORE.get())
                .add(ModBlocks.INFERNITE_ORE.get())
                .add(ModBlocks.EMBERCORE_ORE.get())
                .add(ModBlocks.VOIDSTONE_AMETHYST_ORE.get())
                .add(ModBlocks.ARCANE_CRYSTAL_ORE.get())
                .add(ModBlocks.MYSTELITE_ORE.get())
                .add(ModBlocks.AZURITE_BLOCK.get())
                .add(ModBlocks.RAW_AZURITE_BLOCK.get())
                .add(ModBlocks.CROCOITE_BLOCK.get())
                .add(ModBlocks.SOUND_BLOCK.get());

        //this.tag(BlockTags.MINEABLE_WITH_AXE)

        //this.tag(BlockTags.MINEABLE_WITH_SHOVEL)

        //this.tag(BlockTags.MINEABLE_WITH_HOE)

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.AZURITE_ORE.get())
                .add(ModBlocks.AZURITE_BLOCK.get())
                .add(ModBlocks.RAW_AZURITE_BLOCK.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DEEPSLATE_AZURITE_ORE.get())
                .add(ModBlocks.CROCOITE_ORE.get())
                .add(ModBlocks.CROCOITE_BLOCK.get())
                .add(ModBlocks.SOUND_BLOCK.get())
                .add(ModBlocks.NECROSTONE_ORE.get())
                .add(ModBlocks.SOULSTEEL_ORE.get())
                .add(ModBlocks.INFERNIUM_ORE.get())
                .add(ModBlocks.INFERNITE_ORE.get())
                .add(ModBlocks.LUMITE_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.EMBERCORE_ORE.get())
                .add(ModBlocks.VOIDSTONE_AMETHYST_ORE.get())
                .add(ModBlocks.CELESTIAL_ORE.get());


        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.GREENHEART_LOG.get())
                .add(ModBlocks.GREENHEART_WOOD.get())
                .add(ModBlocks.STRIPPED_GREENHEART_LOG.get())
                .add(ModBlocks.STRIPPED_GREENHEART_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.GREENHEART_PLANKS.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.GREENHEART_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.GREENHEART_FENCE_GATE.get());

        //this.tag(ModTags.Blocks.NEEDS_MYSTELITE_TOOL)

    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
