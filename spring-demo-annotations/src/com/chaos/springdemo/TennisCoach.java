package com.chaos.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> TennisCoach inside default constuctor");
	}

	// define my init method

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach inside doMyStartupStuff");
	}

	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach inside doMyCleanupStuff");
	}

	// define a setter method
	@Autowired
//	public void doSomeCrazyStudff(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach inside doSomeCrazyStudff method");
//		fortuneService = theFortuneService;
//
//	}

//	@Autowired
//	public TennisCoach(FortuneService thefortuneService) {
//		fortuneService = thefortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "TennisCoach:Pracitce your backhand volley 6666";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
