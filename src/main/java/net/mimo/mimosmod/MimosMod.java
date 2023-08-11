package net.mimo.mimosmod;

import com.mojang.logging.LogUtils;
import net.mimo.mimosmod.block.ModBlocks;
import net.mimo.mimosmod.effect.ModEffects;
import net.mimo.mimosmod.enchantment.ModEnchantments;
import net.mimo.mimosmod.entity.ModEntities;
import net.mimo.mimosmod.entity.client.IceBoltProjectileRenderer;
import net.mimo.mimosmod.entity.client.SapphireBeetleRenderer;
import net.mimo.mimosmod.item.ModCreativeModeTabs;
import net.mimo.mimosmod.item.ModItemProperties;
import net.mimo.mimosmod.item.ModItems;
import net.mimo.mimosmod.loot.ModLootModifiers;
import net.mimo.mimosmod.painting.ModPaintings;
import net.mimo.mimosmod.potion.BetterBrewingRecipe;
import net.mimo.mimosmod.potion.ModPotions;
import net.mimo.mimosmod.sound.ModSounds;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.util.LoaderExceptionModCrash;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MimosMod.MOD_ID)
public class MimosMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "mimosmod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    public MimosMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEnchantments.register(modEventBus);

        ModSounds.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        ModEffects.register(modEventBus);

        ModPotions.register(modEventBus);

        ModEntities.register(modEventBus);
        ModPaintings.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.CUCUMBER.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(ModItems.CUCUMBER_SEEDS.get(), 0.30f);
        });
        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD, Items.ROTTEN_FLESH, ModPotions.INFECTION_POTION.get()));
        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD, ModItems.CROCOITE.get(), ModPotions.RECOVER_POTION.get()));
        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.WEAKNESS, Items.BONE, ModPotions.VULNERABLE_POTION.get()));

        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CHERRY_DAHLIA.getId(), ModBlocks.POTTED_CHERRY_DAHLIA);

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.AZURITE);
            event.accept(ModItems.RAW_AZURITE);
        }


        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.AZURITE_BLOCK);
            event.accept(ModBlocks.CROCOITE_BLOCK);
        }

    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ModItemProperties.addCustomItemProperties();
                EntityRenderers.register(ModEntities.SAPPHIRE_BEETLE.get(), SapphireBeetleRenderer::new);
                EntityRenderers.register(ModEntities.ICE_BOLT_PROJECTILE.get(), IceBoltProjectileRenderer::new);
            });
        }
    }
}
