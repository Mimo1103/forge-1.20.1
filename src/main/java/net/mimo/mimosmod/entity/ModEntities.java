package net.mimo.mimosmod.entity;

import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.entity.custom.IceBoltProjectileEntity;
import net.mimo.mimosmod.entity.custom.SapphireBeetleEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MimosMod.MOD_ID);

    public static final RegistryObject<EntityType<SapphireBeetleEntity>> SAPPHIRE_BEETLE =
            ENTITY_TYPES.register("sapphire_beetle", () -> EntityType.Builder.of(SapphireBeetleEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("sapphire_beetle"));
    public static final RegistryObject<EntityType<IceBoltProjectileEntity>> ICE_BOLT_PROJECTILE =
            ENTITY_TYPES.register("ice_bolt_projectile",
                    () -> EntityType.Builder.<IceBoltProjectileEntity>of(IceBoltProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build("ice_bolt_projectile"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
