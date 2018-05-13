package com.bestem.service;

import com.bestem.model.Booking;
import com.bestem.model.BookingStatus;
import com.bestem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public void accept(@PathVariable final long id) {
        Optional<Booking> optionalBooking = bookingRepository.findById(id);
        Booking booking;
        if (optionalBooking.isPresent()) {
            booking = optionalBooking.get();
            booking.setStatus(BookingStatus.ACCEPTED);
            bookingRepository.save(booking);
        }
    }
}
