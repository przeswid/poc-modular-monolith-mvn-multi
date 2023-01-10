package poc.modular.grouptour.infrastructure.db;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import poc.modular.grouptour.infrastructure.db.dto.GroupTourDto;

import java.util.List;

@Component
@AllArgsConstructor
class GroupTourDataLoader implements ApplicationRunner {

    private final GroupTourRepository groupTourRepository;

    public void run(ApplicationArguments args) {
        groupTourRepository.saveGroupTour(GroupTourDto.builder()
                        .groupIdentifier("GROUP1")
                        .bookings(List.of("id1", "id2"))
                .build());
    }
}