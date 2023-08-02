package net.mimo.mimosmod.datagen;

import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.block.ModBlocks;
import net.mimo.mimosmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MimosMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AZURITE);
        simpleItem(ModItems.RAW_AZURITE);
        simpleItem(ModItems.CUCUMBER);
        simpleItem(ModItems.CUCUMBER_SEEDS);
        simpleItem(ModItems.RADIOACTIVE_STEW);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.CALSIFER);
        simpleItem(ModItems.LUMITE_INGOT);
        simpleItem(ModItems.LUMITE_SHARD);
        simpleItem(ModItems.ARCANE_CRYSTAL);
        simpleItem(ModItems.CELESTIAL);
        simpleItem(ModItems.CELESTIAL_SHARD);
        simpleItem(ModItems.MYSTELITE);
        simpleItem(ModItems.EMBERCORE);
        simpleItem(ModItems.VOIDSTONE_AMETHYST);
        simpleItem(ModItems.INFERNITE);
        simpleItem(ModItems.INFERNIUM);
        simpleItem(ModItems.CROCOITE);
        simpleItem(ModItems.PIANITE);
        simpleItem(ModItems.STARDUST);
        simpleItem(ModItems.NECROSTONE_TWINE);
        simpleItem(ModItems.SOULSTEEL);
        simpleItem(ModItems.SOULSTEEL_INGOT);
        simpleItem(ModItems.ENCOUNTER_MUSIC_DISC);
        simpleItem(ModItems.RED_PARROT_FEATHER);
        simpleItem(ModItems.BLUE_PARROT_FEATHER);
        simpleItem(ModItems.GREEN_PARROT_FEATHER);
        simpleItem(ModItems.GRAY_PARROT_FEATHER);
        simpleItem(ModItems.CYAN_PARROT_FEATHER);


        handheldItem(ModItems.SOULSTEEL_AXE);
        handheldItem(ModItems.SOULSTEEL_SWORD);
        handheldItem(ModItems.SOULSTEEL_PICKAXE);
        handheldItem(ModItems.SOULSTEEL_SHOVEL);
        handheldItem(ModItems.SOULSTEEL_HOE);
        handheldItem(ModItems.DIAMOND_SCYTHE);
        handheldItem(ModItems.MYSTELITE_SCYTHE);

        buttonItem(ModBlocks.GREENHEART_BUTTON, ModBlocks.GREENHEART_PLANKS);
        fenceItem(ModBlocks.GREENHEART_FENCE, ModBlocks.GREENHEART_PLANKS);

        simpleBlockItem(ModBlocks.GREENHEART_DOOR);
        simpleBlockItem(ModBlocks.CHERRY_DAHLIA);
        handheldItem(ModItems.ICE_BOLT_RUNESTONE);


        saplingItem(ModBlocks.GREENHEART_SAPLING);

        withExistingParent(ModItems.SAPPHIRE_BEETLE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MimosMod.MOD_ID, "block/" + item.getId().getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(MimosMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(MimosMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MimosMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MimosMod.MOD_ID,"item/" + item.getId().getPath()));
    }

        private ItemModelBuilder simpleItem (RegistryObject < Item > item) {
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(MimosMod.MOD_ID, "item/" + item.getId().getPath()));
        }

}
