package com.hdms.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.hdms.dto.BookingRequest;
import com.hdms.entity.BookingEntity;

@Component
public class BookingObjectMapper extends ModelMapper {

	public BookingEntity convertToEntity(BookingRequest bookingRequest) {
		BookingEntity bookingEntity = super.map(bookingRequest, BookingEntity.class);
		return bookingEntity;
	}
	
	public BookingRequest convertToDTO(BookingEntity bookingEntity) {
		BookingRequest bookingDto = super.map(bookingEntity, BookingRequest.class);
		return bookingDto;
	}
}
