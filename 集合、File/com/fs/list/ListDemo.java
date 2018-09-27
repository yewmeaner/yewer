package com.fs.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


/**
 * 接口：List
 * 实现类：
 * 	（1）ArrayList（底层是数组，查询、修改元素时较快）  
 * 	（2）LinkedList（底层是链表，增加、删除元素时速度较快）  
 * 	（3）Vector（底层也是数组，线程安全的）
 * 
 * 1、使用泛型<E>指定集合中元素的类型
 * 2、可以添加任意类型的数据，用Object表示，如果是基本数据类型，则用封装类表示
 * 3、添加元素的顺序与集合中存储数据的顺序相同
 * 4、集合中可以存在重复的元素
 * 5、可以添加null值，但排序时不能使用
 * 
 *
 */
public class ListDemo {
	
	//ArrayList 的使用
	public void m1() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("abc");//向集合中添加元素
		list.add("你好");
		list.add("123");
		list.add("abc");
		
		System.out.println("集合的大小是：" + list.size());//获得集合的大小
		System.out.println(list);
		
		list.remove(3);//根据下标移除一个元素
		System.out.println("移除元素后：" + list);
		
		System.out.println(list.get(1));//根据下标得到一个元素
		
		list.clear();//清空集合中所有的元素
		System.out.println("清空集合后：" + list);
		
	}
	
	//LinkedList的使用
	public void m2() {
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(123);
		list.add(456);
		list.add(123);
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println("移除元素后：" + list);
		
		System.out.println(list.get(1));
		
		list.clear();
		System.out.println("清空元素后：" + list);
		
	}
	
	//Vector的使用
	public void m3() {
		
		List<Student> list = new Vector<Student>();
		
		list.add(new Student(20, "张三"));//添加一个对象到集合中
		
		list.add(new Student(500, "孙悟空"));
		
		Student stu = new Student(100, "唐森");
		list.add(stu);
		list.add(stu);
		
		System.out.println(list);
	}
	
	//存储任意类型的数据
	public void m4() {
		
		List<Object> list = new ArrayList<Object>();
		list.add(123);//整形
		list.add("abc");//字符串
		list.add(true);//布尔类型
		list.add(new Student(20, "小明"));//对象
		list.add(null);
		
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		new ListDemo().m4();
	}

}