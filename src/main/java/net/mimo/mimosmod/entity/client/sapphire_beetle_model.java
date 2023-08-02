package net.mimo.mimosmod.entity.client;// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class sapphire_beetle_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "sapphire_beetle"), "main");
	private final ModelPart Animal;

	public sapphire_beetle_model(ModelPart root) {
		this.Animal = root.getChild("Animal");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Animal = partdefinition.addOrReplaceChild("Animal", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = Animal.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Foots = Body.addOrReplaceChild("Foots", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Right = Foots.addOrReplaceChild("Right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition UpperFoot = Right.addOrReplaceChild("UpperFoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition UpperRFoot_r1 = UpperFoot.addOrReplaceChild("UpperRFoot_r1", CubeListBuilder.create().texOffs(17, 0).addBox(-5.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition MiddleFoot = Right.addOrReplaceChild("MiddleFoot", CubeListBuilder.create().texOffs(12, 17).addBox(-5.0F, -1.0F, -0.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LowerFoot = Right.addOrReplaceChild("LowerFoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LowerRFoot_r1 = LowerFoot.addOrReplaceChild("LowerRFoot_r1", CubeListBuilder.create().texOffs(12, 15).addBox(-5.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition Left = Foots.addOrReplaceChild("Left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LowerFoots = Left.addOrReplaceChild("LowerFoots", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LowerLFoot_r1 = LowerFoots.addOrReplaceChild("LowerLFoot_r1", CubeListBuilder.create().texOffs(17, 2).addBox(1.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition MiddleFoots = Left.addOrReplaceChild("MiddleFoots", CubeListBuilder.create().texOffs(11, 19).addBox(1.0F, -1.0F, -0.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition UpperFoots = Left.addOrReplaceChild("UpperFoots", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition UpperLFoot_r1 = UpperFoots.addOrReplaceChild("UpperLFoot_r1", CubeListBuilder.create().texOffs(17, 4).addBox(1.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition BodyParts = Body.addOrReplaceChild("BodyParts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition UpperBody = BodyParts.addOrReplaceChild("UpperBody", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -1.9F, -2.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LowerBody = BodyParts.addOrReplaceChild("LowerBody", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -1.2F, -3.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Crystal = BodyParts.addOrReplaceChild("Crystal", CubeListBuilder.create().texOffs(14, 8).addBox(-1.0F, -2.1F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head = Animal.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Horn = Head.addOrReplaceChild("Horn", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Horn_r1 = Horn.addOrReplaceChild("Horn_r1", CubeListBuilder.create().texOffs(0, 15).addBox(-3.0F, -8.3F, -4.0F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition HeadPart = Head.addOrReplaceChild("HeadPart", CubeListBuilder.create().texOffs(19, 19).addBox(-1.0F, -1.6F, -3.99F, 2.0F, 1.5F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Animal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}