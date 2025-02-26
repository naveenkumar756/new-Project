package com.nav.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="Movies_details")
	public class Movies {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name ="movie_id")
		private int movie_id;
		@Column(name ="title")
		private String title;
		@Column(name="description")
		private String description;
		@Column(name="releaseDate")
		private Date releaseDate;
		@Column (name ="duration")
		private int duration;
		@Column(name="genre")
		private String genre;
		@Column(name="language")
		private String language;
		@Column (name="rating")
		private int rating;
		@Column (name="created_at")
		private Date createdAt;
		@Column (name="updated_by")
		private Date updatedBy;
		public int getMovie_id() {
			return movie_id;
		}
		public void setMovie_id(int movie_id) {
			this.movie_id = movie_id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Date getReleaseDate() {
			return releaseDate;
		}
		public void setReleaseDate(Date releaseDate) {
			this.releaseDate = releaseDate;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
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
		
		
		
}
