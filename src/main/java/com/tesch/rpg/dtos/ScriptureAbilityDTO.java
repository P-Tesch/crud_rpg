package com.tesch.rpg.dtos;

import com.tesch.rpg.entities.ScriptureAbility;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ScriptureAbilityDTO {
    
    private String name;

    private String description;

    private Integer level;

    public static ScriptureAbilityDTO fromScriptureAbility(ScriptureAbility scriptureAbility) {
        return ScriptureAbilityDTO
            .builder()
                .name(scriptureAbility.getName())
                .description(scriptureAbility.getDescription())
                .level(scriptureAbility.getLevel())
            .build();
    }

    public static ScriptureAbility toScriptureAbility(ScriptureAbilityDTO scriptureAbilityDTO) {
        return ScriptureAbility
            .builder()
                .name(scriptureAbilityDTO.getName())
                .description(scriptureAbilityDTO.getDescription())
                .level(scriptureAbilityDTO.getLevel())
            .build();
    }
}
