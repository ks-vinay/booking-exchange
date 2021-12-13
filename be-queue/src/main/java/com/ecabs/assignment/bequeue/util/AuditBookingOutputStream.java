package com.ecabs.assignment.bequeue.util;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */

public interface AuditBookingOutputStream {

    @Output("audit-booking-output")
    MessageChannel output();

}
