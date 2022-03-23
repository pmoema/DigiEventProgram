package com.digievent.api.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.digievent.api.response.PingResponse;


@RestController
@RequestMapping("/")
public class PingController {

	protected static final Logger LOG = Logger.getLogger(PingController.class.getName());
    
	@RequestMapping(path = "ping", method = RequestMethod.GET)
	public PingResponse ping() {
		LOG.debug("method - ping()");
	
		return new PingResponse("localhost",  "Digi Event Program");
	}

}