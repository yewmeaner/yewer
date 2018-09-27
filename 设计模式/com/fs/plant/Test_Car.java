package com.fs.plant;

public class Test_Car {
	public static void main(String[] args) {
		Car c = Factory.product(1);
		c.drive();
	}

}
