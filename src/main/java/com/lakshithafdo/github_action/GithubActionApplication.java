package com.lakshithafdo.github_action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GithubActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionApplication.class, args);
	}


}
