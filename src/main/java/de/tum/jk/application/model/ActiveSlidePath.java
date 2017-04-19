package de.tum.jk.application.model;

import lombok.Getter;
import lombok.Setter;

public class ActiveSlidePath {

	public ActiveSlidePath() {

	}



	public ActiveSlidePath(String pptslide, String keyslide, String devslide) {
		super();
		this.pptslide = pptslide;
		this.keyslide = keyslide;
		this.devslide = devslide;
		
	}



	@Getter
	@Setter
	String pptslide;
	@Getter
	@Setter
	String keyslide;
	@Getter
	@Setter
	String devslide;
	
	@Getter
	@Setter
	int presentationNumber;
	@Getter
	@Setter
	int slideNumber;
	@Override
	public String toString() {
		return "ActiveSlidePath [pptslide=" + pptslide + ", keyslide=" + keyslide + ", devslide=" + devslide + ", presentationNumber=" + presentationNumber + ", slideNumber="
				+ slideNumber + "]";
	}
	
	
}
