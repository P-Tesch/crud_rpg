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
@Table(name = "stats")
@Builder
@Data
public class Stats {
    
    @Id
    @Column(name = "stats_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "strength", nullable = false)
    private Integer strength;

    @Column(name = "dexterity", nullable = false)
    private Integer dexterity;

    @Column(name = "agility", nullable = false)
    private Integer agility;

    @Column(name = "endurance", nullable = false)
    private Integer endurance;

    @Column(name = "charisma", nullable = false)
    private Integer charisma;

    @Column(name = "perception", nullable = false)
    private Integer perception;

    @Column(name = "inteligence", nullable = false)
    private Integer inteligence;

    @Column(name = "class", nullable = false)
    private Integer classStat;
}
