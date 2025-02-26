package com.nav.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Booking_details")
public class Booking {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Column(name="Booking_id")
private int Booking_id;
@Column(name="user_id")
private int user_id;
@Column(name="Showtime_id")
private String Showtime_id;
@Column(name="Total_amount")
private String Total_amount;
@Column(name="Status")
private String Status;
@Column(name="Created_at")
private Date CreatedAt;
@Column(name="Updated_by")
private Date UpdatedBy;
public int getBooking_id() {
	return Booking_id;
}
public void setBooking_id(int booking_id) {
	Booking_id = booking_id;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getShowtime_id() {
	return Showtime_id;
}
public void setShowtime_id(String showtime_id) {
	Showtime_id = showtime_id;
}
public String getTotal_amount() {
	return Total_amount;
}
public void setTotal_amount(String total_amount) {
	Total_amount = total_amount;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public Date getCreatedAt() {
	return CreatedAt;
}
public void setCreatedAt(Date createdAt) {
	CreatedAt = createdAt;
}
public Date getUpdatedBy() {
	return UpdatedBy;
}
public void setUpdatedBy(Date updatedBy) {
	UpdatedBy = updatedBy;
}
}
