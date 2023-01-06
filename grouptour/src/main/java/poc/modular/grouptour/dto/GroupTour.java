package poc.modular.grouptour.dto;

import lombok.Builder;
import lombok.Value;
import poc.modular.booking.dto.Booking;

import java.util.List;

@Value
@Builder
public class GroupTour {
    String groupIdentifier;
    List<Booking> bookings;
}
