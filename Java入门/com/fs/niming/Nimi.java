package com.fs.niming;

public class Nimi {
	public void fun() {
		Animal a = new Animal() {//普通类实现匿名内部类
			@Override
			public void sleep() {
				System.out.println();
			}
		};
		Computer c = new Computer() {//抽象类不能直接new对象，但可以实现匿名内部类
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				
			}
		};
		Mouse m = new Mouse() {//接口：不能直接new，但可以通过实现匿名内部类。实现抽象方法
			
			@Override
			public void click() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	public void m1(Animal a) {
		a.sleep();
	}
	public void m2(Computer c) {
		c.play();
	}
	public void m3(Mouse m) {
		m.click();
	}
}
