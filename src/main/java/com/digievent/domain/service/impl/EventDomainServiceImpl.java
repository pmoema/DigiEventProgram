package com.digievent.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digievent.domain.Event;
import com.digievent.domain.service.EventDomainService;
import com.digievent.repository.EventRepository;

@Service
public class EventDomainServiceImpl implements EventDomainService {
	
	
	private EventRepository eventRepository;
	
	
	@Autowired
	public EventDomainServiceImpl(EventRepository eventRepository) {
		
		this.eventRepository = eventRepository;
	}



	public Event getEvent(String eventKey) {
		
		Event eventDomain = new Event();
		
		com.digievent.entity.Event eventEntity = eventRepository.findByEventKey(eventKey);
		eventDomain.setEventKey(eventEntity.getEventKey());
		eventDomain.setEventTheme(eventEntity.getTheme().getThemeKey());
		
		return eventDomain;
	}

}
