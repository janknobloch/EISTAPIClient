package de.tum.jk.application.model;

import org.joda.time.DateTime;

import java.util.Date;

public class Feedback extends DataItem {

	public Feedback() {
	}

	public Feedback(String id, String text, DateTime date) {
		super(id,text,"Anon",date);
	}

}
