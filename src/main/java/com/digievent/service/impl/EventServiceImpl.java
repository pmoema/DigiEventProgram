package com.digievent.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digievent.api.response.v1.event.EventResponse;
import com.digievent.domain.Event;
import com.digievent.domain.service.EventDomainService;
import com.digievent.exception.ServiceException;
import com.digievent.service.EventService;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventDomainService eventDomainService;

	@Override
	public EventResponse getEvent(String eventKey) throws ServiceException {
		
		Event event = eventDomainService.getEvent(eventKey);
		
		return new EventResponse(event.getEventKey(), event.getEventTheme());
		
	}

}
