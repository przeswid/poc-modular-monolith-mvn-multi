package poc.modular.grouptour.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import poc.modular.booking.api.BookingService;
import poc.modular.booking.api.dto.BookingDto;
import poc.modular.grouptour.api.GroupTourService;
import poc.modular.grouptour.api.dto.GroupTourWithBookingsDto;
import poc.modular.grouptour.db.GroupTourRepository;
import poc.modular.grouptour.db.dto.GroupTourDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
class GroupTourServiceImpl implements GroupTourService {

    private final BookingService bookingService;

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
