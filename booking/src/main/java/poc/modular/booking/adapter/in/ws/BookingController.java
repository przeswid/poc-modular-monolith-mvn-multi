package poc.modular.booking.adapter.in.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import poc.modular.booking.application.port.in.BookingService;
import poc.modular.booking.application.port.in.dto.BookingDto;

@RestController
@AllArgsConstructor
class BookingController {

    private final BookingService bookingService;

    @GetMapping("/booking/{bookingId}")
    BookingDto getBooking(@PathVariable String bookingId) {
        return bookingService.getBookingByBookingId(bookingId).orElse(null);
    }
}
