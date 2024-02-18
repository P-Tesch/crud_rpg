package com.tesch.rpg.dtos;

import java.util.List;

import com.tesch.rpg.entities.Sonata;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SonataDTO {
    
    private String name;

    private String description;

    private List<SonataAbilityDTO> sonataAbilityDTOs;

    public static SonataDTO fromSonata(Sonata sonata) {
        return SonataDTO
            .builder()
                .name(sonata.getName())
                .description(sonata.getDescription())
                .sonataAbilityDTOs(sonata.getSonataAbilieties().stream().map(SonataAbilityDTO::fromSonataAbility).toList())
            .build();
    }

    public static Sonata toSonata(SonataDTO sonataDTO) {
        Sonata sonata = Sonata
            .builder()
                .name(sonataDTO.getName())
                .description(sonataDTO.getDescription())
                .sonataAbilieties(sonataDTO.getSonataAbilityDTOs().stream().map(SonataAbilityDTO::toSonataAbility).toList())
            .build();

        sonata.getSonataAbilieties().forEach(ability -> ability.setSonata(sonata));

        return sonata;
    }
}
