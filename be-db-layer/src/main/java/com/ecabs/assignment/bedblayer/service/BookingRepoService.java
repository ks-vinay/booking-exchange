package com.ecabs.assignment.bedblayer.service;

import com.ecabs.assignment.bedblayer.domain.Booking;
import com.ecabs.assignment.bedblayer.dto.BookingDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookingRepoService {

    /**
     * @param bookingDto
     * @return int
     */
    int addNewBooking(BookingDto bookingDto);

    /**
     * @param bookingDto
     * @return int
     */
    int updateExistingBooking(BookingDto bookingDto);

    /**
     * @param bookingDto
     * @return int
     */
    int deleteBooking(BookingDto bookingDto);

    /**
     * @return
     */
    List<BookingDto> fetchBooking();

}
