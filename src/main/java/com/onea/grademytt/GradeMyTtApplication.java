package com.onea.grademytt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({ "classpath:${envTarget:}.properties" })
public class GradeMyTtApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradeMyTtApplication.class, args);
	}

}

