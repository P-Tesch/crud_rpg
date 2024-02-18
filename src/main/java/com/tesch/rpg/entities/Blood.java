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
@Table(name = "bloods")
@Data
@Builder
public class Blood {
    
    @Id
    @Column(name = "blood_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "impulses")
    private String impulses;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stats_id", referencedColumnName = "stats_id", nullable = false)
    private Stats stats;

    @OneToMany(mappedBy = "blood")
    private List<BloodAbility> bloodAbilities;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sheet_id", referencedColumnName = "sheet_id", nullable = false)
    private Sheet sheet;
}
