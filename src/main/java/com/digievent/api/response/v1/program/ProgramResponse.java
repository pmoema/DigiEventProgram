package com.digievent.api.response.v1.program;

import java.util.List;

public class ProgramResponse {
	
	private List<EventProgram> eventPrograms;

	public List<EventProgram> getEventPrograms() {
		return eventPrograms;
	}

	public void setEventPrograms(List<EventProgram> eventPrograms) {
		this.eventPrograms = eventPrograms;
	} 

}
