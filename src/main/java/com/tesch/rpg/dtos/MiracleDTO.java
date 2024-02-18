package com.tesch.rpg.dtos;

import com.tesch.rpg.entities.Miracle;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MiracleDTO {
    
    private String name;

    private String description;

    public static MiracleDTO fromMiracle(Miracle miracle) {
        return MiracleDTO
            .builder()
                .name(miracle.getName())
                .description(miracle.getDescription())
            .build();
    }

    public static Miracle toMiracle(MiracleDTO miracleDTO) {
        return Miracle
            .builder()
                .name(miracleDTO.getName())
                .description(miracleDTO.getDescription())
            .build();
    }
}
