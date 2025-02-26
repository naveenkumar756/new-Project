package com.nav.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Showtimes_details")
public class Showtimes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Showtimes_id")
private int Showtimes_id;
@Column(name="Movie_id")
private int Movie_id;
@Column(name="Theater_id")
private int Theater_id;
@Column(name="Start_time")
private int Start_time;
@Column(name="End_time")
private int End_time;
@Column(name="Available_seats")
private int Available_seats;
@Column(name="Created_at")
private Date CreatedAt;
@Column(name="updated_By")
private Date updatedBy;
public int getShowtimes_id() {
	return Showtimes_id;
}
public void setShowtimes_id(int showtimes_id) {
	Showtimes_id = showtimes_id;
}
public int getMovie_id() {
	return Movie_id;
}
public void setMovie_id(int movie_id) {
	Movie_id = movie_id;
}
public int getTheater_id() {
	return Theater_id;
}
public void setTheater_id(int theater_id) {
	Theater_id = theater_id;
}
public int getStart_time() {
	return Start_time;
}
public void setStart_time(int start_time) {
	Start_time = start_time;
}
public int getEnd_time() {
	return End_time;
}
public void setEnd_time(int end_time) {
	End_time = end_time;
}
public int getAvailable_seats() {
	return Available_seats;
}
public void setAvailable_seats(int available_seats) {
	Available_seats = available_seats;
}
public Date getCreatedAt() {
	return CreatedAt;
}
public void setCreatedAt(Date createdAt) {
	CreatedAt = createdAt;
}
public Date getUpdatedBy() {
	return updatedBy;
}
public void setUpdatedBy(Date updatedBy) {
	this.updatedBy = updatedBy;
}
}
