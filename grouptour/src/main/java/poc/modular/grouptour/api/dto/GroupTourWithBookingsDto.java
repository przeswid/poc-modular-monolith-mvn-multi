package poc.modular.grouptour.api.dto;

import lombok.Builder;
import lombok.Value;
import poc.modular.booking.api.dto.BookingDto;

import java.util.List;

@Value
@Builder
public class GroupTourWithBookingsDto {
    String groupIdentifier;
    List<BookingDto> bookings;

}
