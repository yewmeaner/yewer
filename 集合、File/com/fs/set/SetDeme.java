package com.fs.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDeme {

	public void m1() {
		
		Set<String> set = new HashSet<String>();
		set.add("apple");
		set.add("qustion");
		set.add("answer");
		set.add("baidu");
		set.add("message");
		
		System.out.println("foreach遍历");
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("-----------------------------------------");
		
		
		
		
		System.out.println("Iterator遍历");
		Iterator<String> it = set.iterator();//通风Set对象获得Iterator迭代器对象
		while(it.hasNext()) {//判断是否存在下一个元素
			System.out.println(it.next());//取出元素
		}
		
	}
	
	public static void main(String[] args) {
		new SetDemo().m1();
	}

}