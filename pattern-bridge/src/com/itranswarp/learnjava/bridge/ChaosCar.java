package com.itranswarp.learnjava.bridge;

public class ChaosCar extends RefinedCar {

	public ChaosCar(Engine engine) {
		super(engine);
	}

	@Override
	public String getBrand() {
		return "ChaosCar";
	}

}
