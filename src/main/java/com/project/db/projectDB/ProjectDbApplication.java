package com.project.db.projectDB;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class ProjectDbApplication {

	private static ConfigurableApplicationContext applicationContext;


	public static void main(String[] args) {


		SpringApplication.run(ProjectDbApplication.class, args);


	}

}
