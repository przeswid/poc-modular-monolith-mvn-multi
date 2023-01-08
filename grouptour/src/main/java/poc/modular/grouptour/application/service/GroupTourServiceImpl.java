package poc.modular.grouptour.application.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import poc.modular.booking.application.port.in.dto.BookingDto;
import poc.modular.grouptour.application.port.in.ws.GroupTourService;
import poc.modular.grouptour.application.port.in.ws.dto.GroupTourWithBookingsDto;
import poc.modular.grouptour.application.port.out.booking.BookingExternalService;
import poc.modular.grouptour.application.port.out.db.GroupTourRepository;
import poc.modular.grouptour.application.port.out.db.dto.GroupTourDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
class GroupTourServiceImpl implements GroupTourService {

    private final BookingExternalService bookingService;

    private final GroupTourRepository groupTourRepository;

    @Override
    public GroupTourWithBookingsDto getGroupTourByIdentifier(String identifier) {
        GroupTourDto groupTourByIdentifier = groupTourRepository.getGroupTourByIdentifier(identifier).orElse(null);
        List<BookingDto> bookings = groupTourByIdentifier.getBookings()
                .stream()
                .map(bookingService::getBookingByBookingId)
                .map(b -> b.orElse(null))
                .collect(Collectors.toList());

        return GroupTourWithBookingsDto.builder()
                .groupIdentifier(groupTourByIdentifier.getGroupIdentifier())
                .bookings(bookings)
                .build();
    }
}
