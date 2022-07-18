package com.digievent.service;

import com.digievent.api.response.v1.event.EventResponse;
import com.digievent.exception.ServiceException;

public interface EventService {

	EventResponse getEvent(String eventKey) throws ServiceException;

}

