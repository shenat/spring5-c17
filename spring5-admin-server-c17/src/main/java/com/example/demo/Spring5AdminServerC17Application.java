package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
//启用spring boot admin
@EnableAdminServer
public class Spring5AdminServerC17Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring5AdminServerC17Application.class, args);
	}

}
