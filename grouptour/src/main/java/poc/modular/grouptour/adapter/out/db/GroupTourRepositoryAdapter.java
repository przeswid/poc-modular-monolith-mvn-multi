package poc.modular.grouptour.adapter.out.db;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import poc.modular.grouptour.adapter.out.db.entity.GroupTour;
import poc.modular.grouptour.application.port.out.db.GroupTourRepository;
import poc.modular.grouptour.application.port.out.db.dto.GroupTourDto;

import java.util.Optional;


@Component
@RequiredArgsConstructor
class GroupTourRepositoryAdapter implements GroupTourRepository {

    private final JpaGroupTourRepository jpaGroupTourRepository;

    @Override
    public Optional<GroupTourDto> getGroupTourByIdentifier(String groupIdentifier) {
        return jpaGroupTourRepository.findByGroupIdentifier(groupIdentifier)
                .map(g -> GroupTourDto.builder()
                .groupIdentifier(g.getGroupIdentifier())
                .bookings(g.getBookings())
                .build());
    }

    @Override
    public void saveGroupTour(GroupTourDto groupTourDto) {
        GroupTour groupTour = new GroupTour();
        groupTour.setGroupIdentifier(groupTourDto.getGroupIdentifier());
        groupTour.setBookings(groupTourDto.getBookings());

        jpaGroupTourRepository.save(groupTour);
    }
}
