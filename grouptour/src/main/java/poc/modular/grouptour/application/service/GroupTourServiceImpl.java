package poc.modular.grouptour.application.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import poc.modular.grouptour.application.port.in.ws.GroupTourService;
import poc.modular.grouptour.application.port.in.ws.dto.GroupTour;
import poc.modular.grouptour.application.port.out.booking.BookingExternalService;

@Service
@AllArgsConstructor
class GroupTourServiceImpl implements GroupTourService {

    private final BookingExternalService bookingService;

    @Override
    public GroupTour getGroupTourByIdentifier(String identifier) {
        return GroupTour.builder()
                .groupIdentifier(identifier)
                .bookings(bookingService.getAllBookingsByDepartureId(identifier))
                .build();
    }
}
