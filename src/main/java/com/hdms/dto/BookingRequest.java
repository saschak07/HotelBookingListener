package com.hdms.dto;

import java.util.Date;
import java.util.List;

public class BookingRequest {

	private String bookingId;
	private String userId;
	private String email;
	private String hotelId;
	private String roomId;
	private Date checkinDate;
	private Date checkoutDate;
	private List<Guest> guestDetails;
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public Date getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public List<Guest> getGuestDetails() {
		return guestDetails;
	}
	public void setGuestDetails(List<Guest> guestDetails) {
		this.guestDetails = guestDetails;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	
	
	
}
