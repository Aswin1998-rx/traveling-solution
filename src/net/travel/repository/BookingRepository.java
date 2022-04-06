package net.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.travel.entity.Booking;

@Repository("bookingrepository")
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
