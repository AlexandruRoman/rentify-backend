package com.bestem.model;

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

    private String nume;

    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
    private Set<User> users;

    public Rol(String nume) {
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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
