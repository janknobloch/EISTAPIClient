package de.tum.jk.application.model.students;

import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Entity;

import java.util.Date;

@Entity
public class Reply extends DataItem {

	public Reply() {

	}

	public Reply(String id, String text, String author, String inputSourceId, String inputSource) {
		super(text,author,new DateTime(),inputSourceId,inputSource);
	}

}
