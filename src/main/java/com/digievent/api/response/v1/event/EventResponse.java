package com.digievent.api.response.v1.event;

public class EventResponse {
	
	private String eventKey;
	
	private String eventType;

	public EventResponse(String eventKey, String eventType) {
		this.eventKey = eventKey;
		this.eventType = eventType;
	}

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
	
}
