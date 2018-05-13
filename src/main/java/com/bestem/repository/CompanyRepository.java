package com.bestem.repository;

import com.bestem.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Alex on 2/20/2018.
 */
@Component
public interface CompanyRepository extends JpaRepository<Company, Long>{
    List<Company> findAllByLocationId(long id);
}
