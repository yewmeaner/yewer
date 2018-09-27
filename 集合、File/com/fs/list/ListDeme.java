package com.fs.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDeme {
	
	public void m1() {
		List<String> list = new ArrayList<String>();
		
		list.add("abc");
		list.add("你好");
		list.add("小明");
		list.add("123");
		
		//for循环遍历
		System.out.println("for循环遍历");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		System.out.println("----------------------------");
		
		//foreach遍历
		/**
		 * String：表示集合中元素的数据类型
		 * str：表示遍历后得到的每一个元素
		 * list:表示遍历的集合对象
		 */
		System.out.println("foreach遍历");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("======================");
		
		
		//Iterator遍历
		System.out.println("Iterator遍历");
		Iterator<String> it = list.iterator();//得到Iterator迭代器对象
		while(it.hasNext()) {//通过it对象判断是否存在下一个元素
			System.out.println(it.next());//如果存在，则取出这个元素
		}
		
	}
	
	public static void main(String[] args) {
		new ListDeme().m1();
	}
}