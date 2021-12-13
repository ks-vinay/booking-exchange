package com.ecabs.assignment.bequeue.util;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */
public interface DeleteBookingInput {
    String INPUT_NAME = "delete-booking-input";
    @Input(DeleteBookingInput.INPUT_NAME)
    SubscribableChannel input();
}
