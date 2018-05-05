package com.bestem.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alex on 2/20/2018.
 */
@Entity
@Table(name = "rezervare")
public class Rezervare {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long idLegatura;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    private Date start;

    private Date end;

    public Rezervare(){}

    public Rezervare(long idLegatura, User user, Date start, Date end) {
        this.idLegatura = idLegatura;
        this.user = user;
        this.start = start;
        this.end = end;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdLegatura() {
        return idLegatura;
    }

    public void setIdLegatura(long idLegatura) {
        this.idLegatura = idLegatura;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
