package org.example.service;

import org.example.dto.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();

    List<Booking> getAllBookingsByDepartureId(String departureId);
}
