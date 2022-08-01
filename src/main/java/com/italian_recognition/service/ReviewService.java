package com.italian_recognition.service;

import java.util.ArrayList;
import java.util.Optional;

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
	
	public ReviewCard fetchReviewCard(Integer reviewId) {
		ReviewCard reviewCard = reviewRepo.findReviewId(reviewId);
		return reviewCard;
	}


	public ReviewCard createReviewCard(ReviewCard reviewCard) {
		//to check if the card has been updated
		Integer reviewId = reviewCard.getReviewId();
		reviewCard = reviewRepo.save(reviewCard);
		
		if(!(reviewCard.getReviewId() == reviewId)) {
			return null;
		}
		else
			return reviewCard;
		
	}


	public ReviewCard updateReviewCard(Integer id, ReviewCard reviewCard) {
		
		Optional<ReviewCard> reviewOpt = reviewRepo.fetchAllReviewCards()
				.stream()
				.filter(item -> item.getReviewId().equals(id))
				.findAny();
		
		
		if (reviewOpt.isPresent()) {
			ReviewCard item = reviewOpt.get();
			item.setTitle(reviewCard.getTitle());
			item.setDescription(reviewCard.getDescription());
			item.setReviewId(reviewCard.getReviewId());
			item.setRating(reviewCard.getRating());
			
			return item;
		}
		return null;
		
	}

}
 