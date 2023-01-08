package poc.modular.booking.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.modular.booking.db.entity.Booking;

import java.util.Optional;

@Repository
interface JpaBookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingId(String bookingId);

}
