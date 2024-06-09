package com.app.cmdapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmdappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmdappApplication.class, args);
		System.out.println("Starter App");
	}

}
