package com.ecabs.assignment.bequeue.util;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */

public interface NewBookingInput {
    String INPUT = "input";
    @Input(NewBookingInput.INPUT)
    SubscribableChannel input();
}
