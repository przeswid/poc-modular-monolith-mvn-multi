package poc.modular.booking.ws.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import poc.modular.booking.service.BookingService;
import poc.modular.booking.dto.Booking;

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
