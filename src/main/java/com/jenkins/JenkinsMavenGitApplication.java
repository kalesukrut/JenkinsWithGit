package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsMavenGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsMavenGitApplication.class, args);
	}
	
	@RequestMapping("/")
	public String msg() {
		
		return "Started";
	}

}
