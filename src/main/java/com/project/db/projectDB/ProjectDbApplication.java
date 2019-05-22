package com.project.db.projectDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProjectDbApplication {

	private static ConfigurableApplicationContext applicationContext;


	public static void main(String[] args) {


		SpringApplication.run(ProjectDbApplication.class, args);


	}

}
