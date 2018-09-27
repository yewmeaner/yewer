package com.fs.reflect;

import java.lang.reflect.Constructor;
import java.util.Date;

public class Test {
	// Class.forName("全类名")
	public void m1() throws Exception {
		Class c = Class.forName("com.fs.reflect.Stu");
	}

	// 类名.class
	public void m2() {
		Class c = Stu.class;
	}

	// 对象.getClass
	public void m3() {
		Class c = new Stu().getClass();
	}

	// Class对象.newInstances();
	public void m4() throws Exception {
		Class c = Class.forName("com.fs.reflect.Stu");
		Stu stu = (Stu) c.newInstance();
		stu.name = "xena";
		stu.show();// xena
	}

	// Class对象.newInstances();
	public void m5() throws Exception {
		Class<Stu> c = (Class<Stu>) Class.forName("com.fs.reflect.Stu");
		Stu stu = c.newInstance();
		stu.name = "xena";
		stu.show();// xena
	}

	// 创建Construct对象,再通过Construct实例方法newInstance(....)
	public void m6() throws Exception {
		Class c = Class.forName("com.fs.reflect.Stu");
		// 得到Construct对象,代表无参构造方法
		Constructor con = c.getConstructor();
		Stu stu = (Stu) con.newInstance();
		stu.name = "xena";
		stu.show();// xena
	}

	// 创建Construct对象,再通过Construct实例方法newInstance(....)
	public void m7() throws Exception {
		Class<Stu> c = (Class<Stu>) Class.forName("com.fs.reflect.Stu");
		// 得到Construct对象,代表无参构造方法
		Constructor<Stu> con = c.getConstructor();
		Stu stu = con.newInstance();
		stu.name = "xena";
		stu.show();// xena
	}
	
	public void m8() throws Exception {
		Class c = Class.forName("com.fs.reflect.Stu");
		//代表有参构造方法
		Constructor con = c.getConstructor(String.class, Date.class);
		Stu stu = (Stu) con.newInstance("小明", new Date());
		System.out.println(stu.name);
	}
	
	public void m9() throws Exception {
		Class<Stu> c = (Class<Stu>) Class.forName("com.fs.reflect.Stu");
		//代表有参构造方法
		Constructor<Stu> con = c.getConstructor(String.class, Date.class);
		Stu stu = con.newInstance("小明", new Date());
		System.out.println(stu.name);
	}

	public static void main(String[] args) throws Exception {
		new Test().m4();
	}
}