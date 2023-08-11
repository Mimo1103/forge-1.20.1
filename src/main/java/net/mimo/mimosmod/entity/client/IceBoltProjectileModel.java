package net.mimo.mimosmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class IceBoltProjectileModel <T extends Entity> extends EntityModel<T> {
    private final ModelPart bb_main;

    public IceBoltProjectileModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0029F, -0.5F, 0.25F, 0.0F, 1.0F, 0.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, -4.0F, -1.5708F, -0.7854F, 0.0F));

        PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.71F, -1.2F, -4.75F, 0.0F, 1.0F, 0.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 1.0F, 1.5708F, -0.7854F, 3.1416F));

        PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5F, -1.5F, -4.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-0.75F, -1.75F, -1.5F, 1.5F, 1.5F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-1.0F, -2.0F, 2.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 1.0F, 1.5708F, 0.0F, 3.1416F));

        return LayerDefinition.create(meshdefinition, 16, 16);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
