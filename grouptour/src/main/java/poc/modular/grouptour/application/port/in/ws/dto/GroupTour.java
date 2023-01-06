package poc.modular.grouptour.application.port.in.ws.dto;

import lombok.Builder;
import lombok.Value;
import poc.modular.booking.application.port.in.dto.Booking;

import java.util.List;

@Value
@Builder
public class GroupTour {
    String groupIdentifier;
    List<Booking> bookings;
}
