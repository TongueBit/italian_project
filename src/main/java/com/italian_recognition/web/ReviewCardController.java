package com.italian_recognition.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.italian_recognition.domain.ReviewCard;
import com.italian_recognition.service.ReviewService;



@RestController
@CrossOrigin( origins = "http://localhost:3000")
public class ReviewCardController {
	//The controller is somewhat similar and unexciting amongst most web applications, the services or model is where it gets fun

	//http://localhost:8080
	
	/*front-end		java server
		httpRequest --> controller --> service --> repository
		then back again
	 */
	
	@Autowired
	private ReviewService reviewService;
	
	//fetch all
	@GetMapping("/api/reviewCards")
	public ResponseEntity<?> fetchAllReviewItems() {
		
		List<ReviewCard> reviewCards = reviewService.fetchAllReviewCards();
		
		return ResponseEntity.status(HttpStatus.OK).body(reviewCards);
	}
	
	@GetMapping("/api/reviewCards/{reviewId}")
	public ResponseEntity<?> fetchReviewCard(@PathVariable Integer reviewId) {
		
		System.out.println(reviewId);
		ReviewCard reviewCard = reviewService.fetchReviewCard(reviewId);
		
		return ResponseEntity.status(HttpStatus.OK).body(reviewCard);
	}
	
	//works but cannot send a list in POST request for "reviews"
	@PostMapping("/api/reviewCards")
	public ResponseEntity<?> createNewReviewCard(@RequestBody ReviewCard reviewCard) {
		System.out.println(reviewCard);
		reviewCard = reviewService.createReviewCard(reviewCard);
		
		return ResponseEntity.ok(reviewCard);
		
	}
	
	@PutMapping("/api/reviewCards/{id}")
	public ResponseEntity<?> updateTodoItem(@PathVariable Integer id, @RequestBody ReviewCard reviewCard) {
		ReviewCard updatedReviewCard = reviewService.updateReviewCard(id, reviewCard);
		
		return ResponseEntity.ok(updatedReviewCard);
	}
		
}






