package com.neusoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceDevApplication.class, args);
	}
}
