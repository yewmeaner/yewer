package com.fs.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listdemo {
	
	//对整形数据（基本类型）排序
	public void m1() {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(12);
		list.add(3);
		list.add(67);
		list.add(20);
		list.add(46);
		System.out.println("排序前：" + list);
		
		
		Collections.sort(list);
		System.out.println("排序后：" + list);
		
		Collections.reverse(list);
		System.out.println("倒置后：" + list);
		
		Collections.shuffle(list);
		System.out.println("洗牌后：" + list);
	}

	//对String类进行排序
	public void m2() {
		List<String> list = new ArrayList<String>();
		list.add("www");
		list.add("good");
		list.add("day");
		list.add("up");
		list.add("apple");
		
		System.out.println("排序前：" + list);
		
		Collections.sort(list);
		System.out.println("排序后：" + list);
	}
	
	//对自定义类进行排序：需要该类实现Comparable接口，并重写方法指定排序规则
	public void m3() {
		List<Student> list = new LinkedList<Student>();
		
		list.add(new Student(20, "Tom"));
		list.add(new Student(18, "Zero"));
		list.add(new Student(30, "Jack"));
		list.add(new Student(25, "Hidi"));
		list.add(new Student(10, "Rose"));
		
		System.out.println("排序前：" + list);
		
		Collections.sort(list);
		System.out.println("排序后：" + list);
	}
	
	
	public static void main(String[] args) {
		new Listdemo().m3();
	}

}