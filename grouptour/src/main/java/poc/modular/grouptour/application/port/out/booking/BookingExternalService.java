package poc.modular.grouptour.application.port.out.booking;

import poc.modular.booking.application.port.in.dto.BookingDto;

import java.util.Optional;

public interface BookingExternalService {
    Optional<BookingDto> getBookingByBookingId(String bookingId);


}
