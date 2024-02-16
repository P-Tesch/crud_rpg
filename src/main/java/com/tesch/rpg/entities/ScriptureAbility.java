package com.tesch.rpg.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "scripture_abilities")
@Data
@Builder
public class ScriptureAbility {
    
    @Id
    @Column(name = "scripture_ability_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "level")
    private Integer level;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "scripture_id", referencedColumnName = "scripture_id", nullable = false)
    private Scripture scripture;
}
