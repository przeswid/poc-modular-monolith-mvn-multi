package poc.modular.booking.application;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import poc.modular.booking.application.port.in.dto.BookingDto;
import poc.modular.booking.application.port.out.db.BookingRepository;

@Component
@AllArgsConstructor
class BookingInitDataLoader implements ApplicationRunner {

    private final BookingRepository bookingRepository;

    public void run(ApplicationArguments args) {
        bookingRepository.saveBooking(BookingDto.builder()
                .bookingId("id1")
                .bookingReference("qweri2783u")
                .bookingVersion(1)
                .build());

        bookingRepository.saveBooking(BookingDto.builder()
                .bookingId("id2")
                .bookingReference("vfgui23438")
                .bookingVersion(5)
                .build());
    }
}