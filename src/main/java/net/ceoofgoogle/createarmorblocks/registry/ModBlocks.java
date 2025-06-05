package net.ceoofgoogle.createarmorblocks.registry;

import com.simibubi.create.content.decoration.TrainTrapdoorBlock;
import com.simibubi.create.content.decoration.encasing.EncasedCTBehaviour;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.ceoofgoogle.createarmorblocks.CreateArmorBlocksMod;
import net.ceoofgoogle.createarmorblocks.block.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import static com.simibubi.create.foundation.data.CreateRegistrate.casingConnectivity;
import static net.ceoofgoogle.createarmorblocks.CreateArmorBlocksMod.MODID;

public class ModBlocks {

    public static final BlockEntry<Block> ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DESERT_CAMO_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("desert_camo_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DIRT_CAMO_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("dirt_camo_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> FOREST_CAMO_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("forest_camo_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MESA_CAMO_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("mesa_camo_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PLAINS_CAMO_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("plains_camo_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> RED_DESERT_CAMO_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("red_desert_camo_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SAVANNA_CAMO_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("savanna_camo_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SKY_CAMO_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("sky_camo_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SNOW_CAMO_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("snow_camo_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> TAIGA_CAMO_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("taiga_camo_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> WATER_CAMO_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("water_camo_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DESERT_CAMO_HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("desert_camo_heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DIRT_CAMO_HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("dirt_camo_heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> FOREST_CAMO_HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("forest_camo_heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MESA_CAMO_HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("mesa_camo_heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PLAINS_CAMO_HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("plains_camo_heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> RED_DESERT_CAMO_HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("red_desert_camo_heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SAVANNA_CAMO_HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("savanna_camo_heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SKY_CAMO_HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("sky_camo_heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SNOW_CAMO_HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("snow_camo_heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> TAIGA_CAMO_HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("taiga_camo_heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> WATER_CAMO_HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("water_camo_heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 25.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DESERT_CAMO_OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("desert_camo_old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DIRT_CAMO_OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("dirt_camo_old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> FOREST_CAMO_OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("forest_camo_old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MESA_CAMO_OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("mesa_camo_old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PLAINS_CAMO_OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("plains_camo_old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> RED_DESERT_CAMO_OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("red_desert_camo_old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SAVANNA_CAMO_OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("savanna_camo_old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SKY_CAMO_OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("sky_camo_old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SNOW_CAMO_OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("snow_camo_old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> TAIGA_CAMO_OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("taiga_camo_old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> WATER_CAMO_OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("water_camo_old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DESERT_CAMO_LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("desert_camo_light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.DESERT_CAMO_LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.DESERT_CAMO_LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DIRT_CAMO_LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("dirt_camo_light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.DIRT_CAMO_LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.DIRT_CAMO_LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> FOREST_CAMO_LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("forest_camo_light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.FOREST_CAMO_LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.FOREST_CAMO_LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MESA_CAMO_LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("mesa_camo_light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.MESA_CAMO_LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.MESA_CAMO_LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PLAINS_CAMO_LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("plains_camo_light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.PLAINS_CAMO_LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.PLAINS_CAMO_LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> RED_DESERT_CAMO_LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("red_desert_camo_light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.RED_DESERT_CAMO_LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.RED_DESERT_CAMO_LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SAVANNA_CAMO_LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("savanna_camo_light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.SAVANNA_CAMO_LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.SAVANNA_CAMO_LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SKY_CAMO_LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("sky_camo_light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.SKY_CAMO_LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.SKY_CAMO_LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SNOW_CAMO_LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("snow_camo_light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.SNOW_CAMO_LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.SNOW_CAMO_LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> TAIGA_CAMO_LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("taiga_camo_light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.TAIGA_CAMO_LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.TAIGA_CAMO_LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> WATER_CAMO_LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("water_camo_light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 4.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.WATER_CAMO_LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.WATER_CAMO_LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<GlassBlock> ARMORED_GLASS = CreateArmorBlocksMod.REGISTRATE.block("armored_glass", GlassBlock::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(6.0F, 6.0F)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.GLASS))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(ModSpriteShifts.ARMORED_GLASS)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ModSpriteShifts.ARMORED_GLASS)))
            .simpleItem()
            .register();

    public static final BlockEntry<TrainTrapdoorBlock> ARMORED_TRAPDOOR = CreateArmorBlocksMod.REGISTRATE.block("armored_trapdoor", TrainTrapdoorBlock::new)
            .properties(p -> BlockBehaviour.Properties.copy(Blocks.IRON_TRAPDOOR)
                    .strength(8.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.METAL))
            .simpleItem()
            .register();

    public static final BlockEntry<BarbedWire> BARBED_WIRE = CreateArmorBlocksMod.REGISTRATE.block("barbed_wire", BarbedWire::new)
            .initialProperties(SharedProperties::softMetal)
            //.properties(p -> p.strength(50.0F, 1200.0F)
            .properties(p -> BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()
                    .strength(4.0f, 4.0f)
                    .noCollission()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.CHAIN))
            .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.standardModel(c, p)))
            .simpleItem()
            .register();

    public static final BlockEntry<SandBags> SAND_BAGS = CreateArmorBlocksMod.REGISTRATE.block("sand_bags", SandBags::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(4.0F, 8.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.SAND))
            .properties(BlockBehaviour.Properties::noOcclusion)
            .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.standardModel(c, p)))
            .simpleItem()
            .register();

    public static final BlockEntry<TankObstacleTop> TANK_OBSTACLE_TOP = CreateArmorBlocksMod.REGISTRATE.block("tank_obstacle_top", TankObstacleTop::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .noOcclusion())
            .register();

    public static final BlockEntry<TankObstacle> TANK_OBSTACLE = CreateArmorBlocksMod.REGISTRATE.block("tank_obstacle", TankObstacle::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(10.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .noOcclusion()
                    .sound(SoundType.NETHERITE_BLOCK))
            .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.standardModel(c, p)))
            .simpleItem()
            .register();


    public static void register(){
        CreateArmorBlocksMod.getLogger().info("Registering Blocks");
    }
    public ResourceLocation modLoc(String name) {
        return new ResourceLocation(MODID, name);
    }
}
