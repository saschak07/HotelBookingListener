package com.hdms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import com.hdms.entity.BookingEntity;

public interface BookingRepository extends CrudRepository<BookingEntity, String>{
	
	public BookingEntity findByBookingId(String bookingId);

}
