package poc.modular.booking.application.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import poc.modular.booking.application.port.in.BookingService;
import poc.modular.booking.application.port.in.dto.BookingDto;
import poc.modular.booking.application.port.out.db.BookingRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Override
    public Optional<BookingDto> getBookingByBookingId(String bookingId) {
        return bookingRepository.getBookingByBookingId(bookingId);
    }

}
