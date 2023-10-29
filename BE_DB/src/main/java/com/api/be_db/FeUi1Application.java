package com.api.be_db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@ComponentScan(basePackages = "com.api.be_db.controller")
public class FeUi1Application {

	public static void main(String[] args) {
		SpringApplication.run(FeUi1Application.class, args);
	}

}
