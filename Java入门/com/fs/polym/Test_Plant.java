package com.fs.polym;

public class Test_Plant {
	public static void main(String[] args) {
		// 父类引用指向父类
		Plant p = new Plant();
		p.grow();
		// 子类引用指向子类
		Flower f = new Flower();
		f.grow();
		
		// 子类引用指向父类对象
		/* 错误 Flower f2 = new Plant();
		 */
		
		/*父类引用指向子类对象（向上转型）（自动类型转换）
		调用的变量是父类中的，调用的方法子类若有重写，
		则是子类中的，不然则是父类中的。*/
		Plant p2 = new Flower();
		System.out.println(p2.a);//父类变量
		p2.grow();//子类中重写的方法
		p2.sprout();//父类中方法
		
		//向下转型（强制类型转换）
		Flower fl = (Flower)p2;
		System.out.println(fl.b);
		
		/*//错误：不能访问子类中特有成员
		System.out.println(p2.b);
		p2.result();*/
	}

}
