package com.github.carrioncrawler.storageplease;

import net.neoforged.neoforge.common.ModConfigSpec;


public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue DEBUG_MODE = BUILDER
            .comment("Mostly verbose logging. Enable if you're a nerd.")
            .define("debugMode",false);

    static final ModConfigSpec SPEC = BUILDER.build();

}
