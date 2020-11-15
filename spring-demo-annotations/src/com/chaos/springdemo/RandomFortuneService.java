package com.chaos.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { "chaos 666", "chaos 2171053", "banzhuanzhai" };

	// crate a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {

		// pick a random string from the array

		int index = myRandom.nextInt(data.length);

		String theFortuneString = data[index];

		return theFortuneString;
	}

}
