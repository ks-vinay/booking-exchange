package com.ecabs.assignment.bequeue.service.impl;

import com.ecabs.assignment.bedblayer.dto.BookingDto;
import com.ecabs.assignment.bequeue.service.MessagePublisher;
import com.ecabs.assignment.bequeue.util.DeleteBookingOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */

@Service
@EnableBinding(DeleteBookingOutputStream.class)
public class DeleteBookingProducer implements MessagePublisher {

    private static final Logger logger = LoggerFactory.getLogger(DeleteBookingProducer.class);

    @Autowired
    DeleteBookingOutputStream deleteBookingOutputStream;

    /**
     * @param booking
     */
    @Override
    public void sendMessage(BookingDto booking) {
        try {
            this.deleteBookingOutputStream.output().send(new GenericMessage<>(booking));
            logger.info("Message Successfully Published to delete booking queue ");
        }catch(Exception e){
            logger.error("Failed to send message to delete booking queue -Stack message -{} - Stacktrace - {}", e.getMessage(), e.getStackTrace());
        }
    }
}
