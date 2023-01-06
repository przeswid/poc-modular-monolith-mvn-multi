package poc.modular.grouptour.application.port.out.booking;

import poc.modular.booking.application.port.in.dto.Booking;

import java.util.List;

public interface BookingExternalService {
    List<Booking> getAllBookingsByDepartureId(String departureId);
}
