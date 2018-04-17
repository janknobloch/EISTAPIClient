package de.tum.jk.application.model.students;

import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Entity;

import java.time.Instant;
import java.util.Date;

@Entity
public class Feedback extends DataItem {

	public Feedback() {
	}

	public Feedback(String text, DateTime date, String inputSourceId, String inputSource, String slackChannel) {
		super(text,"anonymous",date, inputSourceId, inputSource, slackChannel);
	}

}
