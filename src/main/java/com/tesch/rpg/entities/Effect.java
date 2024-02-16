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
@Table(name = "effects")
@Data
@Builder
public class Effect {
    
    @Id
    @Column(name = "effect_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "remaining_turns")
    private Integer remainingTurns;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sheet_id", referencedColumnName = "sheet_id", nullable = true)
    private Sheet sheet;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id", referencedColumnName = "sheet_id", nullable = true)
    private Item item;
}
