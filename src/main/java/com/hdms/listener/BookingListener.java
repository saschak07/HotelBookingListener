package com.hdms.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hdms.dto.BookingRequest;
import com.hdms.service.BookingStorageService;
import com.hdms.util.BookingObjectMapper;

@Component
public class BookingListener {
	
	private final String quename = "hdms.booking.queue";
	@Value("${message.exchange}")
	private String exchange;
	@Value("${message.routingKey}")
	private String routingKey;
	
	@Autowired
	BookingStorageService bookingStorageService;
	@Autowired
	BookingObjectMapper bookingMapper;
	
	
	Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@RabbitListener(queues = quename)
	public void processBooking(BookingRequest bookingRequest) {
		bookingStorageService.saveBookingDetails(bookingMapper.convertToEntity(bookingRequest));
		
	}
	
}
