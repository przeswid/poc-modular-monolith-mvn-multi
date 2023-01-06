package poc.modular.grouptour.service;

import poc.modular.grouptour.dto.GroupTour;

public interface GroupTourService {
    GroupTour getGroupTourByIdentifier(String identifier);
}
