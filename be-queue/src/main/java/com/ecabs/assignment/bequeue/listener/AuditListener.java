package com.ecabs.assignment.bequeue.listener;

import com.ecabs.assignment.bedblayer.dto.BookingDto;
import com.ecabs.assignment.bequeue.util.AuditInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */

@EnableBinding(AuditInput.class)
public class AuditListener {

    private static final Logger logger = LoggerFactory.getLogger(AuditListener.class);

    /**
     * @param bookingDto
     */
    @StreamListener(AuditInput.INPUT_NAME)
    public void consume(@Payload BookingDto bookingDto) {
        try {
            logger.info("Received Message to Audit {}", bookingDto);
        }catch (Exception e){
            logger.error("Failed to receive message from Audit queue - Stack message -{} - Stack trace - {}", e.getMessage(),e.getStackTrace());
        }
    }

}
