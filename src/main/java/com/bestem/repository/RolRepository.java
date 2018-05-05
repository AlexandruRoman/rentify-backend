package com.bestem.repository;

import com.bestem.model.NumeRol;
import com.bestem.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by Alex on 2/20/2018.
 */
@Component
public interface RolRepository extends JpaRepository<Rol, Long>{
    Optional<Rol> findByNume(NumeRol nume);
}
