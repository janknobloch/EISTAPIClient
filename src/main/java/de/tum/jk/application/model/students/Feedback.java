package de.tum.jk.application.model.students;

import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Entity;

import java.time.Instant;
import java.util.Date;

@Entity
public class Feedback extends DataItem {

	public Feedback() {
	}

	public Feedback(String text, Instant date, String inputSourceId, String inputSource) {
		super(text,"anonymous",date, inputSourceId, inputSource);
	}

}
