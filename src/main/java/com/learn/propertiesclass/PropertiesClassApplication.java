package com.learn.propertiesclass;

import com.learn.propertiesclass.properties.RestProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({RestProperties.class})
public class PropertiesClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertiesClassApplication.class, args);
	}

}
