package de.tum.jk.application.model.presenter;

import org.mongodb.morphia.annotations.Entity;

import lombok.Getter;
import lombok.Setter;


public class VoteItem {
	@Getter
	@Setter
	String answer;
	@Getter
	@Setter
	Integer numberOfVotes;
	@Getter
	@Setter
	boolean correctAnswer;

	public VoteItem() {
	}

	public VoteItem(String answer, Integer numberOfVotes, boolean correctAnswer) {
		
		this.answer = answer;
		this.numberOfVotes = numberOfVotes;
		this.correctAnswer = correctAnswer;
	}

}
