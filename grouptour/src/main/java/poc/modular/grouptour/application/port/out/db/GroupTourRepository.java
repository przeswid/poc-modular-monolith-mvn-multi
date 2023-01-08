package poc.modular.grouptour.application.port.out.db;

import poc.modular.grouptour.application.port.out.db.dto.GroupTourDto;

import java.util.Optional;

public interface GroupTourRepository {
    Optional<GroupTourDto> getGroupTourByIdentifier(String groupIdentifier);

    void saveGroupTour(GroupTourDto groupTour);
}
