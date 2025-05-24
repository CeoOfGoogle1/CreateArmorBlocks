package net.ceoofgoogle.createarmorblocks.block;

import com.simibubi.create.foundation.block.connected.*;
import net.ceoofgoogle.createarmorblocks.CreateArmorBlocksMod;


public  class LightPlating {

    public static CTSpriteShiftEntry LIGHT_PLATING = omni("light_plating");

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