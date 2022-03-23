package com.digievent.api.response.v1.program;

import java.util.List;

public class ProgramItemResponse {
	
	private String programName;
	
	private List<ProgramItem> programItems;

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public List<ProgramItem> getProgramItems() {
		return programItems;
	}

	public void setProgramItems(List<ProgramItem> programItems) {
		this.programItems = programItems;
	}

}
