package de.tum.jk.application.model.students;

import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Entity;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;

@Entity
public class AdminAnswer {

	@Getter
	@Setter
	String answer;
	@Getter
	@Setter
	String author;
	@Getter
	@Setter
	String questionId;
	@Getter
	@Setter
	String questionInputSourceId;
	@Getter
	@Setter
	String slackChannel;

	public AdminAnswer() {

	}

	public AdminAnswer(String answer, String author, String questionId, String questionInputSourceId, String slackChannel) {
		super();
		this.answer = answer;
		this.author = author;
		this.questionId = questionId;
		this.questionInputSourceId = questionInputSourceId;
		this.slackChannel = slackChannel;
	}

	

}
