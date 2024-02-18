package com.tesch.rpg.dtos;

import java.util.List;

import com.tesch.rpg.entities.School;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SchoolDTO {
    
    private String name;

    private String description;

    private Integer level;

    private List<SpellDTO> spellDTOs;

    public static SchoolDTO fromSchool(School school) {
        return SchoolDTO
            .builder()
                .name(school.getName())
                .description(school.getDescription())
                .level(school.getLevel())
                .spellDTOs(school.getSpells().stream().map(SpellDTO::fromSpell).toList())
            .build();
    }

    public static School toSchool(SchoolDTO schoolDTO) {
        School school = School
            .builder()
                .name(schoolDTO.getName())
                .description(schoolDTO.getDescription())
                .level(schoolDTO.getLevel())
                .spells(schoolDTO.getSpellDTOs().stream().map(SpellDTO::toSpell).toList())
            .build();

        school.getSpells().forEach(spell -> spell.setSchool(school));

        return school;
    }
}
