package com.chaos.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellowSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();

	}

}
