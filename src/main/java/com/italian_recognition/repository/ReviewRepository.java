package com.italian_recognition.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.italian_recognition.domain.ReviewCard;

@Repository
public class ReviewRepository {

	private Integer idCounter = 0;
	private ArrayList<ReviewCard> reviewCards = new ArrayList<>();
	
	
	private ArrayList<String> reviewList;
	
	
	public ArrayList<ReviewCard> fetchAllReviewCards() {
		if(reviewCards.size() == 0) {
			ReviewCard review1 = new ReviewCard();
			review1.setReviewId(idCounter++);
			review1.setTitle("Tony's service");
			review1.setRating(0);
			review1.setDescription("Tony provides an excellent service with care and precision, meeting all your italian citizenship needs");
			
			//Needs work
			/*
			 * reviewList.add("Can't believe they don't cahrge more!");
			 * reviewList.add("Can't believe it's not butter!");
			 * review1.setReviews(reviewList);
			 */
			reviewCards.add(review1);
		}
		return reviewCards;
	}
		
	

}
