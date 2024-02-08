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
    @Column(name = "stat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "strength")
    private Integer strength;

    @Column(name = "dexterity")
    private Integer dexterity;

    @Column(name = "agility")
    private Integer agility;

    @Column(name = "endurance")
    private Integer endurance;

    @Column(name = "charisma")
    private Integer charisma;

    @Column(name = "perception")
    private Integer perception;

    @Column(name = "inteligence")
    private Integer inteligence;

    @Column(name = "class")
    private Integer classStat;
}
