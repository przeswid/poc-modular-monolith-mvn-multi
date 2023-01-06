package poc.modular.grouptour.application.port.in.ws;

import poc.modular.grouptour.application.port.in.ws.dto.GroupTour;

public interface GroupTourService {
    GroupTour getGroupTourByIdentifier(String identifier);
}
