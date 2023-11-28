package com.springdiexample.springdi;

import com.springdiexample.springdi.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringDiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowiredOfController() {
		System.out.println(myController.hiMom());
	}

	@Test
	void testGetControllerFromAct() {
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.hiMom());
	}

	@Test
	void contextLoads() {
	}

}
