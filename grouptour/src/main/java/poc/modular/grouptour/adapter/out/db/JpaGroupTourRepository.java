package poc.modular.grouptour.adapter.out.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.modular.grouptour.adapter.out.db.entity.GroupTour;

import java.util.Optional;

@Repository
interface JpaGroupTourRepository extends JpaRepository<GroupTour, Long> {

    Optional<GroupTour> findByGroupIdentifier(String groupIdentifier);

}
