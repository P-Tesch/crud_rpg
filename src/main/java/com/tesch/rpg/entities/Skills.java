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
@Table(name = "skills")
@Builder
@Data
public class Skills {
    
    @Id
    @Column(name = "skills_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "speed", nullable = false)
    private Integer speed;

    @Column(name = "acrobatics", nullable = false)
    private Integer acrobatics;

    @Column(name = "melee", nullable = false)
    private Integer melee;
    
    @Column(name = "intimidation", nullable = false)
    private Integer intimidation;

    @Column(name = "ranged", nullable = false)
    private Integer ranged;

    @Column(name = "stealth", nullable = false)
    private Integer stealth;

    @Column(name = "conscience", nullable = false)
    private Integer conscience;

    @Column(name = "investigation", nullable = false)
    private Integer investigation;

    @Column(name = "wisdom", nullable = false)
    private Integer wisdom;

    @Column(name = "knowledge", nullable = false)
    private Integer knowledge;

    @Column(name = "medicine", nullable = false)
    private Integer medicine;

    @Column(name = "survival", nullable = false)
    private Integer survival;

    @Column(name = "tenacity", nullable = false)
    private Integer tenacity;

    @Column(name = "diplomacy", nullable = false)
    private Integer diplomacy;

    @Column(name = "insight", nullable = false)
    private Integer insight;
}
