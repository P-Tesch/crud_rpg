package com.tesch.rpg.entities;

import com.tesch.rpg.enums.Alignment;
import com.tesch.rpg.enums.Organization;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "portrait")
    private Byte[] portrait;

    @Column(name = "description")
    private String description;

    @Column(name = "background")
    private String background;

    @Column(name = "creation_points")
    private Integer creationPoints;

    @Column(name = "alignment")
    private Alignment alignment;

    @Column(name = "organization")
    private Organization organization;
    
}
