package poc.modular.grouptour.adapter.out.booking;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import poc.modular.booking.application.port.in.BookingService;
import poc.modular.booking.application.port.in.dto.Booking;
import poc.modular.grouptour.application.port.out.booking.BookingExternalService;

import java.util.List;

@Component
@AllArgsConstructor
class BookingInMemoryService implements BookingExternalService {

    private final BookingService bookingService;

    @Override
    public List<Booking> getAllBookingsByDepartureId(String departureId) {
        return bookingService.getAllBookingsByDepartureId(departureId);
    }
}
