package com.bestem.controller;

import com.bestem.model.Company;
import com.bestem.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private CompanyRepository companyRepository;

    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping("/all")
    public List<Company> getAll(){
        return companyRepository.findAll();
    }

    @GetMapping("/{id}")
    public Company get(@PathVariable final long id){
        return companyRepository.findOne(id);
    }

    @GetMapping("/parent/{id}")
    public List<Company> getByParent(@PathVariable final long id){
        return companyRepository.findAllByLocationId(id);
    }

    @PostMapping("/add")
    public Company add(@RequestBody final Company company){
        return companyRepository.save(company);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable final long id){
        companyRepository.delete(id);
    }
}
