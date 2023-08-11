package net.mimo.mimosmod.entity.layers;

import com.ibm.icu.text.Normalizer;
import net.mimo.mimosmod.MimosMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation SAPPHIRE_BEETLE_LAYER = new ModelLayerLocation(
            new ResourceLocation(MimosMod.MOD_ID, "sapphire_beetle_layer"), "sapphire_beetle_layer");

    public static final ModelLayerLocation ICE_BOLT_PROJECTILE_LAYER = new ModelLayerLocation(
            new ResourceLocation(MimosMod.MOD_ID, "ice_bolt_projectile_layer"), "ice_bolt_projectile_layer");
}
