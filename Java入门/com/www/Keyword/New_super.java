package com.www.Keyword;
//super()出现在子类第一行
public class New_super {
	public int a = 10;

	public New_super() {
		System.out.println("人瘦尚可肥");
	}
	
	public New_super(int a) {
		System.out.println("月下飞天镜");
	}
	
	public void m1() {
		System.out.println("古道西风瘦马");
	}

}
class New_su extends New_super{
	public int a = 12;
	
	public New_su() {
		//super();默认调用父类无参构造器
		System.out.println("世俗不可医");
	}
	
	public New_su(int aa) {
		/*
		 * super(20);//调用父类带参的构造方法
         */		
		System.out.println("云生结海楼");
	}
	
	public void test() {
		System.out.println(super.a);//调用父类变量
		super.m1();//调用父类方法
	}
	
	@Override
	public void m1() {
		super.m1();//调用父类方法
		System.out.println("夕阳西下");
	}
	
}