package net.mimo.mimosmod.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum SapphireBeetleVariant {
    Default(0),
    Amethyst(1);

    private static final SapphireBeetleVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SapphireBeetleVariant::getId)).toArray(SapphireBeetleVariant[]::new);
    private final int id;
    SapphireBeetleVariant(int id) {this.id = id;}
    public int getId() {return this.id;}
    public static SapphireBeetleVariant byId(int id) {return BY_ID[id % BY_ID.length];}
}
