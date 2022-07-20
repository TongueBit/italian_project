package com.italian_recognition.domain;

import java.util.ArrayList;

public class ReviewCard {
	
	private int reviewId;
	private String title;
	private float rating;
	private String description;
	private ArrayList<String> reviews;
	
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ArrayList<String> getReviews() {
		return reviews;
	}
	//does not work, throws http 500 error
	public void setReviews(ArrayList arr) {
		reviews.addAll(arr);
	}

	
	
}
