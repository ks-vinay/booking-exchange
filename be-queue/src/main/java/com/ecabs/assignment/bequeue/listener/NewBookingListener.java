package com.ecabs.assignment.bequeue.listener;

import com.ecabs.assignment.bedblayer.dto.BookingDto;
import com.ecabs.assignment.bedblayer.service.BookingRepoService;
import com.ecabs.assignment.bequeue.util.NewBookingInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */

@EnableBinding(NewBookingInput.class)
@Component
public class NewBookingListener {

    private static final Logger logger = LoggerFactory.getLogger(NewBookingListener.class);

    @Autowired
    BookingRepoService bookingService;

    /**
     * @param bookingDto
     */
    @StreamListener(NewBookingInput.INPUT)
    public void consume(@Payload BookingDto bookingDto) {
        try {
            logger.info("Received Message to create new Booking {}", bookingDto);
            bookingService.addNewBooking(bookingDto);
        }catch (Exception e){
            logger.error("Failed to receive message from Delete booking queue - Stack message -{} - Stack trace - {}", e.getMessage(),e.getStackTrace());
        }
    }

}
