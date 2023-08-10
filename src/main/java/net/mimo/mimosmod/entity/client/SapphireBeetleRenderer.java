package net.mimo.mimosmod.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.entity.custom.SapphireBeetleEntity;
import net.mimo.mimosmod.entity.layers.ModModelLayers;
import net.mimo.mimosmod.entity.variant.SapphireBeetleVariant;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.time.format.ResolverStyle;
import java.util.Map;

public class SapphireBeetleRenderer extends MobRenderer<SapphireBeetleEntity, Sapphire_beetle_model<SapphireBeetleEntity>> {
    private static final Map<SapphireBeetleVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SapphireBeetleVariant.class), map -> {
               map.put(SapphireBeetleVariant.Default,
                       new ResourceLocation(MimosMod.MOD_ID, "textures/entity/sapphire_beetle.png"));
                    map.put(SapphireBeetleVariant.Amethyst,
                            new ResourceLocation(MimosMod.MOD_ID, "textures/entity/amethyst_beetle.png"));
            });
    public SapphireBeetleRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new Sapphire_beetle_model<>(pContext.bakeLayer(ModModelLayers.SAPPHIRE_BEETLE_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SapphireBeetleEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }


    @Override
    public void render(SapphireBeetleEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }
        if(pEntity.getVariant().getId() == 0) {
            pMatrixStack.scale(1.05f, 1.05f,1.05f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
