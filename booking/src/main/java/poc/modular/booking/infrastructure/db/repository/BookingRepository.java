package poc.modular.booking.infrastructure.db.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import poc.modular.booking.api.dto.BookingDto;
import poc.modular.booking.infrastructure.db.entity.Booking;

import java.util.Optional;

@Component
@AllArgsConstructor
public class BookingRepository {
    private final JpaBookingRepository jpaBookingRepository;

    public void saveBooking(BookingDto booking) {
        Booking bookingPo = new Booking();
        bookingPo.setBookingId(booking.getBookingId());
        bookingPo.setBookingReference(booking.getBookingReference());
        bookingPo.setBookingVersion(booking.getBookingVersion());
        jpaBookingRepository.save(bookingPo);
    }

    public Optional<BookingDto> getBookingByBookingId(String bookingId) {
        return jpaBookingRepository.findByBookingId(bookingId)
                .map(b -> BookingDto.builder()
                        .bookingId(b.getBookingId())
                        .bookingReference(b.getBookingReference())
                        .bookingVersion(b.getBookingVersion())
                        .build());
    }
}
