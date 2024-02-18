package com.tesch.rpg.dtos;

import com.tesch.rpg.entities.Effect;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EffectDTO {
    
    private String name;

    private String description;

    private Integer remainingTurns;

    public static EffectDTO fromEffect(Effect effect) {
        return EffectDTO
            .builder()
                .name(effect.getName())
                .description(effect.getDescription())
                .remainingTurns(effect.getRemainingTurns())
            .build();
    }

    public static Effect toEffect(EffectDTO effectDTO) {
        return Effect
            .builder()
                .name(effectDTO.getName())
                .description(effectDTO.getDescription())
                .remainingTurns(effectDTO.getRemainingTurns())
            .build();
    }
}
