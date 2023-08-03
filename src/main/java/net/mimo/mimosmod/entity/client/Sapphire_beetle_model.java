package net.mimo.mimosmod.entity.client;// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mimo.mimosmod.entity.animations.ModAnimationDefinitions;
import net.mimo.mimosmod.entity.custom.SapphireBeetleEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class Sapphire_beetle_model<T extends SapphireBeetleEntity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "sapphire_beetle"), "main");
	private final ModelPart sapphire_beetle;
	private final ModelPart head;

	public Sapphire_beetle_model(ModelPart root) {
		this.sapphire_beetle = root.getChild("Animal");
		this.head = sapphire_beetle.getChild("Head");
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
	public void setupAnim(SapphireBeetleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);
		this.animateWalk(ModAnimationDefinitions.SAPPHIRE_BEETLE_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, ModAnimationDefinitions.SAPPHIRE_BEETLE_IDLE, ageInTicks, 1f);
		this.animate(entity.attackAnimationState, ModAnimationDefinitions.SAPPHIRE_BEETLE_ATTACK, ageInTicks, 1f);
	}

	private void applyHeadRotation(SapphireBeetleEntity pEntity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);


		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		sapphire_beetle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return sapphire_beetle;
	}
}