package com.www.Keyword;

public class New_this {
	public String name;
	public int age;
	public void m1() {
		//this表示当前类对象，谁调用指代谁
		this.name = "张珊";
		this.age = 18;
	}
	public void m2(int age) {
		this.age = age;//区分成员变量与局部变量
	}
	public void test() {
		this.m2(20);
	}
	public void m3(New_this s) {
		
	}
	//this作为实参，表示的是调用该方法的对象
	public void test_m3() {
		System.out.println(this);
		this.m3(this);
	}
	//this作为返回值，表示返回调用该方法的对象
	public New_this let() {
		age ++;
		return this;
		
	}

}
