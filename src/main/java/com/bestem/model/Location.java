package com.bestem.model;

import javax.persistence.*;

/**
 * Created by Alex on 2/20/2018.
 */
@Entity
@Table(name = "locatie")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String avatar;

    public Location(){}

    public Location(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
