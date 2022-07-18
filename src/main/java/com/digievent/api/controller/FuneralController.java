package com.digievent.api.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.digievent.api.response.v1.funeral.FuneralDetailResponse;
import com.digievent.api.response.v1.funeral.GratituteResponse;
import com.digievent.api.response.v1.funeral.ObituaryResponse;
import com.digievent.api.response.v1.funeral.Undertaker;
import com.digievent.service.impl.FuneralDetailServiceImpl;

import java.io.IOException;
import java.io.InputStream;



@RestController
@RequestMapping("/funeral")
public class FuneralController {
	
	private static final Logger LOG = Logger.getLogger(FuneralController.class);
	
	@Autowired
	private FuneralDetailServiceImpl funeralDetailService;
	
	@RequestMapping(path = "/{eventKey}", method = RequestMethod.GET)
	public FuneralDetailResponse getFunerailDetails(@PathVariable("eventKey") String eventKey) {
		LOG.debug("getFunerailDetails() eventKey is : " + eventKey);
		
		FuneralDetailResponse response = funeralDetailService.getFuneralDetails(eventKey);
		
		return response;
	}
	
	@RequestMapping(path = "/header/{eventKey}", method = RequestMethod.GET)
	public Undertaker getHeaderDetails(@PathVariable("eventKey") String eventKey) {
		Undertaker undertaker = new Undertaker();
		undertaker.setBase64Logo(getLogo());
		undertaker.setShortName("Moisheng");
		undertaker.setContactNumber("012 543 3454");
		
		return undertaker;
	}
	
	
	@RequestMapping(path = "/obituary/{eventKey}", method = RequestMethod.GET)
	public ObituaryResponse getObituryDetails(@PathVariable("eventKey") String eventKey) {
		LOG.debug("getObituryDetails() eventKey is : " + eventKey);
		
		ObituaryResponse obituaryResponse = new ObituaryResponse();
		
		obituaryResponse.setObituaryImgBase64Image(getDeceased());
		obituaryResponse.setObituaryText("Musician and retired elementary school principal Sarah Jones’s love of life didn’t come to an end with her death. Sarah passed away on July 6, 2020 at the age of 79 after a courageous battle with cancer, surrounded by loved ones who will continue to honor her legacy by living their lives to the fullest.\n"
				
				+ "\n"
				+ "Sarah completed her Bachelor’s degree at the University of New York. After teaching for 10 years, she went back to school to complete a Master’s degree in Educational Leadership. Sarah’s pride was in her school and students, and she shared her passion for learning with thousands of children over the years.\n"
			
				+ "\n"
				+ "The simplest pleasures in life brought great joy to Sarah. She loved a quiet evening with friends and a glass of wine in hand. During school breaks Sarah often explored the local hiking trails and found beauty in the spring wildflowers. She had an uncanny ability to find happiness in her daily activities. Her pleasant personality was contagious to everyone she met. Sarah is survived by her husband, Frank; a son, Calvin; a sister, Jenny; and many cousins, nieces, and nephews.");
		
		return obituaryResponse;
	}
	
	
	@RequestMapping(path = "/gratitute/{eventKey}", method = RequestMethod.GET)
	public GratituteResponse getGratitudeDetails(@PathVariable("eventKey") String eventKey) {
		LOG.debug("getGratitudeDetails() eventKey is : " + eventKey);
		
		GratituteResponse gratituteResponse = new GratituteResponse();
		
		gratituteResponse.setThankyouImgBase64Image(getLogo());
		gratituteResponse.setThankyouText("Thank you so much for the condolences. We truly appreciated the warm words of comfort. You’re a true friend.");
		
		
		return gratituteResponse;
	}

	private String getLogo() {
		try {
			InputStream finput = new ClassPathResource("images/undertaker/moisheng/logo.png").getInputStream();
			byte[] imageBytes = new byte[(int)new ClassPathResource("images/undertaker/moisheng/logo.png").getFile().length()];
			finput.read(imageBytes, 0, imageBytes.length);
			finput.close();
			return Base64Utils.encodeToString(imageBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private String getDeceased() {
		try {
			InputStream finput = new ClassPathResource("images/undertaker/moisheng/shona.png").getInputStream();
			byte[] imageBytes = new byte[(int)new ClassPathResource("images/undertaker/moisheng/shona.png").getFile().length()];
			finput.read(imageBytes, 0, imageBytes.length);
			finput.close();
			return Base64Utils.encodeToString(imageBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
