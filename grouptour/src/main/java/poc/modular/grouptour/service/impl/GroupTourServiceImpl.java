package poc.modular.grouptour.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import poc.modular.booking.service.BookingService;
import poc.modular.grouptour.dto.GroupTour;
import poc.modular.grouptour.service.GroupTourService;

@Service
@AllArgsConstructor
class GroupTourServiceImpl implements GroupTourService {

    private final BookingService bookingService;

    @Override
    public GroupTour getGroupTourByIdentifier(String identifier) {
        return GroupTour.builder()
                .groupIdentifier(identifier)
                .bookings(bookingService.getAllBookingsByDepartureId(identifier))
                .build();
    }
}
