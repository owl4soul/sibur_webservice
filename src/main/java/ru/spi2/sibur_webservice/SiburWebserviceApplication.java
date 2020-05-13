package ru.spi2.sibur_webservice;

import org.apache.log4j.Logger;
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

    private static final Logger LOGGER = Logger.getLogger(SiburWebserviceApplication.class);

    public static void main(String[] args) {
        try {
            LOGGER.info("---------START----------");
            SpringApplication.run(SiburWebserviceApplication.class, args);
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }

}
