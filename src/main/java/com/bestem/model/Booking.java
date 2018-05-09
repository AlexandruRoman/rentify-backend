package com.bestem.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alex on 2/20/2018.
 */
@Entity
@Table(name = "rezervare")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long idSport;
    private long idUser;
    private Date start;
    private Date end;
    private BookingStatus status;

    public Booking(){}

    public Booking(long idSport, long idUser, Date start, Date end) {
        this.idSport = idSport;
        this.idUser = idUser;
        this.start = start;
        this.end = end;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getIdSport() {
        return idSport;
    }

    public void setIdSport(long idSport) {
        this.idSport = idSport;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}
