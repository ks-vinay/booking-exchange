package com.ecabs.assignment.bequeue.listener;

import com.ecabs.assignment.bedblayer.dto.BookingDto;
import com.ecabs.assignment.bedblayer.service.BookingRepoService;
import com.ecabs.assignment.bequeue.util.UpdateBookingInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */


@EnableBinding(UpdateBookingInput.class)
public class EditBookingListener {

    private static final Logger logger = LoggerFactory.getLogger(EditBookingListener.class);

    @Autowired
    BookingRepoService bookingRepoService;

    /**
     * @param bookingDto
     */
    @StreamListener(UpdateBookingInput.INPUT_NAME)
    public void consume(@Payload BookingDto bookingDto) {
        try {
            logger.info("Received Message to update Booking {}", bookingDto);
            bookingRepoService.updateExistingBooking(bookingDto);
        }catch (Exception e){
            logger.error("Failed to receive message from Delete booking queue - Stack message -{} - Stack trace - {}", e.getMessage(),e.getStackTrace());
        }
    }
}
