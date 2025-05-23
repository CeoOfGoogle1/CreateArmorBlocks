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
        pOutput.accept(ModBlocks.ERA_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.HEAVY_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.HARD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.OLD_ARMOR_BLOCK);
        pOutput.accept(ModBlocks.BARBED_WIRE);
        pOutput.accept(ModBlocks.LIGHT_PLATING);
        pOutput.accept(ModBlocks.SAND_BAGS);
        pOutput.accept(ModBlocks.ARMORED_TRAPDOOR);
        pOutput.accept(ModBlocks.TANK_OBSTACLE);
    }


    public static void register(IEventBus eventBus) {
        CreateArmorBlocksMod.getLogger().info("Registering CreativeTabs!");
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
