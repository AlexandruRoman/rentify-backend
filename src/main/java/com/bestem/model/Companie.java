package com.bestem.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by Alex on 2/20/2018.
 */
@Entity
@Table(name = "companie")
public class Companie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String nume;

    @OneToMany(mappedBy = "companie", cascade = CascadeType.ALL)
    private Set<Locatie> locatii;

    public Companie(String nume) {
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

    public Set<Locatie> getLocatii() {
        return locatii;
    }

    public void setLocatii(Set<Locatie> locatii) {
        this.locatii = locatii;
    }

    @Override
    public String toString() {
        return "Companie{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", locatii=" + locatii +
                '}';
    }
}
