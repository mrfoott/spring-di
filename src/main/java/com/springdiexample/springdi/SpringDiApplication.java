package com.springdiexample.springdi;

import com.springdiexample.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringDiApplication.class, args);

		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println("This is from main method!!!");

		System.out.println(myController.hiMom());
	}

}
