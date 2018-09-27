package com.fs.reflect;

import java.util.Date;

public class Stu {
	public String name;
	public void show() {
		System.out.println(this.name);
	}
	public Stu() {
		System.out.println("Stu()...." );
	}
	public Stu(String name, Date date) {
		this.name = name;
	}
}