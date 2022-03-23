package com.digievent.service;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import com.digievent.api.response.v1.funeral.FuneralDetailResponse;
import com.digievent.api.response.v1.funeral.Undertaker;

@Service
public class FuneralDetailService {

	public FuneralDetailResponse getFuneralDetails(String eventKey) {
		FuneralDetailResponse response = new FuneralDetailResponse();
		response.setEventKey(eventKey);
		response.setEventType("FUNERAL_BASIC");
		response.setTitle("In Living Memory");
		response.setFullName("Andrew Shona Ferguson");
		response.setBirthDate("30 April 1974");
		response.setDeathDate("30 July 2021");
		response.setScripture("2 Timothy 4:7");
		response.setDecesedBase64Image(getDeceased());
		
		Undertaker undertaker = new Undertaker();
		undertaker.setBase64Logo(getLogo());
		undertaker.setShortName("Moisheng");
		undertaker.setContactNumber("012 543 3454");
		
		response.setUndertaker(undertaker);
		
		return response;
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
