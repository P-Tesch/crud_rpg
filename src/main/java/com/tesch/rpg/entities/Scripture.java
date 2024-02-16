package com.tesch.rpg.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "scriptures")
@Data
@Builder
public class Scripture {
    
    @Id
    @Column(name = "scripture_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_points")
    private Integer creationPoints;

    @Column(name = "remaining_scripture_points")
    private Integer remainingScripturePoints;

    @Column(name = "damage")
    private Integer damage;

    @Column(name = "range")
    private Integer range;

    @Column(name = "sharpness")
    private Integer sharpness;

    @Column(name = "double")
    private Boolean isDouble;

    @OneToMany(mappedBy = "scripture")
    private List<ScriptureAbility> abilities;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sheet_id", referencedColumnName = "sheet_id", nullable = false)
    private Sheet sheet;
}
