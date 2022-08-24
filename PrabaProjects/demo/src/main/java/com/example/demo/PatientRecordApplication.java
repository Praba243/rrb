package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class PatientRecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientRecordApplication.class, args);
	}

}
