package com.modid;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class AnimationModClothConfigScreen {
    public static Screen create(Screen parent) {
        ConfigBuilder builder = ConfigBuilder.create()
                .setParentScreen(parent)
                .setTitle(Text.of("Animation Mod Config"));

        ConfigCategory general = builder.getOrCreateCategory(Text.of("General"));
        ConfigEntryBuilder entryBuilder = builder.entryBuilder();

        general.addEntry(entryBuilder
                .startFloatField(Text.of("Swing Duration Multiplier"), ModConfig.INSTANCE.getSwingDurationMultiplier())
                .setDefaultValue(1.0f)
                .setMin(0.1f)
                .setMax(5.0f)
                .setTooltip(Text.of("1.0 = Vanilla speed, higher = slower, lower = faster"))
                .setSaveConsumer(ModConfig.INSTANCE::setSwingDurationMultiplier)
                .build()
        );

        builder.setSavingRunnable(() -> {
            // Save to file here if you have file saving logic
        });

        return builder.build();
    }
}