package com.fs.plantes;
//抽象工厂类
public abstract class Factory {
	//生产类的实例
	public abstract Chairs productChairs();

	public abstract Wheel productWheel();

	public abstract Car productCar();

}
//具体工厂类
class CarFactory extends Factory {

	@Override
	public Chairs productChairs() {

		return new CarChairs();
	}

	@Override
	public Wheel productWheel() {

		return new CarWheel();
	}

	@Override
	public Car productCar() {

		return new Bus();
	}

}