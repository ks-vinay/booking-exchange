package com.ecabs.assignment.bequeue.util;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */
public interface AuditInput {

    String INPUT_NAME = "audit-booking-input";
    @Input(AuditInput.INPUT_NAME)
    SubscribableChannel input();

}
