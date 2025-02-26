package com.nav.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Payment_details")

public class Payment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Payment_id")
private int Payment_id;
@Column(name="Booking_id")
private int Booking_id;
@Column(name="Payment_method")
private String Payment_method;
@Column(name="Amount")
private int Amount;
@Column(name="Payment_date")
private Date Payment_date;
@Column(name="Status")
private String Status;
public int getPayment_id() {
	return Payment_id;
}
public void setPayment_id(int payment_id) {
	Payment_id = payment_id;
}
public int getBooking_id() {
	return Booking_id;
}
public void setBooking_id(int booking_id) {
	Booking_id = booking_id;
}
public String getPayment_method() {
	return Payment_method;
}
public void setPayment_method(String payment_method) {
	Payment_method = payment_method;
}
public int getAmount() {
	return Amount;
}
public void setAmount(int amount) {
	Amount = amount;
}
public Date getPayment_date() {
	return Payment_date;
}
public void setPayment_date(Date payment_date) {
	Payment_date = payment_date;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
}
