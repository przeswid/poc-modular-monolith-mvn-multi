package poc.modular.booking.infrastructure.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.modular.booking.infrastructure.db.entity.Booking;

import java.util.Optional;

@Repository
interface JpaBookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingId(String bookingId);

}
