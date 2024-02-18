package com.tesch.rpg.dtos;

import java.util.List;

import com.tesch.rpg.entities.Scripture;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ScriptureDTO {

    private Integer creationPoints;

    private Integer remainingScripturePoints;

    private Integer damage;

    private Integer range;

    private Integer sharpness;

    private Boolean isDouble;

    private List<ScriptureAbilityDTO> scriptureAbilityDTOs;

    public static ScriptureDTO fromScripture(Scripture scripture) {
        return ScriptureDTO
            .builder()
                .creationPoints(scripture.getCreationPoints())
                .remainingScripturePoints(scripture.getRemainingScripturePoints())
                .damage(scripture.getDamage())
                .range(scripture.getRange())
                .sharpness(scripture.getSharpness())
                .isDouble(scripture.getIsDouble())
                .scriptureAbilityDTOs(scripture.getAbilities().stream().map(ScriptureAbilityDTO::fromScriptureAbility).toList())
            .build();
    }

    public static Scripture toScripture(ScriptureDTO scriptureDTO) {
        Scripture scripture = Scripture
            .builder()
                .creationPoints(scriptureDTO.getCreationPoints())
                .remainingScripturePoints(scriptureDTO.getRemainingScripturePoints())
                .damage(scriptureDTO.getDamage())
                .range(scriptureDTO.getRange())
                .sharpness(scriptureDTO.getSharpness())
                .isDouble(scriptureDTO.getIsDouble())
                .abilities(scriptureDTO.getScriptureAbilityDTOs().stream().map(ScriptureAbilityDTO::toScriptureAbility).toList())
            .build();

        scripture.getAbilities().forEach(ability -> ability.setScripture(scripture));

        return scripture;
    }
}
