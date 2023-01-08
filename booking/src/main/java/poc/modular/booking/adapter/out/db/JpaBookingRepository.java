package poc.modular.booking.adapter.out.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.modular.booking.adapter.out.db.enity.Booking;

import java.util.Optional;

@Repository
interface JpaBookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingId(String bookingId);

}
