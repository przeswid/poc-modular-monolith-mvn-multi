package org.example.ws.controller;

import lombok.AllArgsConstructor;
import org.example.dto.Booking;
import org.example.service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
class BookingController {

    private final BookingService bookingService;

    @GetMapping("/booking")
    List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }
}
