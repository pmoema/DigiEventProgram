package com.digievent.api.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

import com.digievent.api.response.v1.program.EventProgram;
import com.digievent.api.response.v1.program.ProgramItem;
import com.digievent.api.response.v1.program.ProgramItemResponse;
import com.digievent.api.response.v1.program.ProgramResponse;

@RestController
@RequestMapping("/programs")
public class ProgramController {
	
	private static final Logger LOG = Logger.getLogger(ProgramController.class);
	
	@RequestMapping(path = "/{eventKey}", method = RequestMethod.GET)
	public ProgramResponse getEventPrograms(@PathVariable("eventKey") String eventKey) {
		LOG.debug("getEventPrograms() eventKey is : " + eventKey);
		
		return mock();
		
	}
	

	@RequestMapping(path = "/items/{eventKey}/{programKey}", method = RequestMethod.GET)
	public ProgramItemResponse getProgramItems(@PathVariable("eventKey") String eventKey, @PathVariable("programKey") String programKey) {
		LOG.debug("getProgramItems() eventKey is : " + eventKey);
		
		return mockItem();
		
	}

	private ProgramItemResponse mockItem() {
		ProgramItemResponse response = new ProgramItemResponse();
		response.setProgramName("Church Service");
		List<ProgramItem> programItems = new ArrayList<>();
		List<String> itemActors = new ArrayList<String>();
		
		response.setProgramItems(programItems);
		
		ProgramItem programItem = new ProgramItem();
		programItem.setItemType("SPEACH");
		programItem.setItemName("Speach");
		programItem.setItemTypeDescription("Tribute by church"); 
		programItem.setItemActors(itemActors);
		itemActors.add("Mrs. Mmaramamredi");
		programItems.add(programItem);
		
		ProgramItem programItem2 = new ProgramItem();
		programItem2.setItemType("SPEACH");
		programItem2.setItemName("Speach");
		programItem2.setItemTypeDescription("Tribute by Friend"); 
		programItem2.setItemActors(itemActors);
		itemActors.add("Mrs. Mandidi");
		programItems.add(programItem2);
		
		ProgramItem programItem3 = new ProgramItem();
		programItem3.setItemType("SONG");
		programItem3.setItemName("Hymn");
		programItem3.setItemTypeDescription("Hymn by congregation"); 
		programItem3.setItemActors(itemActors);
		itemActors.add("Mr Matlala");
		programItems.add(programItem3);
		
		
		return response;
	}


	private ProgramResponse mock() {
		ProgramResponse response = new ProgramResponse();
		
		List<EventProgram> eventPrograms = new ArrayList<EventProgram>();
		
		EventProgram eventProgram1 = new EventProgram();
		eventProgram1.setProgramName("Church Service");
		eventProgram1.setMcFullname("Jimmy Motaung");
		eventProgram1.setLocation("Grace Bible Church");
		eventProgram1.setProgramKey("1a");
		eventPrograms.add(eventProgram1);
		
		EventProgram eventProgram2 = new EventProgram();
		eventProgram2.setProgramName("Burial Site");
		eventProgram2.setMcFullname("Jimmy Motaung");
		eventProgram2.setLocation("Wespark Cemetry");
		eventProgram2.setProgramKey("2a");
		eventPrograms.add(eventProgram2);
		
	
		
		response.setEventPrograms(eventPrograms);
		
		
		return response;
	}
	
	

}
