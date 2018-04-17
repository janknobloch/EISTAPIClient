package de.tum.jk.application.model.students;

import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Entity;

import java.time.Instant;
import java.util.Date;

@Entity
public class Reply extends DataItem {

	public Reply() {

	}

	public Reply(String text, String author, String inputSourceId, String inputSource, String slackChannel) {
		super(text,author,DateTime.now(),inputSourceId,inputSource, slackChannel);
	}

}
