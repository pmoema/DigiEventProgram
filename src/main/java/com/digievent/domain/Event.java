package com.digievent.domain;

import com.digievent.constants.OnlineStatus;

public class Event {
	
	private String eventKey;
	
	private String eventTheme;
	
	private OnlineStatus onlineStatus;

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	public String getEventTheme() {
		return eventTheme;
	}

	public void setEventTheme(String eventTheme) {
		this.eventTheme = eventTheme;
	}

	public OnlineStatus getOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(OnlineStatus onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

}
