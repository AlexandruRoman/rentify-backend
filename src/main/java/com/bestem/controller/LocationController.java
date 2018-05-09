package com.bestem.controller;

import com.bestem.model.Location;
import com.bestem.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/all")
    public List<Location> getAll(){
        return locationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Location get(@PathVariable final long id){
        return locationRepository.findOne(id);
    }

    @GetMapping("/parent/{id}")
    public Location getByParent(@PathVariable final long id){
        return locationRepository.findOne(id);
    }

    @PostMapping("/add")
    public Location add(@RequestBody final Location location){
        return locationRepository.save(location);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable final long id){
        locationRepository.delete(id);
    }
}
