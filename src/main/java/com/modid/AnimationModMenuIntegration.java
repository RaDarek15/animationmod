package com.modid;

import com.modid.AnimationMod;
import me.shedaniel.clothconfig2.api.ConfigScreenProvider;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public class AnimationModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return AnimationModClothConfigScreen::create;
    }
}