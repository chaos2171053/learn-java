package com.chaos.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnonotationBeanScopeDemoApp {
	public static void main(String[] args) {
		// load spring config file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// print out the results
		boolean result = (theCoach == alphaCoach);

		System.out.println("\nPointing the same object: " + result);

		System.out.println("\nMemory location for theCoach: " + theCoach);

		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

		// close the context

		context.close();

	}

}
