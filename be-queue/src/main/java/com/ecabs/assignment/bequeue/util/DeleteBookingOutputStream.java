package com.ecabs.assignment.bequeue.util;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */
public interface DeleteBookingOutputStream {

    @Output("delete-booking-output")
    MessageChannel output();

}
