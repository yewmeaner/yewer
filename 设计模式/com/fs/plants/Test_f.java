package com.fs.plants;

public class Test_f {

	public static void main(String[] args) {
		//获得具体工厂对象
		Factory f = new BikeFactory();
		//通过工厂生产具体产品
		 Car c = f.product();
		 //通过产品调用产品中的具体方法
		c.drive();
	}

}
