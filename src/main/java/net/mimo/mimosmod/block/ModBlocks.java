package net.mimo.mimosmod.block;

import net.mimo.mimosmod.MimosMod;
import net.mimo.mimosmod.block.custom.CopperLampBlock;
import net.mimo.mimosmod.block.custom.ModFlammableRotatedPillarBlock;
import net.mimo.mimosmod.block.custom.SoundBlock;
import net.mimo.mimosmod.item.ModItems;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MimosMod.MOD_ID);


    public static final RegistryObject<Block> AZURITE_BLOCK = registerBlock("azurite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> RAW_AZURITE_BLOCK = registerBlock("raw_azurite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> CROCOITE_BLOCK = registerBlock("crocoite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BANJO)
                    .requiresCorrectToolForDrops().strength(5.0F, 5.0F)));


    public static final RegistryObject<Block> AZURITE_ORE = registerBlock("azurite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f, 3f).requiresCorrectToolForDrops(), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> DEEPSLATE_AZURITE_ORE = registerBlock("deepslate_azurite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(4.5f, 3f).requiresCorrectToolForDrops(), UniformInt.of(1, 3)));

    public static final RegistryObject<Block> STARDUST_ORE = registerBlock("stardust_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(4f, 4.5f).requiresCorrectToolForDrops(), UniformInt.of(2, 4)));

    public static final RegistryObject<Block> DEEPSLATE_STARDUST_ORE = registerBlock("deepslate_stardust_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(4.5f, 5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    public static final RegistryObject<Block> LUMITE_ORE = registerBlock("lumite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(4.5f, 3.5f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> PIANITE_ORE = registerBlock("pianite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5.5f, 6f).requiresCorrectToolForDrops(), UniformInt.of(4, 8)));

    public static final RegistryObject<Block> CELESTIAL_ORE = registerBlock("celestial_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5f, 5.5f).requiresCorrectToolForDrops(), UniformInt.of(4, 7)));

    public static final RegistryObject<Block> CROCOITE_ORE = registerBlock("crocoite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(3f, 3.5f).requiresCorrectToolForDrops(), UniformInt.of(1, 3)));

    public static final RegistryObject<Block> SOULSTEEL_ORE = registerBlock("soulsteel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(4f, 3.5f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> NECROSTONE_ORE = registerBlock("necrostone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(3.5f, 3f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    public static final RegistryObject<Block> INFERNITE_ORE = registerBlock("infernite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(3f, 3f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> INFERNIUM_ORE = registerBlock("infernium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(3.5f, 3.5f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> EMBERCORE_ORE = registerBlock("embercore_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(7f, 9f).requiresCorrectToolForDrops(), UniformInt.of(3, 8)));

    public static final RegistryObject<Block> ARCANE_CRYSTAL_ORE = registerBlock("arcane_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(4f, 10f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> MYSTELITE_ORE = registerBlock("mystelite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(5f, 11f).requiresCorrectToolForDrops(), UniformInt.of(4, 6)));

    public static final RegistryObject<Block> VOIDSTONE_AMETHYST_ORE = registerBlock("voidstone_amethyst_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(3.5f, 9.5f).requiresCorrectToolForDrops(), UniformInt.of(3, 5)));


    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));


    public static final RegistryObject<Block> GREENHEART_LOG = registerBlock("greenheart_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> GREENHEART_WOOD = registerBlock("greenheart_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_GREENHEART_LOG = registerBlock("stripped_greenheart_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_GREENHEART_WOOD = registerBlock("stripped_greenheart_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));


    public static final RegistryObject<Block> GREENHEART_PLANKS = registerBlock("greenheart_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });


    public static final RegistryObject<Block> GREENHEART_LEAVES = registerBlock("greenheart_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });


    public static final RegistryObject<Block> GREENHEART_STAIRS = registerBlock("greenheart_stairs",
            () -> new StairBlock(() -> ModBlocks.GREENHEART_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> GREENHEART_SLAB = registerBlock("greenheart_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> GREENHEART_PRESSURE_PLATE = registerBlock("greenheart_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.OAK));


    public static final RegistryObject<Block> GREENHEART_FENCE = registerBlock("greenheart_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));


    public static final RegistryObject<Block> GREENHEART_BUTTON = registerBlock("greenheart_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), BlockSetType.OAK, 10, true)); //last one = can arrow press this button


    public static final RegistryObject<Block> GREENHEART_FENCE_GATE = registerBlock("greenheart_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> GREENHEART_DOOR = registerBlock("greenheart_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), BlockSetType.OAK));

    public static final RegistryObject<Block> GREENHEART_TRAPDOOR = registerBlock("greenheart_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), BlockSetType.OAK));


    public static final RegistryObject<Block> GREENHEART_SAPLING = registerBlock("greenheart_sapling",
            () -> new SaplingBlock(null, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<Block> COPPER_LAMP = registerBlock("copper_lamp",
            () -> new CopperLampBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.COPPER)
                    .lightLevel(state -> state.getValue(CopperLampBlock.CLICKED) ? 15 : 0)));


    public static final RegistryObject<Block> CHERRY_DAHLIA = registerBlock("cherry_dahlia",
            () -> new FlowerBlock(() -> MobEffects.SLOW_FALLING, 6 ,BlockBehaviour.Properties.copy(Blocks.ALLIUM)));
    public static final RegistryObject<Block> POTTED_CHERRY_DAHLIA = BLOCKS.register("potted_cherry_dahlia",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CHERRY_DAHLIA,BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn  = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
