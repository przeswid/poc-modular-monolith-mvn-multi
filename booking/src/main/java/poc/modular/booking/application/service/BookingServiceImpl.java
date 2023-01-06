package poc.modular.booking.application.service;

import org.springframework.stereotype.Service;
import poc.modular.booking.application.port.in.BookingService;
import poc.modular.booking.application.port.in.dto.Booking;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
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
