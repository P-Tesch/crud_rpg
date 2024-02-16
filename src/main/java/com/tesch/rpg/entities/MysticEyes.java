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
@Table(name = "mystic_eyes")
@Data
@Builder
public class MysticEyes {
    
    @Id
    @Column(name = "mystic_eye_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "passive")
    private String passive;

    @Column(name = "active")
    private String active;

    @Column(name = "cooldown")
    private Integer cooldown;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sheet_id", referencedColumnName = "sheet_id", nullable = false)
    private Sheet sheet;
}
