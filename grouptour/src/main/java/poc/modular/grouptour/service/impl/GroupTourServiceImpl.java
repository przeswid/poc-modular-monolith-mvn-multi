package poc.modular.grouptour.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import poc.modular.booking.dto.Booking;
import poc.modular.booking.service.BookingService;
import poc.modular.grouptour.dto.GroupTour;
import poc.modular.grouptour.service.GroupTourService;

import java.util.List;

@Service
@AllArgsConstructor
class GroupTourServiceImpl implements GroupTourService {

    private final BookingService bookingService;

    @Override
    public GroupTour getGroupTourByIdentifier(String identifier) {
        List<Booking> bookings = bookingService.getAllBookingsByDepartureId(identifier);
        return GroupTour.builder()
                .groupIdentifier(identifier)
                .bookings(bookings)
                .build();
    }
}
