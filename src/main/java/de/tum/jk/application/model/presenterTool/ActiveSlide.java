package de.tum.jk.application.model.presenterTool;

import lombok.Getter;
import lombok.Setter;

public class ActiveSlide {

	public static String SLIDETYPE_PPT = "ppt";
	public static String SLIDETYPE_KEY = "key";
	public static String SLIDETYPE_DEV = "dev";

	public ActiveSlide() {

	}

	public ActiveSlide(String activeSlide, String slideType) {
		super();
		this.activeSlide = activeSlide;
		this.slideType = slideType;

	}

	@Getter
	@Setter
	String activeSlide;
	@Getter
	@Setter
	String slideType;
	@Getter
	@Setter
	int presentationNumber;
	@Getter
	@Setter
	int slideNumber;

	@Override
	public String toString() {
		return "ActiveSlidePath [activeSlide=" + activeSlide + ", slideType=" + slideType + ", presentationNumber="
				+ presentationNumber + ", slideNumber=" + slideNumber + "]";
	}

}
