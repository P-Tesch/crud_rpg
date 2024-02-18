package com.tesch.rpg.dtos;

import com.tesch.rpg.entities.SonataAbility;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SonataAbilityDTO {
    
    private String name;

    private String description;

    private Integer level;

    public static SonataAbilityDTO fromSonataAbility(SonataAbility sonataAbility) {
        return SonataAbilityDTO
            .builder()
                .name(sonataAbility.getName())
                .description(sonataAbility.getDescription())
                .level(sonataAbility.getLevel())
            .build();
    }

    public static SonataAbility toSonataAbility(SonataAbilityDTO sonataAbilityDTO) {
        return SonataAbility
            .builder()
                .name(sonataAbilityDTO.getName())
                .description(sonataAbilityDTO.getDescription())
                .level(sonataAbilityDTO.getLevel())
            .build();
    }
}
