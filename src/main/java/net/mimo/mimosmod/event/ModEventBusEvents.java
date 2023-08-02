package net.mimo.mimosmod.event;

import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.entity.ModEntities;
import net.mimo.mimosmod.entity.client.Sapphire_beetle_model;
import net.mimo.mimosmod.entity.custom.SapphireBeetleEntity;
import net.mimo.mimosmod.entity.layers.ModModelLayers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MimosMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.SAPPHIRE_BEETLE_LAYER, Sapphire_beetle_model::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.SAPPHIRE_BEETLE.get(), SapphireBeetleEntity.createAttribtutes().build());
    }

}
