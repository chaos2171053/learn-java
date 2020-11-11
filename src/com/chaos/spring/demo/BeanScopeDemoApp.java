package com.chaos.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alCoach = context.getBean("myCoach", Coach.class);

		// check if they are the same
		Boolean result = (theCoach == alCoach);

		System.out.println("\nPointing to the same object " + result);

		System.out.println("\nMemory location for theCoach " + theCoach);

		System.out.println("\nMemory location for alCoach " + alCoach);

		context.close();

	}

}
