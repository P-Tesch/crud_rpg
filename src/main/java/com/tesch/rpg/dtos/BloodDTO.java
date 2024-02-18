package com.tesch.rpg.dtos;

import java.util.List;

import com.tesch.rpg.entities.Blood;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BloodDTO {
    
    private String name;

    private String impulses;

    private StatsDTO statsDTO;

    private List<BloodAbilityDTO> bloodAbilityDTOs;

    public static BloodDTO fromBlood(Blood blood) {
        return BloodDTO
            .builder()
                .name(blood.getName())
                .impulses(blood.getImpulses())
                .statsDTO(StatsDTO.fromStats(blood.getStats()))
                .bloodAbilityDTOs(blood.getBloodAbilities().stream().map(BloodAbilityDTO::fromBloodAbility).toList())
            .build();
    }

    public static Blood toBlood(BloodDTO bloodDTO) {
        Blood blood = Blood
            .builder()
                .name(bloodDTO.getName())
                .impulses(bloodDTO.getImpulses())
                .stats(StatsDTO.toStats(bloodDTO.getStatsDTO()))
                .bloodAbilities(bloodDTO.getBloodAbilityDTOs().stream().map(BloodAbilityDTO::toBloodAbility).toList())
            .build();

        blood.getBloodAbilities().forEach(bloodAbility -> bloodAbility.setBlood(blood));

        return blood;
    }
}
