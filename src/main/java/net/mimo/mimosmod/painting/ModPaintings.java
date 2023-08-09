package net.mimo.mimosmod.painting;

import net.mimo.mimosmod.MimosMod;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MimosMod.MOD_ID);

    public static final RegistryObject<PaintingVariant> PORTAL_KEY = PAINTING_VARIANTS.register("portal_key",
            () -> new PaintingVariant(64, 64));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
