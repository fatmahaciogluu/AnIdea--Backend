package com.anidea.AnIdeaWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude =SecurityAutoConfiguration.class)
public class AnIdeaWebAppApplication{

	public static void main(String[] args) {
		SpringApplication.run(AnIdeaWebAppApplication.class, args);
	}

}
