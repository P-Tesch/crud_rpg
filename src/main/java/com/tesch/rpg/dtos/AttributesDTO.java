package com.tesch.rpg.dtos;

import com.tesch.rpg.entities.Attributes;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AttributesDTO {
    
    private Integer health;

    private Integer initiative;

    private Integer movement;

    private Integer mana;

    private Integer energy;

    private Integer blood;

    private Integer bloodXpHuman;

    private Integer bloodXpAnimal;

    private Integer bloodXpVampire;

    private Integer workingCircuits;

    public static AttributesDTO fromAttributes(Attributes attributes) {
        return AttributesDTO
            .builder()
                .health(attributes.getHealth())
                .initiative(attributes.getInitiative())
                .movement(attributes.getMovement())
                .mana(attributes.getMana())
                .energy(attributes.getEnergy())
                .blood(attributes.getBlood())
                .bloodXpHuman(attributes.getBloodXpHuman())
                .bloodXpAnimal(attributes.getBloodXpAnimal())
                .bloodXpVampire(attributes.getBloodXpVampire())
                .workingCircuits(attributes.getWorkingCircuits())
            .build();
    }

    public static Attributes toAttributes(AttributesDTO attributesDTO) {
        return Attributes
            .builder()
                .health(attributesDTO.getHealth())
                .initiative(attributesDTO.getInitiative())
                .movement(attributesDTO.getMovement())
                .mana(attributesDTO.getMana())
                .energy(attributesDTO.getEnergy())
                .blood(attributesDTO.getBlood())
                .bloodXpHuman(attributesDTO.getBloodXpHuman())
                .bloodXpAnimal(attributesDTO.getBloodXpAnimal())
                .bloodXpVampire(attributesDTO.getBloodXpVampire())
                .workingCircuits(attributesDTO.getWorkingCircuits())
            .build();
    }
}
