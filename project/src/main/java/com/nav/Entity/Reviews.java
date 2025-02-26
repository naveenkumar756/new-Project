package com.nav.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Reviews_details")
public class Reviews {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Review_id")
	private int Review_id;
	@Column(name="User_id")
	private int User_id;
	@Column(name="Movie_id")
	private int Movie_id;
	@Column(name="Rating")
	private double Rating;
	@Column(name="Review_text")
	private String Review_text;
	@Column(name="Created_at")
	private Date CreatedAt;
	@Column(name="Updated_by")
	private Date UpdatedBy;

}
