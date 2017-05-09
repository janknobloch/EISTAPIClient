package de.tum.jk.application.model.students;

import lombok.Getter;
import lombok.Setter;

import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Date;

@Entity
public abstract class DataItem {

	public static String INPUTSOURCE_SLACK = "SLACK";
	public static String INPUTSOURCE_WHATSAPP = "WHATSAPP";
	public static String INPUTSOURCE_SMS = "SMS";

	@Id
	@Getter
	@Setter
	ObjectId id;
	
	@Property
	@Getter
	@Setter
	protected String content;

	@Property
	@Getter
	@Setter
	protected String author;

	@Property
	@Getter
	@Setter
	protected String displayName;

	@Property
	@Getter
	@Setter
	protected boolean botUser;

	@Property
	@Setter
	@Getter
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
	protected String inputSourceId;

	@Property
	@Getter
	@Setter
	protected String inputSource;

	public DataItem() {
	}

	public DataItem(String content, String author, DateTime date, String inputSourceId, String inputSource) {

		this.content = content;
		this.author = author;
		this.date = date.toString();
		this.inputSourceId = inputSourceId;
		this.inputSource = inputSource;
	}

	public void voteUp() {
		this.upvotes++;
	}

	public void voteDown() {
		this.upvotes--;
	}

}
