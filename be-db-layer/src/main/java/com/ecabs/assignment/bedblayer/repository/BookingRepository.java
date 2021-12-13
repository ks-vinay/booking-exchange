package com.ecabs.assignment.bedblayer.repository;

import com.ecabs.assignment.bedblayer.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
