package com.ecabs.assignment.beclient.service;

import com.ecabs.assignment.bedblayer.dto.BookingDto;
import com.ecabs.assignment.bedblayer.service.BookingRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepoService bookingRepoService;

    /**
     * @return List
     */
    public List<BookingDto> fetchBooking() {
        return bookingRepoService.fetchBooking();
    }
}
