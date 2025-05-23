package net.ceoofgoogle.createarmorblocks;

import com.google.common.base.Preconditions;
import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.ceoofgoogle.createarmorblocks.registry.ModBlocks;
import net.ceoofgoogle.createarmorblocks.registry.ModCreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.IGeneratedBlockState;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.client.model.obj.ObjLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.VisibleForTesting;
import org.slf4j.Logger;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.simibubi.create.Create.REGISTRATE;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateArmorBlocksMod.MODID)
public class CreateArmorBlocksMod {
    public static final String MODID = "createarmorblocks";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MODID);



    public CreateArmorBlocksMod() {
        getLogger().info("Initializing Create ArmorBlocks!");
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        REGISTRATE.registerEventListeners(modEventBus);
        ModBlocks.register();
        ModCreativeModeTabs.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static Logger getLogger() {
        return LOGGER;
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MODID, path);
    }


}
