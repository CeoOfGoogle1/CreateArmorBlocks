package net.ceoofgoogle.createarmorblocks.registry;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.foundation.utility.Components;
import net.ceoofgoogle.createarmorblocks.CreateArmorBlocksMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.ceoofgoogle.createarmorblocks.CreateArmorBlocksMod.REGISTRATE;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateArmorBlocksMod.MODID);

    public static final RegistryObject<CreativeModeTab> ARMOR_CREATIVE_TAB = addTab("armor_block", "Create Armor Blocks",
            ModBlocks.ARMOR_BLOCK::asStack);

    public static RegistryObject<CreativeModeTab> addTab(String id, String name, Supplier<ItemStack> icon) {
        String itemGroupId = "itemGroup." + CreateArmorBlocksMod.MODID + "." + id;
        REGISTRATE.addRawLang(itemGroupId, name);
        CreativeModeTab.Builder tabBuilder = CreativeModeTab.builder()
                .icon(icon)
                .displayItems(ModCreativeModeTabs::displayItems)
                .title(Components.translatable(itemGroupId))
                .withTabsBefore(AllCreativeModeTabs.PALETTES_CREATIVE_TAB.getKey());
        return CREATIVE_MODE_TABS.register(id, tabBuilder::build);
    }

    private static void displayItems(CreativeModeTab.ItemDisplayParameters pParameters, CreativeModeTab.Output pOutput) {
        pOutput.accept(ModBlocks.ARMOR_BLOCK);
        pOutput.accept(ModBlocks.DESERT_CAMO_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.DIRT_CAMO_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.FOREST_CAMO_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.MESA_CAMO_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.PLAINS_CAMO_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.RED_DESERT_CAMO_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.SAVANNA_CAMO_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.SKY_CAMO_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.SNOW_CAMO_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.TAIGA_CAMO_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.WATER_CAMO_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.DESERT_CAMO_HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.DIRT_CAMO_HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.FOREST_CAMO_HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.MESA_CAMO_HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.PLAINS_CAMO_HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.RED_DESERT_CAMO_HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.SAVANNA_CAMO_HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.SKY_CAMO_HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.SNOW_CAMO_HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.TAIGA_CAMO_HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.WATER_CAMO_HEAVY_ARMOR_BLOCK);
        /*pOutput.accept(ModBlocks.OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.DESERT_CAMO_OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.DIRT_CAMO_OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.FOREST_CAMO_OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.MESA_CAMO_OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.PLAINS_CAMO_OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.RED_DESERT_CAMO_OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.SAVANNA_CAMO_OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.SKY_CAMO_OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.SNOW_CAMO_OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.TAIGA_CAMO_OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.WATER_CAMO_OLD_ARMOR_BLOCK);*/
        pOutput.accept(ModBlocks.LIGHT_PLATING);
        pOutput.accept(ModBlocks.DESERT_CAMO_LIGHT_PLATING);
        pOutput.accept(ModBlocks.DIRT_CAMO_LIGHT_PLATING);
        pOutput.accept(ModBlocks.FOREST_CAMO_LIGHT_PLATING);
        pOutput.accept(ModBlocks.MESA_CAMO_LIGHT_PLATING);
        pOutput.accept(ModBlocks.PLAINS_CAMO_LIGHT_PLATING);
        pOutput.accept(ModBlocks.RED_DESERT_CAMO_LIGHT_PLATING);
        pOutput.accept(ModBlocks.SAVANNA_CAMO_LIGHT_PLATING);
        pOutput.accept(ModBlocks.SKY_CAMO_LIGHT_PLATING);
        pOutput.accept(ModBlocks.SNOW_CAMO_LIGHT_PLATING);
        pOutput.accept(ModBlocks.TAIGA_CAMO_LIGHT_PLATING);
        pOutput.accept(ModBlocks.WATER_CAMO_LIGHT_PLATING);
        pOutput.accept(ModBlocks.ARMORED_GLASS);
        pOutput.accept(ModBlocks.ARMORED_TRAPDOOR);
        pOutput.accept(ModBlocks.BARBED_WIRE);
        pOutput.accept(ModBlocks.SAND_BAGS);
        pOutput.accept(ModBlocks.TANK_OBSTACLE);
    }


    public static void register(IEventBus eventBus) {
        CreateArmorBlocksMod.getLogger().info("Registering CreativeTabs!");
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
