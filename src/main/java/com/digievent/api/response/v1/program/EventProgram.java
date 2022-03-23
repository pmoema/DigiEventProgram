package com.digievent.api.response.v1.program;

public class EventProgram {
	
	private String programKey;
	
	private String programName;
	
	private String mcFullname;
	
	private String location;
	
	private boolean active;

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getMcFullname() {
		return mcFullname;
	}

	public void setMcFullname(String mcFullname) {
		this.mcFullname = mcFullname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProgramKey() {
		return programKey;
	}

	public void setProgramKey(String programKey) {
		this.programKey = programKey;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
