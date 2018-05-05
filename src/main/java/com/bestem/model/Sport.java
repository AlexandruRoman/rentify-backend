package com.bestem.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Alex on 2/20/2018.
 */
@Entity
@Table(name = "sport")
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nume;

    @OneToMany(mappedBy = "sport")
    private Set<LegaturaLocatieSport> legaturiLocatieSport;

    public Sport(){}
    public Sport(String nume) {
        this.nume = nume;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Set<LegaturaLocatieSport> getLegaturiLocatieSport() {
        return legaturiLocatieSport;
    }

    public void setLegaturiLocatieSport(Set<LegaturaLocatieSport> legaturiLocatieSport) {
        this.legaturiLocatieSport = legaturiLocatieSport;
    }
}
