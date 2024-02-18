package com.tesch.rpg.dtos;

import com.tesch.rpg.entities.Spell;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SpellDTO {
    
    private String name;

    private String description;

    public static SpellDTO fromSpell(Spell spell) {
        return SpellDTO
            .builder()
                .name(spell.getName())
                .description(spell.getDescription())
            .build();
    }

    public static Spell toSpell(SpellDTO spellDTO) {
        return Spell
            .builder()
                .name(spellDTO.getName())
                .description(spellDTO.getDescription())
            .build();
    }
}
