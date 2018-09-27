package com.fs.plantes;

public class Test_Factory {
	public static void main(String[] args) {
		Factory f = new CarFactory();
		Car c = f.productCar();
		c.drive();
	}

}
