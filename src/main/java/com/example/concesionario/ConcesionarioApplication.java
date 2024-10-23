package com.example.concesionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.concesionario")
public class ConcesionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcesionarioApplication.class, args);
	}

}
