package com.glv.org.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class GestionLocationVoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionLocationVoitureApplication.class, args);
	}

}
