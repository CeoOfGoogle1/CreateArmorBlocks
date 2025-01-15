package net.ceoofgoogle.createarmorblocks.block;

import com.simibubi.create.foundation.block.connected.AllCTTypes;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.CTSpriteShifter;
import net.minecraft.resources.ResourceLocation;

public class LightPlating {

    public static final CTSpriteShiftEntry LIGHT_PLATING = CTSpriteShifter.getCT(AllCTTypes.OMNIDIRECTIONAL, new ResourceLocation("createarmorblocks", "block/light_plating"),
            new ResourceLocation("createarmorblocks", "block/light_plating_connected"));

}