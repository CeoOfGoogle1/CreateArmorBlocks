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
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import static com.simibubi.create.foundation.data.CreateRegistrate.casingConnectivity;
import static net.ceoofgoogle.createarmorblocks.CreateArmorBlocksMod.MODID;

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
            //.properties(p -> p.strength(50.0F, 1200.0F)
            .properties(p -> BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()
                    .strength(50.0f, 1200.0f)
                    .noCollission()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.CHAIN))
            .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.standardModel(c, p)))
            .simpleItem()
            .register();

    public static final BlockEntry<SandBags> SAND_BAGS = CreateArmorBlocksMod.REGISTRATE.block("sand_bags", SandBags::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.SAND))
            .properties(BlockBehaviour.Properties::noOcclusion)
            .blockstate((c, p) -> p.horizontalBlock(c.getEntry(), AssetLookup.standardModel(c, p)))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> LIGHT_PLATING = CreateArmorBlocksMod.REGISTRATE.block("light_plating", Block::new)
            //  .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.NETHERITE_BLOCK))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCTBehaviour(LightPlating.LIGHT_PLATING)))
            .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, LightPlating.LIGHT_PLATING)))
            .simpleItem()
            .register();

    public static final BlockEntry<TrainTrapdoorBlock> ARMORED_TRAPDOOR = CreateArmorBlocksMod.REGISTRATE.block("armoredtrapdoor", TrainTrapdoorBlock::new)
            .properties(p -> BlockBehaviour.Properties.copy(Blocks.IRON_TRAPDOOR)
                    .strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.METAL))
            .simpleItem()
            .register();
    public static final BlockEntry<TankObstacleTop> TANK_OBSTACLE_TOP = CreateArmorBlocksMod.REGISTRATE.block("tank_obstacle_top", TankObstacleTop::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops()
                    .noOcclusion())
            .register();
    public static final BlockEntry<TankObstacle> TANK_OBSTACLE = CreateArmorBlocksMod.REGISTRATE.block("tank_obstacle", TankObstacle::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(p -> p.strength(50.0F, 1200.0F)
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
