package com.www.Keyword;

public class Test_this {
	public static void main(String[] args) {
		New_this s = new New_this();
		/*
		 * System.out.println("调用前:" + s.name +":"+s.age); s.m1();
		 * System.out.println("调用后:" + s.name +":"+s.age);
		 */

		/*
		 * s.test_m3(); System.out.println(s);
		 */

		System.out.println(s);

		New_this s1 = s.let();
		System.out.println(s1);
		System.out.println(s1.age);//默认为0

		New_this s2 = s.let().let().let().let().let();
		System.out.println(s2.age);

	}

}
