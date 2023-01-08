package poc.modular.booking.application.port.out.db;

import poc.modular.booking.application.port.in.dto.BookingDto;

import java.util.Optional;

public interface BookingRepository {
    void saveBooking(BookingDto booking);

    Optional<BookingDto> getBookingByBookingId(String bookingId);
}
