package de.tum.jk.application.model.students;

import lombok.Getter;
import lombok.Setter;

import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.time.Instant;
import java.util.Date;

/**
 * @author jan
 *
 */
@Entity
public abstract class DataItem {

	public static String INPUTSOURCE_SLACK = "SLACK";
	public static String INPUTSOURCE_WHATSAPP = "WHATSAPP";
	public static String INPUTSOURCE_SMS = "SMS";

	@Id
	@Getter
	@Setter
	protected String id = new ObjectId().toHexString();
	
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
	@Setter
	@Getter
	protected Instant date;

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

	public DataItem(String content, String author, Instant instant, String inputSourceId, String inputSource) {

		this.content = content;
		this.author = author;
		this.date = instant;
		this.inputSourceId = inputSourceId;
		this.inputSource = inputSource;
	}

	public void voteUp() {
		this.upvotes++;
	}

	public void voteDown() {
		this.upvotes--;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inputSourceId == null) ? 0 : inputSourceId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataItem other = (DataItem) obj;
		if (inputSourceId == null) {
			if (other.inputSourceId != null)
				return false;
		} else if (!inputSourceId.equals(other.inputSourceId))
			return false;
		return true;
	}

	
}
