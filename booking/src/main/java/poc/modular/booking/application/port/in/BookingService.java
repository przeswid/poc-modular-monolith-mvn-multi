package poc.modular.booking.application.port.in;

import poc.modular.booking.application.port.in.dto.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();

    List<Booking> getAllBookingsByDepartureId(String departureId);
}
