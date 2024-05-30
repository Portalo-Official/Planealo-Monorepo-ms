package com.planealo.negocio.customers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustumersApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustumersApplication.class, args);
	}

}
