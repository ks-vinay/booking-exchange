package com.ecabs.assignment.bequeue.service.impl;

import com.ecabs.assignment.bedblayer.dto.BookingDto;
import com.ecabs.assignment.bequeue.service.MessagePublisher;
import com.ecabs.assignment.bequeue.util.EditBookingOutputStream;
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
@EnableBinding(EditBookingOutputStream.class)
public class EditBookingProducer implements MessagePublisher {

    private static final Logger logger = LoggerFactory.getLogger(EditBookingProducer.class);

    @Autowired
    EditBookingOutputStream editBookingOutputStream;

    /**
     * @param booking
     */
    @Override
    public void sendMessage(BookingDto booking) {
        try {
            this.editBookingOutputStream.output().send(new GenericMessage<>(booking));
            logger.info("Message Successfully Published to update booking queue ");
        }catch(Exception e){
            logger.error("Failed to send message to update booking queue -Stack message -{} - Stacktrace - {}", e.getMessage(), e.getStackTrace());
        }
    }
}
