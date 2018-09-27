package com.fs.plants;

public abstract class Car {
	public abstract void drive();

}

class Bike extends Car {

	@Override
	public void drive() {
		System.out.println("骑走");

	}

}

class Bus extends Car {

	@Override
	public void drive() {
		System.out.println("开走");

	}

}