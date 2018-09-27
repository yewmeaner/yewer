package com.www.Keyword;
//final特点：
//1.修饰的类不能被继承；
//2.修饰的方法不能重写，可以继承；
//3.修饰常量不能修改，表示常量，而且必须赋值。
//4.不能修饰构造方法。
//final功能：
//1.防止修改；
//2.高效，编译器调final修饰的方法时，会转入内嵌机制，提高执行效率，
public class New_Final {
	public final void m1() {
		System.out.println("Hello,world !");
	}
	
	public static void main(String[] args) {
		New_Final a = new New_Final();
		a.m1();
	}
}
class Tom extends New_Final{
	/*public void m1() {
		System.out.println("not final");//不能继承
	}*/
	
}
