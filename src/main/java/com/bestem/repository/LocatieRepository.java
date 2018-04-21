package com.bestem.repository;

import com.bestem.model.Locatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Alex on 2/20/2018.
 */
@Component
public interface LocatieRepository extends JpaRepository<Locatie, Long>{
}
