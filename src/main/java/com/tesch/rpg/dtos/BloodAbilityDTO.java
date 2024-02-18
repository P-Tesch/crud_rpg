package com.tesch.rpg.dtos;

import com.tesch.rpg.entities.BloodAbility;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BloodAbilityDTO {
    
    private String name;

    private String description;

    public static BloodAbilityDTO fromBloodAbility(BloodAbility bloodAbility) {
        return BloodAbilityDTO
            .builder()
                .name(bloodAbility.getName())
                .description(bloodAbility.getDescription())
            .build();
    }

    public static BloodAbility toBloodAbility(BloodAbilityDTO bloodAbilityDTO) {
        return BloodAbility
            .builder()
                .name(bloodAbilityDTO.getName())
                .description(bloodAbilityDTO.getDescription())
            .build();
    }
}
