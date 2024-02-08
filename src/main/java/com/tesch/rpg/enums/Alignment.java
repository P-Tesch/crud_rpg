package com.tesch.rpg.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Alignment {
    
    FIRE("fire"),
    WATER("water"),
    AIR("air"),
    EARTH("earth"),
    ELECTRICITY("electricity"),
    ARCANA("arcana"),
    ICE("ice"),
    VOID("void");

    private String value;
}
