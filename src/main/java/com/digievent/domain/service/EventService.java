package com.digievent.domain.service;

import org.springframework.stereotype.Service;

import com.digievent.api.response.v1.event.EventResponse;

@Service
public class EventService {

	public EventResponse getEvent(String eventKey) {
		return new EventResponse(eventKey,  "FUNERAL_BASIC");
	}

}
