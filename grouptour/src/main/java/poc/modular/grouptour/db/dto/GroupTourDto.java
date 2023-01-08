package poc.modular.grouptour.db.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GroupTourDto {
    String groupIdentifier;
    List<String> bookings;
}
