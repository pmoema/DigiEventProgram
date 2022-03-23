package com.digievent.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.digievent" })
public class DigiEvenProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigiEvenProgramApplication.class, args);
	}

}
