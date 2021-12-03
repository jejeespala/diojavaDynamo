package com.dcmarvel.apilive;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class ApiliveApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiliveApplication.class, args);
		System.out.println("vai se fuder");
	}

}
