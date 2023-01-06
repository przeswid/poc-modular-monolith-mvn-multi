package org.example.service.impl;

import org.example.dto.Booking;
import org.example.service.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class BookingServiceImpl implements BookingService {
    @Override
    public List<Booking> getAllBookings() {
        return List.of(Booking.builder()
                .bookingId("1")
                .bookingVersion(1)
                .bookingReference("qwtrui2673").build());
    }

    @Override
    public List<Booking> getAllBookingsByDepartureId(String departureId) {
        return List.of(Booking.builder()
                        .bookingId("1")
                        .bookingVersion(1)
                        .bookingReference("qwtrui2673").build(),
                Booking.builder()
                        .bookingId("2")
                        .bookingVersion(1)
                        .bookingReference("qufodj34785").build()
        );
    }
}
