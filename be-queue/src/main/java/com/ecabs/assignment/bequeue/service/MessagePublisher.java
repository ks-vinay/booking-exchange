package com.ecabs.assignment.bequeue.service;

import com.ecabs.assignment.bedblayer.dto.BookingDto;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */

public interface MessagePublisher {

     /**
      * @param booking
      */
     void sendMessage(BookingDto booking);


}
