package com.fs.interior;
//用于实现不同接口同一方法名的不同方法
//内部类：类或方法中定义的的类，是类 ，有成员和方法，有成员，静态，局部和匿名四种
public class Cat implements Inf1 {
	public int s = 12;
	
	class Dog implements Inf2 {//内部类实现接口

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	static class Bird {//静态内部类
		static int a = 10;
		public static void fun() {
			System.out.println("Bird fun ...");
		}
	}
	public void test() {//访问静态内部类
		System.out.println(Bird.a);
	}
	
	public  void sun() {
		int c = 18;
		class Fly {//局部内部类，不能有权限修饰符修饰
			public void test1() {
				System.out.println(Cat.this.s);//访问外部类成员(外部类.this.)访问
				
				System.out.println(c);
			}
			
		}
		
	}

}
