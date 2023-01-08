package poc.modular.booking.api.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class BookingDto {
    String bookingId;
    int bookingVersion;
    String bookingReference;
}
