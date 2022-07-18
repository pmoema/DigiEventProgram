package com.digievent.constants;

public enum OnlineStatus {
	
	
	LIVE("01"),
	SUSPENDED("02"),
	EXPIRED("03");


	private OnlineStatus(String statusCode) {
		this.statusCode = statusCode;
	}

	private String statusCode;
	
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

}
