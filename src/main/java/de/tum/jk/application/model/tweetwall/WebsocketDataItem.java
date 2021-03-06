package de.tum.jk.application.model.tweetwall;

import lombok.Getter;
import lombok.Setter;

public class WebsocketDataItem {

	public static final String STUDENT_QUESTION = "student-question";
	public static final String TEACHER_QUESTION = "teacher-question";
	public static final String ADMIN_ANSWER = "admin-answer";
	public static final String STUDENT_QUESTION_ARRAY = "student-question-array";
	
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
	public WebsocketDataItem() {
		
	}
	
}
