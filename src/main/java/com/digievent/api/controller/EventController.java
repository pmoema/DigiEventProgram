package com.digievent.api.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.digievent.api.response.v1.event.EventResponse;
import com.digievent.domain.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {
	
	private static final Logger LOG = Logger.getLogger(EventController.class);
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping(path = "/{eventKey}", method = RequestMethod.GET)
	public EventResponse getEvent(@PathVariable("eventKey") String eventKey) {
		LOG.debug("EventKey " + eventKey);
		
		if(eventKey.equalsIgnoreCase("3")) {
			return new EventResponse(eventKey,  "WEDDING_BASIC");
		} else {
			return eventService.getEvent(eventKey);
			
		}
	
		
	}

}
