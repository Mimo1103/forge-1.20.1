package net.mimo.mimosmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.entity.custom.IceBoltProjectileEntity;
import net.mimo.mimosmod.entity.layers.ModModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class IceBoltProjectileRenderer extends EntityRenderer<IceBoltProjectileEntity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(MimosMod.MOD_ID, "textures/entity/ice_bolt_projectile_texture.png");
    protected IceBoltProjectileModel model;
    public IceBoltProjectileRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        model = new IceBoltProjectileModel(pContext.bakeLayer(ModModelLayers.ICE_BOLT_PROJECTILE_LAYER));
        this.shadowRadius = 0.4f;
    }

    public void render(IceBoltProjectileEntity entity, float pEntityYaw, float pPartialTick, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        pPoseStack.pushPose();
        pPoseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(pPartialTick, entity.yRotO, entity.getYRot()) - 90.0F));
        pPoseStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(pPartialTick, entity.xRotO, entity.getXRot()) + 90.0F));
        VertexConsumer vertexconsumer = ItemRenderer.getFoilBufferDirect(pBuffer, this.model.renderType(this.getTextureLocation(entity)), false, false);

        this.model.renderToBuffer(pPoseStack, vertexconsumer, pPackedLight, OverlayTexture.NO_OVERLAY, 1f, 1f, 1f, 0.6f); //change overall color
        pPoseStack.popPose();
        super.render(entity, pEntityYaw, pPartialTick, pPoseStack, pBuffer, pPackedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(IceBoltProjectileEntity pEntity) {
        return TEXTURE;
    }
}
