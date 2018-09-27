package com.fs.plants;
//抽象工厂
public abstract class Factory {
	//抽象行为：子类具有此行为但结果不一致
	public abstract Car product();

}
//具体生产
class BikeFactory extends Factory {

	@Override
	public Car product() {

		return new Bike();
	}

}
//具体生产
class BusFactory extends Factory {

	@Override
	public Car product() {

		return new Bus();
	}

}