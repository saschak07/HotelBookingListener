package com.hdms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.hdms.dto.BookingRequest;
import com.hdms.service.BookingStorageService;

@RestController
public class BookingDetailsController {

	@Autowired
	private BookingStorageService bookingStorageService;
	
	@GetMapping("/api/getBooking/{bookingId}")
	@ResponseBody
	public ResponseEntity<BookingRequest> getBookingDetails(@RequestParam String bookingId){
		BookingRequest bookingdetails = bookingStorageService.getBookingById(bookingId);
		
		return new ResponseEntity<BookingRequest>(bookingdetails, HttpStatus.OK);
	}
}
