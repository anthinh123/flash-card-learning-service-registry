package com.thinh.flashcardlearningserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FlashCardLearningServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashCardLearningServiceRegistryApplication.class, args);
	}

}
