package com.eWork.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenCicdJenkinsApplication {
	
	@GetMapping("/welcome")
	public String message() {
		return "jenkings tutorial mapping push repo";
	}

	public static void main(String[] args) {
		SpringApplication.run(MavenCicdJenkinsApplication.class, args);
	}

}
