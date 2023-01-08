package poc.modular.booking.api;

import poc.modular.booking.api.dto.BookingDto;

import java.util.Optional;

public interface BookingService {
    Optional<BookingDto> getBookingByBookingId(String bookingId);
}
