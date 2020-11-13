package com.chaos.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Pracitce your backhand volley 6666";
	}

}
