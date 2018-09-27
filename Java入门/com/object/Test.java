package com.object;

public class Test {
	//子类不能比父类条件严格，不能抛出的异常比父类多
	public static void main(String[] args) {
		Student s = new Student();
		s.eat();
	}

}
