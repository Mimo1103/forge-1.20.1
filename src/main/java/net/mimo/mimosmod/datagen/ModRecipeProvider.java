package net.mimo.mimosmod.datagen;

import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.block.ModBlocks;
import net.mimo.mimosmod.item.ModItems;
import net.mimo.mimosmod.util.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> AZURITE_SMELTABLES = List.of(ModItems.RAW_AZURITE.get(), ModBlocks.AZURITE_ORE.get(),
            ModBlocks.DEEPSLATE_AZURITE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AZURITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AZURITE.get())
                .unlockedBy("has_azurite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.AZURITE.get()).build()))
                .save(pWriter);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AZURITE.get(), 9) //from crafting x into y, you get 9y
                .requires(ModBlocks.AZURITE_BLOCK.get()) //set the x
                .unlockedBy("has_azurite_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.AZURITE_BLOCK.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_AZURITE.get(),
                RecipeCategory.MISC, ModBlocks.RAW_AZURITE_BLOCK.get(),
                "mimosmod:raw_azurite", "azurite", "mimosmod:raw_azurite_block", "azurite");

        oreSmelting(pWriter, AZURITE_SMELTABLES, RecipeCategory.MISC, ModItems.AZURITE.get(),
                0.25f, 200, "azurite");

        oreBlasting(pWriter, AZURITE_SMELTABLES, RecipeCategory.MISC, ModItems.AZURITE.get(),
                0.25f, 100, "azurite");


    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory,
                pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, MimosMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

    protected static void pressurePlate(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pPressurePlate, ItemLike pMaterial) {
        pressurePlateBuilder(RecipeCategory.REDSTONE, pPressurePlate, Ingredient.of(pMaterial)).unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer, MimosMod.MOD_ID);
    }

    protected static RecipeBuilder pressurePlateBuilder(RecipeCategory pCategory, ItemLike pPressurePlate, Ingredient pMaterial) {
        return ShapedRecipeBuilder.shaped(pCategory, pPressurePlate).define('#', pMaterial).pattern("##");
    }

    protected static void slab(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pPressurePlate, ItemLike pMaterial) {
        slabBuilder(pCategory, pPressurePlate, Ingredient.of(pMaterial)).unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer, MimosMod.MOD_ID);
    }

    protected static RecipeBuilder slabBuilder(RecipeCategory pCategory, ItemLike pSlab, Ingredient pMaterial) {
        return ShapedRecipeBuilder.shaped(pCategory, pSlab, 6).define('#', pMaterial).pattern("###");
    }

    protected static RecipeBuilder stairBuilder(ItemLike pStairs, Ingredient pMaterial) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pStairs, 4).define('#', pMaterial).pattern("#  ").pattern("## ").pattern("###");
    }

    protected static RecipeBuilder trapdoorBuilder(ItemLike pTrapdoor, Ingredient pMaterial) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pTrapdoor, 2).define('#', pMaterial).pattern("###").pattern("###");
    }
}
