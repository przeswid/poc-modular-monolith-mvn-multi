package poc.modular.grouptour.adapter.out.booking;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import poc.modular.booking.application.port.in.BookingService;
import poc.modular.booking.application.port.in.dto.BookingDto;
import poc.modular.grouptour.application.port.out.booking.BookingExternalService;

import java.util.Optional;

@Component
@AllArgsConstructor
class BookingServiceAsInternalModule implements BookingExternalService {

    private final BookingService bookingService;

    @Override
    public Optional<BookingDto> getBookingByBookingId(String bookingId) {
        return bookingService.getBookingByBookingId(bookingId);
    }
}
