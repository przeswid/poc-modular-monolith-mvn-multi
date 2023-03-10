package poc.modular.grouptour.infrastructure.db.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GroupTourDto {
    String groupIdentifier;
    List<String> bookings;
}
