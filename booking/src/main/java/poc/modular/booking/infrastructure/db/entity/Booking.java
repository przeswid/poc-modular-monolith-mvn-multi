package poc.modular.booking.infrastructure.db.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_booking", schema = "booking")
@Data
@NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_booking_generator")
    @SequenceGenerator(
            name = "seq_booking_generator",
            sequenceName = "seq_booking",
            allocationSize = 1
    )
    private Long id;

    @Column(name = "booking_reference")
    private String bookingReference;

    @Column(name = "booking_id")
    private String bookingId;

    @Column(name = "booking_version")
    private int bookingVersion;
}
