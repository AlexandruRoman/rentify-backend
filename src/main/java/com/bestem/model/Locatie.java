package com.bestem.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Alex on 2/20/2018.
 */
@Entity
@Table(name = "locatie")
public class Locatie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nume;

    @ManyToOne
    @JoinColumn(name = "id_companie")
    private Companie companie;

    @OneToMany(mappedBy = "locatie", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<LegaturaLocatieSport> legaturiLocatieSport;

    public Locatie(){}

    public Locatie(String nume, Companie companie) {
        this.nume = nume;
        this.companie = companie;
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

    public Companie getCompanie() {
        return companie;
    }

    public void setCompanie(Companie companie) {
        this.companie = companie;
    }

    public Set<LegaturaLocatieSport> getLegaturiLocatieSport() {
        return legaturiLocatieSport;
    }

    public void setLegaturiLocatieSport(Set<LegaturaLocatieSport> legaturiLocatieSport) {
        this.legaturiLocatieSport = legaturiLocatieSport;
    }
}
