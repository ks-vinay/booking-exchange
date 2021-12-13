package com.ecabs.assignment.bequeue.service.impl;

import com.ecabs.assignment.bedblayer.dto.BookingDto;
import com.ecabs.assignment.bequeue.service.MessagePublisher;
import com.ecabs.assignment.bequeue.util.AuditBookingOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @author vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */

@Service
@EnableBinding(AuditBookingOutputStream.class)
public class AuditMessageProducer implements MessagePublisher {

    private static final Logger logger = LoggerFactory.getLogger(AuditMessageProducer.class);

    @Autowired
    private AuditBookingOutputStream auditBookingOutputStream;

    /**
     * @param booking
     */
    @Override
    public void sendMessage(BookingDto booking) {
        try {
            auditBookingOutputStream.output().send(MessageBuilder.withPayload(booking).build());
        }catch(Exception e){
            logger.error("Failed to send message to Audit queue -Stack message -{} - Stacktrace - {}", e.getMessage(), e.getStackTrace());
        }
    }
}
