package com.fs.file;

import java.io.Serializable;

/*
 * javaBean:
 * 1.私有化成员变量
 * 2.提供set/get方法
 * 3.实现Serializable接口
 * 4.必须有公有无参构造器
 */
public class Student implements Serializable {
	private String name;
	private int age;
	private char sex;

	public Student() {
		super();
	}

	public Student(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

}
