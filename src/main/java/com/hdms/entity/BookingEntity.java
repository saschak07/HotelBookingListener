package com.hdms.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hdms.dto.Guest;

@Entity
@Table(name="booking_details")
public class BookingEntity {
	@Id
	private String bookingId;
	private String userId;
	private String email;
	private String hotelId;
	private Date checkinDate;
	private Date checkoutDate;
	private String roomId;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
 	@JoinColumn(name = "booking_guest_ref_id" , nullable = true)
	private List<GuestEntity> guestDetails;
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
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public List<GuestEntity> getGuestDetails() {
		return guestDetails;
	}
	public void setGuestDetails(List<GuestEntity> guestDetails) {
		this.guestDetails = guestDetails;
	}
	
	
}
