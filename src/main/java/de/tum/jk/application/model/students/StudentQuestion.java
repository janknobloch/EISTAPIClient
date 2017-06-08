package de.tum.jk.application.model.students;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Property;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class StudentQuestion extends DataItem {

	public static final String QUESTIONTYPE_CONTENT = "content";
	public static final String QUESTIONTYPE_GENERAL = "general";
	public static final String QUESTIONTYPE_EXERCISE = "exercise";

	@Property
	@Getter
	@Setter

	protected int slideSet;

	@Property
	@Getter
	@Setter
	protected int slide;

	@Property
	@Getter
	@Setter
	protected String slideURL;

	@Embedded
	@Getter
	@Setter
	private ArrayList<Reply> replies;

	@Embedded
	@Getter
	@Setter
	private Reply bestanswer;

	@Property
	@Getter
	@Setter
	private String refURL;

	@Property
	@Getter
	@Setter
	private int refSlideset;

	@Property
	@Getter
	@Setter
	private int refSlide;

	@Property
	@Getter
	@Setter
	private DateTime answerDate;

	@Property
	@Getter
	@Setter
	private String questionType;

	@Property
	@Getter
	@Setter
	private long timeToAnswer;

	public StudentQuestion(String text, String author, DateTime date, String inputSourceId, String inputSource) {
		super(text, author, date, inputSourceId, inputSource);
		this.date = date;
		this.replies = new ArrayList<Reply>();
		this.author = author;
		this.answerDate = new DateTime(0);
	}

	public StudentQuestion() {
	}

	public void addReply(Reply reply) {
		if (replies == null)
			replies = new ArrayList<Reply>();
		replies.add(reply);
	}

	public String summarize() {
		String summary = "Question: " + this.content + "\n" + "Context: SlideSet:" + slideSet + "Slide:" + slide
				+ "\nContext URL: " + slideURL + "\nVotes: " + upvotes;
		if (this.bestanswer != null) {
			summary = summary + "\nBest Answer: " + bestanswer.getContent();
		}
		if (this.refURL != null) {
			summary = summary + "\nReference URL: " + refURL + "\nReference SlideSet: " + refSlideset
					+ "\nReference Slide: " + refSlide;
		}
		return summary;
	}

	public void searchAndsetBestAnswer(String message_ts) {
		for (Reply r : replies) {
			if (r.getInputSourceId().equals(message_ts)) {
				bestanswer = r;
				Duration duration = new Duration(new DateTime(this.date), new DateTime(r.getDate()));
				timeToAnswer = duration.getStandardSeconds();

			}
		}
	}
}
