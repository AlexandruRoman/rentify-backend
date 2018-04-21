package com.bestem.repository;

import com.bestem.model.Rezervare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Alex on 2/20/2018.
 */
@Component
public interface RezervareRepository extends JpaRepository<Rezervare, Long>{
}
