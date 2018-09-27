package com.fs.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	
	//HashMap的使用
	public void m1() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		//添加键值对
		map.put("int", 123);
		map.put("char", 'A');
		map.put("string", "abcdefg");
		map.put("obj", new Student(0, null));
		
		System.out.println(map);
		
		
		map.remove("obj");//根据键名移除键值对
		System.out.println("移除元素后:" + map);
		
		System.out.println(map.get("int"));//根据键名获得值
		
		map.clear();//清空集合中的所有键值对
		System.out.println("清空map后:" + map);
	}
	
	//TreeMap的使用：对基本类型排序
	public void m2() {
		Map<Integer, Object> map = new TreeMap<Integer, Object>();
		
		map.put(3, "abc");
		map.put(5, true);
		map.put(1, 'A');
		map.put(2, 123);
		map.put(6, 1.2f);
		
		System.out.println(map);
	}
	
	//TreeMap的使用：对String类型排序
	public void m3() {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("a", 23);
		map.put("c", 54);
		map.put("b", 1);
		map.put("z", 8653);
		map.put("w", 5);
		
		System.out.println(map);
	}
	
	//TreeMap的使用：对自定义类型排序
	public void m4() {
		Map<Student, Object> map = new TreeMap<Student, Object>();
		
		map.put(new Student(1, "haha"), true);
		map.put(new Student(4, "apple"), 123);
		map.put(new Student(2, "jack"), "dasfja");
		map.put(new Student(3, "rose"), 4.1f);
		
		System.out.println(map);
	}

	public static void main(String[] args) {
		new MapDemo().m4();
	}

}