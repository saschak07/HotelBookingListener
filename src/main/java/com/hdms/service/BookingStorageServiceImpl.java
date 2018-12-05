package com.hdms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdms.dto.BookingRequest;
import com.hdms.entity.BookingEntity;
import com.hdms.repository.BookingRepository;
import com.hdms.util.BookingObjectMapper;

@Service
public class BookingStorageServiceImpl implements BookingStorageService{

	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	BookingObjectMapper objectMapper;
	@Override
	public void saveBookingDetails(BookingEntity bookingEntity) {
		// TODO Auto-generated method stub
		bookingRepository.save(bookingEntity);
	}
	@Override
	public BookingRequest getBookingById(String bookingId) {
		// TODO Auto-generated method stub
		return objectMapper.convertToDTO(bookingRepository.findByBookingId(bookingId));
	}

}
