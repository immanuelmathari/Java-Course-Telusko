package com.immanuel.mySecondApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySecondAppApplication {

	public static void main(String[] args) {
		/* 
		SpringApplication.run(MySecondAppApplication.class, args);

		// 12.11.25
		// Note 01. but how do we get this from the container without doing this
		Dev obj = new Dev();
		obj.build();
		*/

		// Note 02
		ApplicationContext context = SpringApplication.run(MySecondAppApplication.class, args);

		Dev obj = context.getBean(Dev.class);

		obj.build();
	}

}
