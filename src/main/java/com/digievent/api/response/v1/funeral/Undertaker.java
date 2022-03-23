package com.digievent.api.response.v1.funeral;

public class Undertaker {
	
	private String shortName;
	
	private String tradingName;
	
	private String base64Logo;
	
	private String contactNumber;
	
	private String emailAddress;

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTradingName() {
		return tradingName;
	}

	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}

	public String getBase64Logo() {
		return base64Logo;
	}

	public void setBase64Logo(String base64Logo) {
		this.base64Logo = base64Logo;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
