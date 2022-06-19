package com.example.americanbistro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AmericanbistroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmericanbistroApplication.class, args);
	}
}