package com.www.Keyword;

public class Qualifier {//public修饰：任何类可用
	//权限修饰符只影响作用域，不影响生命周期
	//修饰类，方法，构造器
	private int a= 10;//当前类访问
	int b = 20;//当前类和同包类访问
	protected int c = 30;//当前类和同包类以及子类访问
	public int d = 40;//任何类可访问
	
	
	
	
	private Qualifier(int i) {
		
	}
	Qualifier(char c) {
		
	}
	protected Qualifier(String s) {
		
	}
	public Qualifier(Object o) {
		
	}

}//成员变量和成员方法、构造器（方法）类似
class Color{//default修饰：同包使用
	
}