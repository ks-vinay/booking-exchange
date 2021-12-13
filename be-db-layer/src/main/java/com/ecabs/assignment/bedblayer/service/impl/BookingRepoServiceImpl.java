package com.ecabs.assignment.bedblayer.service.impl;

import com.ecabs.assignment.bedblayer.domain.Booking;
import com.ecabs.assignment.bedblayer.dto.BookingDto;
import com.ecabs.assignment.bedblayer.mapper.BookingServiceMapper;
import com.ecabs.assignment.bedblayer.repository.BookingRepository;
import com.ecabs.assignment.bedblayer.service.BookingRepoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */
@Service
public class BookingRepoServiceImpl implements BookingRepoService {

    private static final Logger logger = LoggerFactory.getLogger(BookingRepoServiceImpl.class);

    @Autowired
    private BookingRepository bookingReository;

    /**
     * @param bookingDto booking dto
     * @return int
     */
    @Override
    public int addNewBooking(BookingDto bookingDto) {
        try{
            Booking book = bookingReository.save(BookingServiceMapper.convertToDomain(bookingDto));
            System.out.println("Booking ID "+book.getId());
        }catch (Exception e){
            logger.error("Failed to save new booking - Exception Message - {} - Exception Stack {} - ", e.getMessage(), e.getStackTrace());
            return -1;
        }
        return 1;
    }

    /**
     * @param bookingDto
     * @return int
     */
    @Override
    public int updateExistingBooking(BookingDto bookingDto) {
        try{
            Optional<Booking> bookingDb = bookingReository.findById(bookingDto.getId());
            if(bookingDb.isPresent()) {
                bookingReository.save(bookingDb.get());
            }
        }catch (Exception e){
            logger.error("Failed while saving booking during update for bookingId {} - Exception Message - {} - Exception Stack {} - ", bookingDto.getId(), e.getMessage(), e.getStackTrace());
            return -1;
        }
        return 1;
    }

    /**
     * @param bookingDto
     * @return int
     */
    @Override
    public int deleteBooking(BookingDto bookingDto) {
        try{
            bookingReository.delete(BookingServiceMapper.convertToDomain(bookingDto));
        }catch (Exception e){
            logger.error("Failed to delete existing booking for bookingId {} - Exception Message - {} - Exception Stack {} - ", bookingDto.getId(), e.getMessage(), e.getStackTrace());
            return -1;
        }
        return 1;
    }

    /**
     * @return List
     */
    @Override
    public List<BookingDto> fetchBooking() {
        return BookingServiceMapper.convertToDto(bookingReository.findAll());
    }
}
