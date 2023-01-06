package poc.modular.booking.adapter.in.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import poc.modular.booking.application.port.in.BookingService;
import poc.modular.booking.application.port.in.dto.Booking;

import java.util.List;

@RestController
@AllArgsConstructor
class BookingController {

    private final BookingService bookingService;

    @GetMapping("/booking")
    List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }
}
