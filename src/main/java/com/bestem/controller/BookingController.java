package com.bestem.controller;

import com.bestem.model.Booking;
import com.bestem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/all")
    public List<Booking> getAll(){
        return bookingRepository.findAll();
    }

    @GetMapping("/{id}")
    public Booking get(@PathVariable final long id){
        return bookingRepository.findOne(id);
    }

    @GetMapping("/parent/{id}")
    public List<Booking> getByParent(@PathVariable final long id){
        return bookingRepository.findAllByIdSport(id);
    }

    @GetMapping("/user/{id}")
    public List<Booking> getByUser(@PathVariable final long id){
        return bookingRepository.findAllByIdUser(id);
    }

    @PostMapping("/add")
    public Booking add(@RequestBody final Booking booking){
        return bookingRepository.save(booking);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable final long id){
        bookingRepository.delete(id);
    }
}
