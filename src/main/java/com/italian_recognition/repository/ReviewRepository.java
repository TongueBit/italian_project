package com.italian_recognition.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.italian_recognition.domain.ReviewCard;

@Repository
public class ReviewRepository {

	private Integer idCounter = 0;
	private ArrayList<ReviewCard> reviewCards = new ArrayList<>();
	
	public ArrayList<ReviewCard> fetchAllReviewCards() {
		if(reviewCards.size() == 0) {
			
			ReviewCard review1 = new ReviewCard();
			review1.setReviewId(idCounter++);
			review1.setTitle("Tonys service");
			review1.setRating(0);
			review1.setDescription("Tony provides an excellent service with care and precision, meeting all your italian citizenship needs");
			review1.setReviews("Cant believe they dont cahrge more!");
			review1.setReviews("Shit this muthafucka good!");
			
			 
			reviewCards.add(review1);
			
			ReviewCard review2 = new ReviewCard();
			review2.setReviewId(idCounter++);
			review2.setTitle("Andreas service");
			review2.setRating(0);
			review2.setDescription("Andrea is the best");
			review2.setReviews("What the");
			review2.setReviews("Wow!");
			reviewCards.add(review2);
			
			return reviewCards;
		}
		else
			return reviewCards;
	}
		
	public ReviewCard save(ReviewCard reviewCard) {
		reviewCard.setReviewId(idCounter++);
		reviewCards.add(reviewCard);
		
		return reviewCard;
	}

	public ReviewCard findReviewId(Integer reviewId) {
		ReviewCard reviewCard = reviewCards.get(reviewId);
		return reviewCard;
	}
	

}
