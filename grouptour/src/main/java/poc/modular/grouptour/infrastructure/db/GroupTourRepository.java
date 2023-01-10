package poc.modular.grouptour.infrastructure.db;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import poc.modular.grouptour.infrastructure.db.dto.GroupTourDto;
import poc.modular.grouptour.infrastructure.db.entity.GroupTour;

import java.util.Optional;


@Component
@RequiredArgsConstructor
public class GroupTourRepository {

    private final JpaGroupTourRepository jpaGroupTourRepository;

    public Optional<GroupTourDto> getGroupTourByIdentifier(String groupIdentifier) {
        return jpaGroupTourRepository.findByGroupIdentifier(groupIdentifier)
                .map(g -> GroupTourDto.builder()
                .groupIdentifier(g.getGroupIdentifier())
                .bookings(g.getBookings())
                .build());
    }

    public void saveGroupTour(GroupTourDto groupTourDto) {
        GroupTour groupTour = new GroupTour();
        groupTour.setGroupIdentifier(groupTourDto.getGroupIdentifier());
        groupTour.setBookings(groupTourDto.getBookings());

        jpaGroupTourRepository.save(groupTour);
    }
}
