package ru.spi2.sibur_webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class SiburWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiburWebserviceApplication.class, args);
	}

}
