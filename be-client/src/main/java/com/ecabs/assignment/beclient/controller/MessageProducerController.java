package com.ecabs.assignment.beclient.controller;

import com.ecabs.assignment.beclient.dto.MessageDto;
import com.ecabs.assignment.beclient.service.MessageExchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vinay ks
 * @created on 12/11/21
 * @project booking-exchange
 */

@RestController
public class MessageProducerController {

    private static final Logger logger = LoggerFactory.getLogger(MessageProducerController.class);

    @Autowired
    private MessageExchange messageExchange;

    /**
     * @param messageDto
     */
    @PostMapping("/processRequest")
    public void processRequest(@RequestBody MessageDto messageDto){
        logger.info("Sending message to Queues");
        try {
            messageExchange.sendMessageToBrokerExchange(messageDto);
        }catch(Exception e){
            logger.error("Failed to send message to queues for the BookingId {} - Stack message - {} - Stacktrace - {} ",messageDto.getBookingDto().getId(), e.getMessage(),e.getStackTrace());
        }
    }
}
