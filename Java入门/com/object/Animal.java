package com.object;

public class Animal {
	public void eat() {
		System.out.println("animal eat...");
	}
	public static void main(String[] args) {
		Eagle e = new Eagle();
		e.eat();//只能单继承，但可以间接继承实现多个方法
		//构造器不能被继承
	}

}
class Birds extends Animal{
	public void fly() {
		System.out.println("birds fly...");
	}
}
class Eagle extends Birds{
	@Override
	public void fly() {
		System.out.println("eagle fly...");//重写
	}
}