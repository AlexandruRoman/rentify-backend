package com.bestem.repository;

import com.bestem.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Created by Alex on 2/20/2018.
 */
@Component
public interface BookingRepository extends JpaRepository<Booking, Long>{
    List<Booking> findAllBySportId(long id);
    List<Booking> findAllByUserId(long id);
    Optional<Booking> findById(Long id);
}
