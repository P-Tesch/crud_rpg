package com.tesch.rpg.dtos;

import com.tesch.rpg.entities.Advantage;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdvantageDTO {
    
    private String name;

    private String description;

    private Integer level;

    public static AdvantageDTO fromAdvantage(Advantage advantage) {
        return AdvantageDTO
            .builder()
                .name(advantage.getName())
                .description(advantage.getDescription())
                .level(advantage.getLevel())
            .build();
    }

    public static Advantage toAdvantage(AdvantageDTO advantageDTO) {
        return Advantage
            .builder()
                .name(advantageDTO.getName())
                .description(advantageDTO.getDescription())
                .level(advantageDTO.getLevel())
            .build();
    }
}
