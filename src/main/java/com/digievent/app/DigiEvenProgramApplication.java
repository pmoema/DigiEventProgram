package com.digievent.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.digievent" })
@EnableJpaRepositories("com.digievent.repository")
@EntityScan("com.digievent.entity")
public class DigiEvenProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigiEvenProgramApplication.class, args);
	}

}
