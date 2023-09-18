package com.example.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOpsAssignmentApplication {

	public static void main(String[] args) {
		System.out.print("This is an application for DevOps pipeline");
		SpringApplication.run(DevOpsAssignmentApplication.class, args);
	}

}
