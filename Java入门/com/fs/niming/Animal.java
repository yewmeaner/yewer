package com.fs.niming;

public class Animal {//普通类
	public void sleep() {
		System.out.println("Animal sleep ...");
	}

}
class Dog extends Animal {
	@Override
	public void sleep() {
		System.out.println("Dog sleep ...");
	}
}