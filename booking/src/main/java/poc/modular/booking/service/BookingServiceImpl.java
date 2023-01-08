package poc.modular.booking.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import poc.modular.booking.api.BookingService;
import poc.modular.booking.api.dto.BookingDto;
import poc.modular.booking.db.repository.BookingRepository;

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
