package com.modid;

public class ModConfig {
    public static final ModConfig INSTANCE = new ModConfig();

    private float swingDurationMultiplier = 1.0F;

    public float getSwingDurationMultiplier() {
        return swingDurationMultiplier;
    }

    public void setSwingDurationMultiplier(float value) {
        this.swingDurationMultiplier = value;
    }
}