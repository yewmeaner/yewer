package com.fs.plantes;

public abstract class Wheel {
	public abstract void run();

}
class CarWheel extends Wheel {

	@Override
	public void run() {
		System.out.println("汽车轮胎");
	}
	
}