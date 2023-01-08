package poc.modular.grouptour.api;

import poc.modular.grouptour.api.dto.GroupTourWithBookingsDto;

public interface GroupTourService {
    GroupTourWithBookingsDto getGroupTourByIdentifier(String identifier);
}
