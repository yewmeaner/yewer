package com.fs.set;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private char sex;

	public Student(int id, String name, char sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return id + ":" + name + ":" + sex;
	}

	@Override
	public int compareTo(Student o) {
		int i = this.id - o.id;
		if (i > 0) {
			return 1;// 升序排列
		} else if (i < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}