package com.ecabs.assignment.bedblayer.mapper;

import com.ecabs.assignment.bedblayer.domain.Booking;
import com.ecabs.assignment.bedblayer.domain.Waypoints;
import com.ecabs.assignment.bedblayer.dto.BookingDto;
import com.ecabs.assignment.bedblayer.dto.WayPointsDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */
@Component
public class BookingServiceMapper {

    public static List<BookingDto> convertToDto(List<Booking> bookings) {
        List<BookingDto> bookingDtos = new ArrayList<BookingDto>();
        for (Booking booking: bookings) {
            BookingDto bookingDto = new BookingDto();
            bookingDto.setId(booking.getId());
            bookingDto.setAsap(booking.isAsap());
            bookingDto.setModifiedOn(booking.getModifiedOn());
            bookingDto.setCreatedOn(booking.getCreatedOn());
            bookingDto.setRating(booking.getRating());
            bookingDto.setPrice(booking.getPrice());
            bookingDto.setNumberOfPassangers(booking.getNumberOfPassangers());
            bookingDto.setWaitingTime(booking.getWaitingTime());
            bookingDto.setPickUpTime(booking.getPickUpTime());
            bookingDto.setPassangerName(booking.getPassangerName());
            bookingDto.setPassangerContactNumber(booking.getPassangerContactNumber());
            if(null != booking.getWaypoints()) {
                WayPointsDto wayPointsDto = new WayPointsDto();
                wayPointsDto.setId(booking.getWaypoints().getId());
                wayPointsDto.setLatitude(booking.getWaypoints().getLatitude());
                wayPointsDto.setLongitude(booking.getWaypoints().getLongitude());
                wayPointsDto.setLocality(booking.getWaypoints().getLocality());
                bookingDto.setWayPointsDto(wayPointsDto);
            }
            bookingDtos.add(bookingDto);
        }
        return bookingDtos;
    }

    public static Booking convertToDomain(BookingDto bookingDto) {
            Booking booking = new Booking();
            booking.setId(bookingDto.getId());
            booking.setAsap(bookingDto.isAsap());
            booking.setModifiedOn(bookingDto.getModifiedOn());
            booking.setCreatedOn(bookingDto.getCreatedOn());
            booking.setRating(bookingDto.getRating());
            booking.setPrice(bookingDto.getPrice());
            booking.setNumberOfPassangers(bookingDto.getNumberOfPassangers());
            booking.setWaitingTime(bookingDto.getWaitingTime());
            booking.setPickUpTime(bookingDto.getPickUpTime());
            booking.setPassangerName(bookingDto.getPassangerName());
            booking.setPassangerContactNumber(bookingDto.getPassangerContactNumber());
            if(null != bookingDto.getWayPointsDto()) {
                Waypoints wayPoints = new Waypoints();
                wayPoints.setId(bookingDto.getWayPointsDto().getId());
                wayPoints.setLatitude(bookingDto.getWayPointsDto().getLatitude());
                wayPoints.setLongitude(bookingDto.getWayPointsDto().getLongitude());
                wayPoints.setLocality(bookingDto.getWayPointsDto().getLocality());
                wayPoints.setBooking(booking);
                booking.setWaypoints(wayPoints);
            }
        return booking;
    }
}
