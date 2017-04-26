package de.tum.jk.application.model.students;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Date;

@Entity
public abstract class DataItem {

	@Id
	@Getter
	@Setter
	protected String id;

	@Property
	@Getter
	@Setter
	protected String content;

	@Property
	@Getter
	@Setter
	protected String author;

	@Property
	@Setter
	protected String anonymousAuthor;

	@Property
	@Getter
	@Setter
	protected String date;

	@Property
	@Getter
	@Setter
	protected int upvotes;

	@Property
	@Getter
	@Setter
	private static boolean dev;

	public DataItem() {
	}

	public DataItem(String id, String content, String author, DateTime date) {
		generateID(id);
		this.content = content;
		this.author = author;
		this.date = date.toString();
	}

	public void voteUp() {
		this.upvotes++;
	}

	public void voteDown() {
		this.upvotes--;
	}

	private void generateID(String timestamp) {
		this.id = "slack_" + timestamp;
		if (dev) {
			this.id = "dev_" + this.id;
		}
	}
}