package org.example.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Booking {
    String bookingId;
    int bookingVersion;
    String bookingReference;
}
