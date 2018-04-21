package com.bestem.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Alex on 2/20/2018.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nume;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Rezervare> rezervari;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

    public User(String nume, Set<Rezervare> rezervari, Rol rol) {
        this.nume = nume;
        this.rezervari = rezervari;
        this.rol = rol;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Set<Rezervare> getRezervari() {
        return rezervari;
    }

    public void setRezervari(Set<Rezervare> rezervari) {
        this.rezervari = rezervari;
    }
}
