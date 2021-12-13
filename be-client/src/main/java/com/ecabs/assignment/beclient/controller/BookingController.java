package com.ecabs.assignment.beclient.controller;

import com.ecabs.assignment.beclient.service.BookingService;
import com.ecabs.assignment.bedblayer.dto.BookingDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author vinay ks
 * @created on 12/11/21
 * @project booking-exchange
 */

@RestController
public class BookingController {

    private static final Logger logger = LoggerFactory.getLogger(BookingController.class);

    @Autowired
    private BookingService bookingService;


    /**
     * Return a list of Booking Objects
     * @return List
     */
    @GetMapping("/fetchBooking")
    public List<BookingDto> fetchBooking(){
        return bookingService.fetchBooking();
    }
}
