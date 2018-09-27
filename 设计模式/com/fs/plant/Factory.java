package com.fs.plant;

public class Factory {
	static Car c = null;

	public static Car product(int i) {
		switch (i) {
		case 1:
			c = new Bike();
			break;
		case 2:
			c = new Bus();
			break;

		default:
			break;
		}
		return c;
	};

}
