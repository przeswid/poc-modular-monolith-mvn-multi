package org.example.service.impl;

import lombok.AllArgsConstructor;
import org.example.dto.GroupTour;
import org.example.service.BookingService;
import org.example.service.GroupTourService;
import org.springframework.stereotype.Service;

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
