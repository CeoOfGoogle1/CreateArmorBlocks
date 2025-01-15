package net.ceoofgoogle.createarmorblocks.registry;

import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.ceoofgoogle.createarmorblocks.CreateArmorBlocksMod;
import net.ceoofgoogle.createarmorblocks.block.BarbedWire;
import net.ceoofgoogle.createarmorblocks.block.LightPlating;
import net.ceoofgoogle.createarmorblocks.block.SandBags;
import net.ceoofgoogle.createarmorblocks.block.TankObstacle;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {

    public static final BlockEntry<Block> ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ERA_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("era_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> HEAVY_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("heavy_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> HARD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("hard_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> OLD_ARMOR_BLOCK = CreateArmorBlocksMod.REGISTRATE.block("old_armor_block", Block::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .simpleItem()
            .register();

    public static final BlockEntry<BarbedWire> BARBED_WIRE = CreateArmorBlocksMod.REGISTRATE.block("barbed_wire", BarbedWire::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.standardModel(c, p)))
            .simpleItem()
            .register();

    public static final BlockEntry<SandBags> SAND_BAGS = CreateArmorBlocksMod.REGISTRATE.block("sand_bags", SandBags::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.SAND))
            .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.standardModel(c, p)))
            .simpleItem()
            .register();

    public static final BlockEntry<TankObstacle> TANK_OBSTACLE = CreateArmorBlocksMod.REGISTRATE.block("tank_obstacle", TankObstacle::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.standardModel(c, p)))
            .simpleItem()
            .register();

    public static final BlockEntry<CasingBlock> LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("light_plating", CasingBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .transform(BuilderTransformers.casing(() -> LightPlating.LIGHT_PLATING))
            .simpleItem()
            .register();

    public static void register(){
        CreateArmorBlocksMod.getLogger().info("Registering Blocks");
    }
}
