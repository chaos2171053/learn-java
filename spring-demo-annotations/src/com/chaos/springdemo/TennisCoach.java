package com.chaos.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> TennisCoach inside default constuctor");
	}

//	public TennisCoach(FortuneService thefortuneService) {
//		System.out.println(">> TennisCoach inside default constuctor");
//	}

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
