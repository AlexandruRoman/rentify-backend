package com.bestem.controller;

import com.bestem.model.Sport;
import com.bestem.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sport")
public class SportController {

    SportRepository sportRepository;

    public SportController(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }

    @GetMapping("/all")
    public List<Sport> getAll(){
        return sportRepository.findAll();
    }

    @GetMapping("/{id}")
    public Sport get(@PathVariable final long id){
        return sportRepository.findOne(id);
    }

    @GetMapping("/parent/{id}")
    public List<Sport> getByParent(@PathVariable final long id){
        return sportRepository.findAllByCompanyId(id);
    }

    @PostMapping("/add")
    public Sport add(@RequestBody final Sport sport){
        return sportRepository.save(sport);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable final long id){
        sportRepository.delete(id);
    }
}
