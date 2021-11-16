package org.bukkit;

import com.google.common.collect.Maps;
import java.util.Map;

public enum GameMode {
    CREATIVE(1),
    SURVIVAL(0),
    ADVENTURE(2),
    CLOUDSTUDIO(3),
    SPECTATOR(4);

    private final int value;
    private static final Map<Integer, GameMode> BY_ID = Maps.newHashMap();

    static {
        GameMode[] var3;
        int var2 = (var3 = values()).length;

        for(int var1 = 0; var1 < var2; ++var1) {
            GameMode mode = var3[var1];
            BY_ID.put(mode.getValue(), mode);
        }

    }

    private GameMode(int value) {
        this.value = value;
    }

    @Deprecated
    public int getValue() {
        return this.value;
    }

    @Deprecated
    public static GameMode getByValue(int value) {
        return (GameMode)BY_ID.get(value);
    }
}