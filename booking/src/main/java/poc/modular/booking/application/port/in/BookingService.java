package poc.modular.booking.application.port.in;

import poc.modular.booking.application.port.in.dto.BookingDto;

import java.util.Optional;

public interface BookingService {
    Optional<BookingDto> getBookingByBookingId(String bookingId);
}