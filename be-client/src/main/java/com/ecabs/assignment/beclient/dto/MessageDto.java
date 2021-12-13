package com.ecabs.assignment.beclient.dto;

import com.ecabs.assignment.bedblayer.dto.BookingDto;
import org.springframework.stereotype.Component;

/**
 * @author vks@lowes.com
 * @created on 12/11/21
 * @project booking-exchange
 */

@Component
public class MessageDto {
    private String eventType;
    private BookingDto bookingDto;

    /**
     * @return String
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * @return BookingDto
     */
    public BookingDto getBookingDto() {
        return bookingDto;
    }

    /**
     * @param bookingDto
     */
    public void setBookingDto(BookingDto bookingDto) {
        this.bookingDto = bookingDto;
    }
}
