package poc.modular.grouptour.infrastructure.db.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_GROUP_TOUR", schema = "grouptour")
@Data
@NoArgsConstructor
public class GroupTour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_group_tour_generator")
    @SequenceGenerator(
            name = "seq_group_tour_generator",
            sequenceName = "seq_group_tour",
            allocationSize = 1
    )
    private Long id;

    private String groupIdentifier;

    @ElementCollection
    private List<String> bookings;
}
