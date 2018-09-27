package com.www.Keyword;
//有抽象方法的类必为抽象类，抽象类中不一定有抽象方法
//没有足够的信息；进行类型隐藏需要抽象类.
public abstract class New_Abstract {
	public abstract void eat();//抽象类,天生用来被继承
	public abstract void sleep();

}
class One extends New_Abstract{//普通类继承抽象类，必须实现抽象类中所有抽象方法
	@Override
	public void eat() {
		System.out.println("我要吃吃吃，不要胖胖胖！");
	}
	@Override
	public void sleep() {
		System.out.println("熬夜会伤肝，起床黑眼圈！");
	}	
}
//抽象类继承抽象类 ，子类继承抽象类时，若有抽象方法没有实现，则继续抽象
abstract class Two extends New_Abstract{
	
}