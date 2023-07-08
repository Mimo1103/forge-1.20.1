package net.mimo.mimosmod.datagen;

import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.block.ModBlocks;
import net.mimo.mimosmod.item.ModItems;
import net.mimo.mimosmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, MimosMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.GREENHEART_LOG.get().asItem())
                .add(ModBlocks.GREENHEART_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_GREENHEART_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_GREENHEART_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.GREENHEART_PLANKS.get().asItem());

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.ENCOUNTER_MUSIC_DISC.get());

    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
