package com.bestem.repository;

import com.bestem.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Alex on 2/20/2018.
 */
@Component
public interface SportRepository extends JpaRepository<Sport, Long>{
}
