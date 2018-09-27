package com.fs.niming;
//好处：new 匿名 更快，匿名用完就回收
public class Test_Nimi {
	public static void main(String[] args) {
		Nimi n = new Nimi();
		n.m1(new Animal());
		n.m1(new Dog());//向上转型
		n.m1(new Animal() {
			public void sleep() {
				System.out.println("匿名内部类的方法");
			}
		});
		System.out.println("--------------------");
		n.m2(new Game());
		n.m2(new Computer() {
			
			@Override
			public void play() {
				System.out.println("匿名内部类");
				
			}
		});
		System.out.println("=======================");
		n.m3(new Len());
		n.m3(new Mouse() {
			
			@Override
			public void click() {
				System.out.println("接口内部类");
				
			}
		});
	}

}
