package com.tesch.rpg.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "attributes")
@Builder
@Data
public class Attributes {
    
    @Id
    @Column(name = "attributes_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "health", nullable = false)
    private Integer health;

    @Column(name = "initiative", nullable = false)
    private Integer initiative;

    @Column(name = "movement", nullable = false)
    private Integer movement;

    @Column(name = "mana", nullable = true)
    private Integer mana;

    @Column(name = "energy", nullable = true)
    private Integer energy;

    @Column(name = "blood", nullable = true)
    private Integer blood;

    @Column(name = "blood_xp_human", nullable = true)
    private Integer bloodXpHuman;

    @Column(name = "blood_xp_animal", nullable = true)
    private Integer bloodXpAnimal;

    @Column(name = "blood_xp_vampire", nullable = true)
    private Integer bloodXpVampire;

    @Column(name = "working_circuits", nullable = true)
    private Integer workingCircuits;
}
