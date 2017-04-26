package de.tum.jk.application.model.tweetwall;

import lombok.Getter;
import lombok.Setter;

public class WebsocketDataItem {

	public static final String STUDENT_QUESTION = "student-question";
	public static final String TEACHER_QUESTION = "teacher-question";
	
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
