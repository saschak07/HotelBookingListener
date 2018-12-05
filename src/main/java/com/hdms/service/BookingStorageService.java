package com.hdms.service;

import com.hdms.dto.BookingRequest;
import com.hdms.entity.BookingEntity;

public interface BookingStorageService {
	public void saveBookingDetails(BookingEntity bookingEntity);

	public BookingRequest getBookingById(String bookingId);
}
