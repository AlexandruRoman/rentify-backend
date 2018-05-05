package com.bestem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Alex on 2/20/2018.
 */
@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private NumeRol nume;

    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
    private Set<User> users;

    public Rol(){}

    public Rol(NumeRol nume) {
        this.nume = nume;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public NumeRol getNume() {
        return nume;
    }

    public void setNume(NumeRol nume) {
        this.nume = nume;
    }

    @JsonIgnore
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
