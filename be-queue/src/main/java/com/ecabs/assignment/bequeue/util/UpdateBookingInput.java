package com.ecabs.assignment.bequeue.util;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */
public interface UpdateBookingInput {
    String INPUT_NAME = "edit-booking-input";
    @Input(UpdateBookingInput.INPUT_NAME)
    SubscribableChannel input();
}
