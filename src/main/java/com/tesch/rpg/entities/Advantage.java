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
@Table(name = "advantages")
@Builder
@Data
public class Advantage {
    
    @Id
    @Column(name = "advantages")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "level", nullable = true)
    private Integer level;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sheet_id", referencedColumnName = "sheet_id", nullable = false)
    private Sheet sheet;
}
