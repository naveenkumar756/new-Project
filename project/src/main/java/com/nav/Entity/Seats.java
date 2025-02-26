package com.nav.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Seats_details")
public class Seats {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Seat_id")
private int Seat_id;
@Column(name="Showtime_id")
private int Showtime_id;
@Column(name="Seatnumber_id")
private String Seatnumber_id;
@Column(name="Seat_type")
private String Seat_type;
@Column(name="Availability")
private String Availability;
@Column(name="Created_at")
private Date CreatedAt;
@Column(name="Updated_by")
private Date UpdatedBy;
	

}
