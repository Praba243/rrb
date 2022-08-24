package com.patProj.patAppoinment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.patProj.patAppoinment")
public class PatAppoinmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatAppoinmentApplication.class, args);
	}

}
