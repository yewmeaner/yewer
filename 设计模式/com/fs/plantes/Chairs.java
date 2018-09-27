package com.fs.plantes;

public abstract class Chairs {
	public abstract void shape();

}

class CarChairs extends Chairs {

	@Override
	public void shape() {
		System.out.println("汽车座椅");
	}

}