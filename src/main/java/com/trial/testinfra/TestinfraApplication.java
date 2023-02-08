package com.trial.testinfra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestinfraApplication {

	
	@GetMapping("/message")
	public String message() {
		return "Spring App is Deployed n Azure";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestinfraApplication.class, args);
	}

}
