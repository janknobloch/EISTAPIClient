package de.tum.jk.application.model;

import org.joda.time.DateTime;

import java.util.Date;

public class Reply extends DataItem {

	public Reply() {

	}

	public Reply(String id, String text, String author) {
		super(id,text,author,new DateTime());
	}

}
