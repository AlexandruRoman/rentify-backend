package com.bestem.repository;

import com.bestem.model.RoleName;
import com.bestem.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by Alex on 2/20/2018.
 */
@Component
public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(RoleName name);
}
