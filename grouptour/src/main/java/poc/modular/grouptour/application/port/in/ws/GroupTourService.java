package poc.modular.grouptour.application.port.in.ws;

import poc.modular.grouptour.application.port.in.ws.dto.GroupTourWithBookingsDto;

public interface GroupTourService {
    GroupTourWithBookingsDto getGroupTourByIdentifier(String identifier);
}
