package com.bestem.model;

import javax.persistence.*;

/**
 * Created by Alex on 2/20/2018.
 */
@Entity
@Table(name = "legatura_locatie_sport")
public class LegaturaLocatieSport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nume;

    @ManyToOne
    @JoinColumn(name = "id_sport")
    private Sport sport;

    @ManyToOne
    @JoinColumn(name = "id_locatie")
    private Locatie locatie;

    private long nrLocuri;

    public LegaturaLocatieSport(){}
    public LegaturaLocatieSport(String nume, Sport sport, Locatie locatie, long nrLocuri) {
        this.nume = nume;
        this.sport = sport;
        this.locatie = locatie;
        this.nrLocuri = nrLocuri;
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

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }

    public long getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(long nrLocuri) {
        this.nrLocuri = nrLocuri;
    }
}
