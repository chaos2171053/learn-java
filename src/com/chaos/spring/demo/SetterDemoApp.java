package com.chaos.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean form spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call method on bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		// call our new methods to get the literal values
		System.out.println(theCoach.getTeam());

		System.out.println(theCoach.getEmailAddress());

		// close the context
		context.close();

	}

}
