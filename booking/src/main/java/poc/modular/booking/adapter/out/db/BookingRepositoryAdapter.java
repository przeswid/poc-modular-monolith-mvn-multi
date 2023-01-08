package poc.modular.booking.adapter.out.db;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import poc.modular.booking.adapter.out.db.enity.Booking;
import poc.modular.booking.application.port.in.dto.BookingDto;
import poc.modular.booking.application.port.out.db.BookingRepository;

import java.util.Optional;

@Component
@AllArgsConstructor
class BookingRepositoryAdapter implements BookingRepository {
    private final JpaBookingRepository jpaBookingRepository;

    @Override
    public void saveBooking(BookingDto booking) {
        Booking bookingPo = new Booking();
        bookingPo.setBookingId(booking.getBookingId());
        bookingPo.setBookingReference(booking.getBookingReference());
        bookingPo.setBookingVersion(booking.getBookingVersion());
        jpaBookingRepository.save(bookingPo);
    }

    @Override
    public Optional<BookingDto> getBookingByBookingId(String bookingId) {
        return jpaBookingRepository.findByBookingId(bookingId)
                .map(b -> BookingDto.builder()
                        .bookingId(b.getBookingId())
                        .bookingReference(b.getBookingReference())
                        .bookingVersion(b.getBookingVersion())
                        .build());
    }
}
