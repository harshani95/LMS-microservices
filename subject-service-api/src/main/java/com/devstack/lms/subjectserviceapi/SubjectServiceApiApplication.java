package com.devstack.lms.subjectserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class SubjectServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubjectServiceApiApplication.class, args);
	}

}
