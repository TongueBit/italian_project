package com.italian_recognition.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.italian_recognition.domain.ReviewCard;
import com.italian_recognition.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired //inject
	private ReviewRepository reviewRepo;

	
	public ArrayList<ReviewCard> fetchAllReviewCards() {
		ArrayList<ReviewCard> reviewCards = reviewRepo.fetchAllReviewCards();
		return reviewCards;
	}


	public ReviewCard createReviewCard() {
		ReviewCard reviewCard = new ReviewCard();
		reviewCard = reviewRepo.save(reviewCard);
		
		return reviewCard;
		
	}


	public ReviewCard updateReviewCard(Integer id, ReviewCard reviewCard) {
		// TODO Auto-generated method stub
		return null;
	}

}
 