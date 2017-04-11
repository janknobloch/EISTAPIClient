package de.tum.jk.application.model;

import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Entity;

import java.util.Date;

@Entity
public class Feedback extends DataItem {

	public Feedback() {
	}

	public Feedback(String id, String text, DateTime date) {
		super(id,text,"anonymous",date);
	}

}
