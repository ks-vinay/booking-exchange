package com.ecabs.assignment.beclient.service;

import com.ecabs.assignment.beclient.dto.MessageDto;
import org.springframework.stereotype.Service;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */

@Service
public interface MessageBrokerExchange {

    /**
     * @param messageDto
     */
    void processMessage(MessageDto messageDto);

    /**
     * @param messageDto
     */
    void auditMessage(MessageDto messageDto);

}
