package com.tesch.rpg.entities;

import com.tesch.rpg.enums.Alignment;
import com.tesch.rpg.enums.Organization;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sheets")
@Builder
@Data
public class Sheet {

    @Id
    @Column(name = "sheet_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "portrait", nullable = false)
    private Byte[] portrait;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "background", nullable = false)
    private String background;

    @Column(name = "creation_points", nullable = false)
    private Integer creationPoints;

    @Column(name = "alignment", nullable = true)
    private Alignment alignment;

    @Column(name = "organization", nullable = true)
    private Organization organization;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stats_id", referencedColumnName = "stats_id", nullable = false)
    private Stats stats;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "skills_id", referencedColumnName = "skills_id", nullable = false)
    private Skills skills;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "attributes_id", referencedColumnName = "attributes_id", nullable = false)
    private Attributes attributes;
}
