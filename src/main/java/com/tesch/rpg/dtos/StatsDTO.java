package com.tesch.rpg.dtos;

import com.tesch.rpg.entities.Stats;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatsDTO {
    
    private Integer strength;

    private Integer dexterity;

    private Integer agility;

    private Integer endurance;

    private Integer charisma;

    private Integer perception;

    private Integer inteligence;

    private Integer classStat;

    public static StatsDTO fromStats(Stats stats) {
        return StatsDTO
            .builder()
                .strength(stats.getStrength())
                .dexterity(stats.getDexterity())
                .agility(stats.getAgility())
                .endurance(stats.getEndurance())
                .charisma(stats.getCharisma())
                .perception(stats.getPerception())
                .inteligence(stats.getInteligence())
                .classStat(stats.getClassStat())
            .build();
    }

    public static Stats toStats(StatsDTO statsDTO) {
        return Stats
            .builder()
                .strength(statsDTO.getStrength())
                .dexterity(statsDTO.getDexterity())
                .agility(statsDTO.getAgility())
                .endurance(statsDTO.getEndurance())
                .charisma(statsDTO.getCharisma())
                .perception(statsDTO.getPerception())
                .inteligence(statsDTO.getInteligence())
                .classStat(statsDTO.getClassStat())
            .build();
    }
}
