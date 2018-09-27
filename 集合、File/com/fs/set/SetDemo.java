package com.fs.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 接口:Set
 * 实现类：HashSet  TreeSet（排序）
 * 1、元素的添加顺序与存储顺序无关
 * 2、不能存在重复的元素
 * 3、TreeSet在添加元素时会对元素进行排序
 *
 */
public class SetDemo {
	
	//HasSet的使用
	public void m1() {
		
		Set<Character> set = new HashSet<Character>();
		set.add('c');
		set.add('w');
		set.add('f');
		set.add('t');
		set.add('a');
		
		System.out.println(set);
	}
	
	//TreeSet的使用；对String类型排序
	public void m2() {
		Set<String> set = new TreeSet<String>();
		set.add("good");
		set.add("abc");
		set.add("fault");
		set.add("truw");
		set.add("qustion");
		set.add("abc");
		
		
		System.out.println(set);
	}
	
	//TreeSet的使用：对整形（基本类型）排序
	public void m3() {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(12);
		set.add(8);
		set.add(50);
		set.add(22);
		set.add(3);
		
		System.out.println(set);
	}
	
	//TreeSet的使用：对自定义类型排序：要求该类实现Comparable接口，并重写方法定义排序规则
	public void m4() {
		Set<Student> set = new TreeSet<Student>();
		
		set.add(new Student(1, "Jack", '男'));
		set.add(new Student(3, "Wukong", '男'));
		set.add(new Student(2, "Tom", '女'));
		set.add(new Student(4, "Rose", '女'));
		
		System.out.println(set);
		
	}

	public static void main(String[] args) {
		new SetDemo().m4();
	}

}