package com.modid;

public class ModConfig {
    public static final ModConfig INSTANCE = new ModConfig();

    // 1.0 = vanilla, >1.0 = slower swing, <1.0 = faster swing
    private float swingDurationMultiplier = 1.0F;

    public float getSwingDurationMultiplier() {
        return swingDurationMultiplier;
    }

    public void setSwingDurationMultiplier(float swingDurationMultiplier) {
        this.swingDurationMultiplier = swingDurationMultiplier;
    }
}