package com.tesch.rpg.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Organization {
    
    EXECUTORS("executors"),
    KNIGHTS("knights"),
    BROTHERHOOD("brotherhood"),
    EXORCISTS("exorcists");

    private String value;
}
