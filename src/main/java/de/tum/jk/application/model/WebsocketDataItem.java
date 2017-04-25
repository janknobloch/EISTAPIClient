package de.tum.jk.application.model.tweetwall;

import lombok.Getter;
import lombok.Setter;

public class WebsocketDataItem {

	public static final String QUESTION = "question";
	public static final String QUIZ_SINGLE = "quiz-single";
	public static final String QUIZ_MULTI = "quiz-multi";
	
	@Getter
	@Setter
	String type;
	
	@Getter
	@Setter
	Object content;
	public WebsocketDataItem(String type, Object content) {
		super();
		this.type = type;
		this.content = content;
	}
	
	
}
