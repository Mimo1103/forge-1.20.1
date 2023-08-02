package net.mimo.mimosmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.entity.custom.SapphireBeetleEntity;
import net.mimo.mimosmod.entity.layers.ModModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.time.format.ResolverStyle;

public class SapphireBeetleRenderer extends MobRenderer<SapphireBeetleEntity, Sapphire_beetle_model<SapphireBeetleEntity>> {

    private static final ResourceLocation SAPPHIRE_BEETLE_LOCATION = new ResourceLocation(MimosMod.MOD_ID, "textures/entity/sapphire_beetle.png");
    public SapphireBeetleRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new Sapphire_beetle_model<>(pContext.bakeLayer(ModModelLayers.SAPPHIRE_BEETLE_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SapphireBeetleEntity pEntity) {
        return SAPPHIRE_BEETLE_LOCATION;
    }

    @Override
    public void render(SapphireBeetleEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
