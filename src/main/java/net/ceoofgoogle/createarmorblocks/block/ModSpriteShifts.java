package net.ceoofgoogle.createarmorblocks.block;

import com.simibubi.create.foundation.block.connected.*;
import net.ceoofgoogle.createarmorblocks.CreateArmorBlocksMod;


public  class ModSpriteShifts {

    public static CTSpriteShiftEntry LIGHT_PLATING = omni("light_plating");
    public static CTSpriteShiftEntry DESERT_CAMO_LIGHT_PLATING = omni("desert_camo_light_plating");
    public static CTSpriteShiftEntry DIRT_CAMO_LIGHT_PLATING = omni("dirt_camo_light_plating");
    public static CTSpriteShiftEntry FOREST_CAMO_LIGHT_PLATING = omni("forest_camo_light_plating");
    public static CTSpriteShiftEntry MESA_CAMO_LIGHT_PLATING = omni("mesa_camo_light_plating");
    public static CTSpriteShiftEntry PLAINS_CAMO_LIGHT_PLATING = omni("plains_camo_light_plating");
    public static CTSpriteShiftEntry RED_DESERT_CAMO_LIGHT_PLATING = omni("red_desert_camo_light_plating");
    public static CTSpriteShiftEntry SAVANNA_CAMO_LIGHT_PLATING = omni("savanna_camo_light_plating");
    public static CTSpriteShiftEntry SKY_CAMO_LIGHT_PLATING = omni("sky_camo_light_plating");
    public static CTSpriteShiftEntry SNOW_CAMO_LIGHT_PLATING = omni("snow_camo_light_plating");
    public static CTSpriteShiftEntry TAIGA_CAMO_LIGHT_PLATING = omni("taiga_camo_light_plating");
    public static CTSpriteShiftEntry WATER_CAMO_LIGHT_PLATING = omni("water_camo_light_plating");
    public static CTSpriteShiftEntry ARMORED_GLASS = omni("armored_glass");

    public static CTSpriteShiftEntry omni(String name) {
        return getCT(AllCTTypes.OMNIDIRECTIONAL, name);
    }
    private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName, String connectedTextureName) {
        return CTSpriteShifter.getCT(type, CreateArmorBlocksMod.asResource("block/" + blockTextureName), CreateArmorBlocksMod.asResource("block/" + connectedTextureName + "_connected"));
    }

    private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName) {
        return getCT(type, blockTextureName, blockTextureName);
    }
}