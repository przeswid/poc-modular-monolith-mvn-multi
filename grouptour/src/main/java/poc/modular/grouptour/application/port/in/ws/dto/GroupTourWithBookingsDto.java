package poc.modular.grouptour.application.port.in.ws.dto;

import lombok.Builder;
import lombok.Value;
import poc.modular.booking.application.port.in.dto.BookingDto;

import java.util.List;

@Value
@Builder
public class GroupTourWithBookingsDto {
    String groupIdentifier;
    List<BookingDto> bookings;

}
