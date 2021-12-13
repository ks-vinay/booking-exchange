package com.ecabs.assignment.bequeue.service.impl;

import com.ecabs.assignment.bedblayer.dto.BookingDto;
import com.ecabs.assignment.bequeue.service.MessagePublisher;
import com.ecabs.assignment.bequeue.util.NewBookingOuputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */

@Service
@EnableBinding(NewBookingOuputStream.class)
public class NewBookingProducer implements MessagePublisher {

    private static final Logger logger = LoggerFactory.getLogger(NewBookingProducer.class);

    @Autowired
    private NewBookingOuputStream newBookingOuputStream;

    /**
     * @param booking
     */
    @Override
    public void sendMessage(BookingDto booking) {
        try {
            newBookingOuputStream.output().send(MessageBuilder.withPayload(booking).build());
            logger.info("Message Successfully Published to new booking queue ");
        }catch(Exception e){
            logger.error("Failed to send message to new booking queue -Stack message -{} - Stacktrace - {}", e.getMessage(), e.getStackTrace());
        }
    }
}
