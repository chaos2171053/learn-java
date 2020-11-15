package com.chaos.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ChaosFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "I am Chaos";
	}

}
