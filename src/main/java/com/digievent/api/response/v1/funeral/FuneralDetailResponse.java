package com.digievent.api.response.v1.funeral;

public class FuneralDetailResponse {
	
	private String eventKey;
	
	private String eventType;
	
	private String title;
	
	private String fullName;
	
	private String birthDate;
	
	private String deathDate; 
	
	private String decesedBase64Image;
	
	private String scripture;
	
	private Undertaker undertaker;

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
	}

	public String getDecesedBase64Image() {
		return decesedBase64Image;
	}

	public void setDecesedBase64Image(String decesedBase64Image) {
		this.decesedBase64Image = decesedBase64Image;
	}

	public String getScripture() {
		return scripture;
	}

	public void setScripture(String scripture) {
		this.scripture = scripture;
	}

	public Undertaker getUndertaker() {
		return undertaker;
	}

	public void setUndertaker(Undertaker undertaker) {
		this.undertaker = undertaker;
	}

}
