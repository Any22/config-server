package com.demo.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
		// access it through postman or browser via uri : http://localhost:8888/application/default
	}

}
/**************************************************************************************************************************************
 * Below are main projects of Spring Cloud
 * Spring Cloud Config: provides centralized configuration for client as well as server side in a distributed system . like we did in 
 * this app
 * Spring Cloud Consul: Helps in configuration management and Service discovery from HashiCorp Consul 
 * Spring Cloud Gateway : Provides library to implement API gateway on the top of Spring WebMVC or Spring Webflux
 * Spring Cloud Netflix: Integrarion with various Netflix OSS (Eureka , Hysterix and Zuul)
 * Spring Cloud Zookeeper: Apache Zookeper helps in configuration management and Service discovery
 * 
 * Features of Spring cloud(lightweight microservices framework) : 
 * - centralized configuration in a distributed system 
 * - Service registration and discovery 
 * - routing
 * - Load balancing 
 * - Circuit Breakers
 * - Asynchronous messaging
 *
**************************************************************************************************************************************/