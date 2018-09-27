package com.fs.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDeme {
	
	public void m1() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		//添加键值对
		map.put("int", 123);
		map.put("char", 'A');
		map.put("string", "abcdefg");
		
		
		//foreach遍历
		Set<String> set = map.keySet();//得到一个Set集合，这个集合中装了所有的键名
		for (String key : set) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println("-------------------------------");
		
		
		//Iterator遍历
		Set<String> set2 = map.keySet();//得到一个Set集合，这个集合中装了所有的键名
		Iterator<String> it = set2.iterator();//通过Set集合得到一个Iterator对象
		while(it.hasNext()) {//判断是否 下一个键名存在
			String key = it.next();//取出键名
			System.out.println(key + "--" + map.get(key));//根据键名取出值
		}
		
	}

	public static void main(String[] args) {
		new MapDemo().m1();
	}

}