package com.chaos.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	private FortuneService fortuneService;

	@Autowired
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TennisCoach:Pracitce your backhand volley 6666";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
