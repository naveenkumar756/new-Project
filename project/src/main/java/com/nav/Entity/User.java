package com.nav.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="user_id")
	private int userid;
	@Column(name ="first_name")
	private String first_name;
	@Column(name="last_name")
	private String last_name;
	@Column(name="email")
	private String email;
	@Column (name ="passwordhash")
	private String passwordhash;
	@Column(name="phonenumber")
	private int phonenumber;
	@Column (name="created_at")
	private Date createdAt;
	@Column (name="updated_by")
	private Date updatedBy;
	@Column (name="is_active")
	private boolean isactive;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswordhash() {
		return passwordhash;
	}
	public void setPasswordhash(String passwordhash) {
		this.passwordhash = passwordhash;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Date updatedBy) {
		this.updatedBy = updatedBy;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	
	
	
	
}
