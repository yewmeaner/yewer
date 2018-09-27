package com.fs.interior;
//匿名内部类：1、成员变量赋值时创建2、方法内部定义并直接使用3、在方法、参数位置创建
public class Cryptonym {
	Animal a = null;//声明引用变量时使用默认值null
	Animal a1 = new Animal();//声明引用变量时就创建对象
	//明引用变量并创建匿名内部类对象:"new 类名(){}"
	Animal a2 = new Animal() {
		@Override
		public void eat() {
			
		}
	};
	public void fun() {
		
		new Animal() {};
		Animal a = new Animal() {
			@Override
			public void eat() {
				System.out.println("匿名内部类eat ...");
				
			}
		};
		a.eat();
		
	}
	public void sun(Animal a) {
		a.eat();
	}
	public static void main(String[] args) {
		new Cryptonym().sun(new Animal() {
			
		});//在方法参数位置
	}

}
