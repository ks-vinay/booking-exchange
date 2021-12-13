package com.ecabs.assignment.beclient.service;

import com.ecabs.assignment.beclient.dto.MessageDto;
import com.ecabs.assignment.beclient.util.Constants;
import com.ecabs.assignment.bequeue.service.impl.AuditMessageProducer;
import com.ecabs.assignment.bequeue.service.impl.DeleteBookingProducer;
import com.ecabs.assignment.bequeue.service.impl.EditBookingProducer;
import com.ecabs.assignment.bequeue.service.impl.NewBookingProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */

@Service
public class BookingHandler implements MessageBrokerExchange {

    private static final Logger logger = LoggerFactory.getLogger(BookingHandler.class);

    @Autowired
    NewBookingProducer newBookingProducer;

    @Autowired
    EditBookingProducer editBookingProducer;

    @Autowired
    DeleteBookingProducer deleteBookingProducer;

    @Autowired
    AuditMessageProducer auditMessageProducer;

    /**
     * @param messageDto
     */
    public void processMessage(MessageDto messageDto){
        logger.info("Message processed for the bookingId {}", messageDto.getBookingDto().getId());
        if(Constants.NEW.equalsIgnoreCase(messageDto.getBookingDto().getType())){
            newBookingProducer.sendMessage(messageDto.getBookingDto());
        }else if(Constants.UPDATE.equalsIgnoreCase(messageDto.getBookingDto().getType())){
            editBookingProducer.sendMessage(messageDto.getBookingDto());
        }else if(Constants.DELETE.equalsIgnoreCase(messageDto.getBookingDto().getType())){
            deleteBookingProducer.sendMessage(messageDto.getBookingDto());
        }
    }

    /**
     * @param messageDto
     */
    @Override
    public void auditMessage(MessageDto messageDto) {
        auditMessageProducer.sendMessage(messageDto.getBookingDto());
    }
}
