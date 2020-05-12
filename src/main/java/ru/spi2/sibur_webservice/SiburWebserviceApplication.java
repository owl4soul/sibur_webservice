package ru.spi2.sibur_webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@EnableAutoConfiguration
@PropertySource(value = {
        "classpath:application.properties",
        "file:config/application.properties"},
        ignoreResourceNotFound = true)
public class SiburWebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SiburWebserviceApplication.class, args);
    }

}
