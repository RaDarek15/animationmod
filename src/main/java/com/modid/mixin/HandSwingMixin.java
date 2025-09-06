package com.modid.mixin;

import com.modid.ModConfig;
import net.minecraft.client.render.item.HeldItemRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(HeldItemRenderer.class)
public class HandSwingMixin {
    @ModifyVariable(
            method = "renderFirstPersonItem",
            at = @At("HEAD"),
            argsOnly = true,
            ordinal = 2 // swingProgress
    )
    private float modifySwingProgress(float swingProgress) {
        float multiplier = ModConfig.INSTANCE.getSwingDurationMultiplier();
        return swingProgress / multiplier;
    }
}