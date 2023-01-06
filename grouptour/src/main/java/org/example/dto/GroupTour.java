package org.example.dto;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class GroupTour {
    String groupIdentifier;
    List<Booking> bookings;
}
