package com.modid;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModConfig {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final File CONFIG_FILE = new File("config/animationmod.json");
    public static ModConfig INSTANCE = new ModConfig();

    // Configurable fields
    public float swingSpeed = 1.0f;
    public String swingStyle = "smooth";
    public float amplitude = 1.0f;

    public static void load() {
        if (CONFIG_FILE.exists()) {
            try (FileReader reader = new FileReader(CONFIG_FILE)) {
                INSTANCE = GSON.fromJson(reader, ModConfig.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            save(); // Create default config if missing
        }
    }

    public static void save() {
        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            GSON.toJson(INSTANCE, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Accessors for mixin usage
    public float getSwingSpeed() {
        return swingSpeed;
    }
    public String getSwingStyle() {
        return swingStyle;
    }
    public float getAmplitude() {
        return amplitude;
    }
}