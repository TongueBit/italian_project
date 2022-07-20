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

	
	public ArrayList<ReviewCard> fetchAllTodoItems() {
		ArrayList<ReviewCard> reviewCards = reviewRepo.fetchAllReviewCards();
		return reviewCards;
	}

}
 