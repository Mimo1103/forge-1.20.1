package net.mimo.mimosmod.datagen;


import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MimosMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AZURITE_BLOCK);
        blockWithItem(ModBlocks.RAW_AZURITE_BLOCK);
        blockWithItem(ModBlocks.SOUND_BLOCK);
        blockWithItem(ModBlocks.CROCOITE_BLOCK);
        blockWithItem(ModBlocks.AZURITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_AZURITE_ORE);
        blockWithItem(ModBlocks.GREENHEART_PLANKS);

        logBlock(((RotatedPillarBlock) ModBlocks.GREENHEART_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.GREENHEART_WOOD.get()), blockTexture(ModBlocks.GREENHEART_LOG.get()), blockTexture(ModBlocks.GREENHEART_LOG.get()));
        axisBlock((RotatedPillarBlock)ModBlocks.STRIPPED_GREENHEART_LOG.get(), new ResourceLocation(MimosMod.MOD_ID, "block/stripped_greenheart_log"),
                new ResourceLocation(MimosMod.MOD_ID, "block/stripped_greenheart_log_top"));
        axisBlock((RotatedPillarBlock)ModBlocks.STRIPPED_GREENHEART_WOOD.get(), new ResourceLocation(MimosMod.MOD_ID, "block/stripped_greenheart_log"),
                new ResourceLocation(MimosMod.MOD_ID, "block/stripped_greenheart_log"));
        blockItem(ModBlocks.GREENHEART_LOG);
        blockItem(ModBlocks.GREENHEART_WOOD);
        blockItem(ModBlocks.STRIPPED_GREENHEART_LOG);
        blockItem(ModBlocks.STRIPPED_GREENHEART_WOOD);


        stairsBlock((StairBlock) ModBlocks.GREENHEART_STAIRS.get(), blockTexture(ModBlocks.GREENHEART_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.GREENHEART_SLAB.get()), blockTexture(ModBlocks.GREENHEART_PLANKS.get()), blockTexture(ModBlocks.GREENHEART_PLANKS.get()));
        blockItem(ModBlocks.GREENHEART_SLAB);
        blockItem(ModBlocks.GREENHEART_STAIRS);

        buttonBlock((ButtonBlock) ModBlocks.GREENHEART_BUTTON.get(), blockTexture(ModBlocks.GREENHEART_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.GREENHEART_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GREENHEART_PLANKS.get()));
        blockItem(ModBlocks.GREENHEART_PRESSURE_PLATE);

        fenceBlock((FenceBlock) ModBlocks.GREENHEART_FENCE.get(), blockTexture(ModBlocks.GREENHEART_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.GREENHEART_FENCE_GATE.get(), blockTexture(ModBlocks.GREENHEART_PLANKS.get()));
        blockItem(ModBlocks.GREENHEART_FENCE_GATE);

        doorBlockWithRenderType((DoorBlock) ModBlocks.GREENHEART_DOOR.get(), modLoc("block/greenheart_door_bottom"), modLoc("block/greenheart_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.GREENHEART_TRAPDOOR.get(), modLoc("block/greenheart_trapdoor"), true, "cutout");
        leavesBlock(ModBlocks.GREENHEART_LEAVES);
        saplingBlock(ModBlocks.GREENHEART_SAPLING);
        blockItem(ModBlocks.GREENHEART_TRAPDOOR, "_bottom");

        simpleBlock(ModBlocks.CHERRY_DELPHINIUM.get(),
                models().cross(blockTexture(ModBlocks.CHERRY_DELPHINIUM.get()).getPath(), blockTexture(ModBlocks.CHERRY_DELPHINIUM.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeAll(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("mimosmod:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("mimosmod:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
