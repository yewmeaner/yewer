package com.fs.plantes;

public abstract class Car {
	public abstract void drive();

}

class Bus extends Car {

	@Override
	public void drive() {
		System.out.println("行驶");
	}

}