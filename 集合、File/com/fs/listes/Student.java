package com.fs.listes;

public class Student implements Comparable<Student>{

	private int age;
	private String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}

	//指定排序规则
	@Override
	public int compareTo(Student o) {
//		//根据age进行排序
//		int r = this.age - o.age;
//		if(r > 0) {
//			return 1;//升序排列
//		} else if(r < 0) {
//			return -1;
//		} else {
//			return 0;
//		}
		
		//根据name来排序
		int r = this.name.compareTo(o.name);
		if(r > 0) {
			return -1;//降序排列
		} else if(r < 0) {
			return 1;
		} else {
			return 0;
		}
		
	}

}