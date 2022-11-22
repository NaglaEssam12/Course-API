package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This the start point
@SpringBootApplication
public class CourseApiApp {

	//First Step: I want to tell the compiler that is a springboot project so I will use annotations
	public static void main(String[] args) {
		
		//Servlet Container
		// When the application starter, there is application context created
		SpringApplication.run(CourseApiApp.class, args);
	}

}
