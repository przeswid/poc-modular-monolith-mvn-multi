package poc.modular.booking.service;

import poc.modular.booking.dto.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();

    List<Booking> getAllBookingsByDepartureId(String departureId);
}
